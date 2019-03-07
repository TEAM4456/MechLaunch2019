package frc.team4456.robot;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team4456.robot.subsystems.*;

public class Robot extends TimedRobot {
	
	public static Climb climb;
	public static Crawl crawl;
	public static Drive drive;
	public static Elevator elevator;
	public static Pneumatics pneumatics;
	public static Controls controls;
	
	@Override 
	public void robotInit() {
		
		System.out.println("robotInit() called");
		
		//CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		// things must be constructed in the order of
		// subsystems used in Controls -> Controls -> Drive
		climb = new Climb();
		elevator = new Elevator();
		pneumatics = new Pneumatics();
		crawl = new Crawl();
		
		controls = new Controls();
		
		drive = new Drive(controls.getJoystickInstance());
		
	}
	
	@Override
	public void robotPeriodic() {
		//System.out.println("elevator encoder: " + RobotMap.liftTalon.getSelectedSensorPosition(0));
		/*
		System.out.println("button 1: " + Controls.buttonBoard.getVertiButton1Held());
		System.out.println("button 2: " + Controls.buttonBoard.getVertiButton2Held());
		System.out.println("button 3: " + Controls.buttonBoard.getVertiButton3Held());
		System.out.println("button 4: " + Controls.buttonBoard.getVertiButton4Held());
		*/
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
		drive.betterArcadeDrive();
		
		controls.doButtonBoardControls();
	}
	
	@Override 
	public void testPeriodic() { }
	
}
