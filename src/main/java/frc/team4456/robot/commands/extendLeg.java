package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class extendLeg extends Command {
	
	public extendLeg() {
		System.out.println("extendLeg constructor called");
		requires(Robot.climb);
	}
	
	protected void initialize() {
		System.out.println("extendLeg initialize() called");
		Robot.climb.extendLeg();
	}
	 
	protected boolean isFinished() {
		System.out.println("extendLeg isFinished() called");
		return false;
	}
	
	protected void end() {
		System.out.println("extendLeg end() called");
		Robot.climb.stopLeg();
	}
	
	protected void interrupted() {
		System.out.println("extendLeg interrupted() called");
		end();
	}
	
}
