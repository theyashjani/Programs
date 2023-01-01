import ch.aplu.robotsim.*; // Class contains Robot Simulator
class MoveWithGear
{
      MoveWithGear()
      {
               NxtRobot robot = new NxtRobot();
               Gear gear = new Gear();
               robot.addPart(gear);
               // Movement of Robot
               gear.forward(2000);
               gear.setSpeed(10);
               gear.left(3000);
               gear.forward(2000);
               gear.right(4800);
               gear.forward();
               Tools.delay(2000);
               robot.exit();
      }
      
      // Main method for

      public static void main(String[] args)
      {
             new MoveWithGear();
      }
}
