package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class togglePunch extends Command {
	
	public togglePunch() {
		requires(Robot.pneumatics);
	}
	
	protected void initialize() {
		Robot.pneumatics.togglePunch();
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void end() { }
	
	protected void interrupted() {
		end();
	}
	
}
