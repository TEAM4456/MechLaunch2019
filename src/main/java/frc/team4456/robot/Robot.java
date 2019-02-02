package frc.team4456.robot;

import edu.wpi.first.wpilibj.CameraServer;
import frc.team4456.robot.subsystems.*;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
	public static Climb climb;
	public static Drive drive;
	public static Elevator elevator;
	public static Grabber grabber;
	public static Controls oi;
	
    @Override
    public void robotInit() {
		CameraServer.getInstance().startAutomaticCapture();
    	
		RobotMap.init();
		
		oi = new Controls();
		climb = new Climb();
		drive = new Drive();
		elevator = new Elevator();
		grabber = new Grabber();
	}
    
    @Override
    public void disabledInit() { }
	
    @Override
    public void autonomousInit() { }
	
    @Override
    public void teleopInit() { }
	
    @Override
    public void testInit() { }
    
    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }
	
    @Override
    public void teleopPeriodic() {
    	
    	//Finds out if the robot is currently using 
		//vision tracking and runs the correct arcade drive.
    	if (drive.isTracking()) {
			drive.trackingArcadeDrive(oi.joystick);
		} 
		else {
    		drive.arcadeDrive(oi.joystick);
		}
	}
	
    @Override
    public void testPeriodic() { }
}
