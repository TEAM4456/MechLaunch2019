package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class retractLeg extends Command {
	
	public retractLeg() {
		System.out.println("retractLeg constructor called");
		requires(Robot.climb);
	}
	
	protected void initialize() {
		System.out.println("retractLeg initialize() called");
		Robot.climb.retractLeg();
	}
	
	protected boolean isFinished() {
		System.out.println("retractLeg isFinished() called");
		return false;
	}
	
	protected void end() {
		System.out.println("retractLeg end() called");
		Robot.climb.stopLeg();
	}
	
	protected void interrupted() {
		System.out.println("retractLeg interrupted() called");
		end();
	}
	
}
