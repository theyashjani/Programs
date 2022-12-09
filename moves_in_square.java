import ch.aplu.robotsim.*;

public class Robotics {

    static {
        RobotContext.setStartDirection(90);
        RobotContext.setStartPosition(100, 100);
    }

    public Robotics() {

        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.setSpeed(100);
        while (true) {
            gear.forward(1000);
            gear.left(90);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Robotics();
    }
}
