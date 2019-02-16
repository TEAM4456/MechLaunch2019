package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class raiseElevatorManual extends Command {
	
	public raiseElevatorManual() {
		System.out.println("raiseElevatorManual constructor called");
		requires(Robot.elevator);
	}

	protected void initialize() {
		System.out.println("raiseElevatorManual initialize() called");
		Robot.elevator.raiseElevatorManual();
	}
	
	
	protected boolean isFinished() {
		System.out.println("raiseElevatorManual isFinished() called");
		return false;
	}
	
	protected void end() {
		System.out.println("raiseElevatorManual end() called");
	}
	
	protected void interrupted() {
		System.out.println("raiseElevatorManual interrupted() called");
		end();
	}
	
}
