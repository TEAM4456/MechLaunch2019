package frc.team4456.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team4456.robot.subsystems.*;

public class Robot extends TimedRobot {
	
	public static Climb climb;
	public static Crawl crawl;
	public static Drive drive;
	public static Elevator elevator;
	public static Grabber grabber;
	public static Controls controls;
	
	
	@Override 
	public void robotInit() {
		
		System.out.println("robotInit() called");
		
		//CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		climb = new Climb();
		drive = new Drive();
		elevator = new Elevator();
		grabber = new Grabber();
		crawl = new Crawl();
		
		controls = new Controls();
		
	}
	
	@Override
	public void robotPeriodic() {
		System.out.println("elevator encoder:" + RobotMap.liftTalon.getSelectedSensorPosition(0));
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
		Scheduler.getInstance().run();
		drive.betterArcadeDrive(controls.joystick);
	}
	
	@Override 
	public void testPeriodic() { }
	
}
