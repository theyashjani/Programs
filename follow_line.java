import ch.aplu.robotsim.*;

public class Robotics {
	
	public Robotics()
	{
		LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        //Creates a sensor instance pointing downwards connected to the given port. 
        //In simulation mode, the sensor detects the brightness of the background pixel. 
        //The port selection determines the position of the sensor: S1: right; S2: left, S3: middle, S4: rear-middle.
        LightSensor ls = new LightSensor(SensorPort.S3);
        robot.addPart(gear);
        //set speed of robot using gear
        gear.setSpeed(80);
        robot.addPart(ls);
        
        while (true)
        {
        	//getValue() - returns the brightness of the background at the current location.
            int v = ls.getValue();
            if (v < 100)  // black
            gear.forward();
            if (v > 300 && v < 750)  // blue
            //defines radius to turn around
            gear.leftArc(0.05);
            if (v > 800)  // yellow
            gear.rightArc(0.05);
        }

	}
public static void main(String[] args) {
	
		new Robotics();
	}

	//initializations
	static
    {
		//Sets the starting position (x-y-coordinates)
        RobotContext.setStartPosition(50, 490);
        //Sets the starting direction (zero to EAST).
        RobotContext.setStartDirection(-90);
        //image from sprite folder
        RobotContext.useBackground("sprites/road.gif"
);
}
}
