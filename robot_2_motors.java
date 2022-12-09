import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Tools;

public class Robotics_motor {

	//Constructor
	public Robotics_motor()
	{
		NxtRobot robot = new NxtRobot();
		//motor to move left
		Motor motA = new Motor(MotorPort.A);
		//motor to move right
		Motor motB = new Motor(MotorPort.B);
		//add motors to left and right
		robot.addPart(motA);
		robot.addPart(motB);

		//both motors activated so robot will go straight
		motA.forward();
		motB.forward();
		Tools.delay(2000);

		motA.stop();
		Tools.delay(1050);
		motA.forward();
		Tools.delay(2000);

		motB.stop();
		Tools.delay(1050);   
		motB.forward();
		Tools.delay(2000);
		robot.exit();

	}
	
	public static void main(String[] args) {
		
		new Robotics_motor();
	}

}
