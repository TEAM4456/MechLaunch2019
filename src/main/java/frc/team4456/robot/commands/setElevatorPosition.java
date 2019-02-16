package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class setElevatorPosition extends Command {

	private double position;
	
	public setElevatorPosition(double pos) {
		System.out.println("setElevatorPosition constructor called");
		position = pos;
	}
	
	protected void initialize() {
		System.out.println("setElevatorPosition initialize called");
		//Robot.elevator.moveToPosition(position);
	}
	
	protected boolean isFinished() {
		System.out.println("setElevatorPosition isFinished called");
		return false;
	}
	
	protected void end() {
		System.out.println("setElevatorPosition end called");
		//Robot.elevator.moveToPosition(position);
	}
	
	protected void interrupted() {
		System.out.println("setElevatorPosition interrupted called");
		end();
	}
	
}
