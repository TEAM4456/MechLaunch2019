package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class lowerElevatorManual extends Command {
	
	public lowerElevatorManual() {
		System.out.println("lowerElevatorManual constructor called");
		requires(Robot.elevator);
	}
	
	protected void initialize() {
		System.out.println("lowerElevatorManual initialize() called");
		Robot.elevator.lowerElevatorManual();
	}
	
	protected boolean isFinished() {
		System.out.println("lowerElevatorManual isFinished() called");
		return false;
	}
	
	protected void end() {
		System.out.println("lowerElevatorManual end() called");
	}
	
	protected void interrupted() {
		System.out.println("lowerElevatorManual interrupted() called");
		end();
	}
		
}
