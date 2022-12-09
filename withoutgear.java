import ch.aplu.robotsim.*;  //importing libraries

public class Robotics_1 {
	
	Robotics_1()
	{
		//Creates a turtle robot
		TurtleRobot robot = new TurtleRobot();
		robot.forward(100);
		robot.left(90);
		robot.right(200);
		robot.forward(100);
	
	}
	
	public static void main(String args[])
	{
		new Robotics_1();
	}

}
