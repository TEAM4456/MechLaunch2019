package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class toggleLock extends Command {
	
	public toggleLock() {
		requires(Robot.pneumatics);
	}
	
	protected void initialize() {
		Robot.pneumatics.toggleLock();
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void end() { }
	
	protected void interrupted() {
		end();
	}

}
