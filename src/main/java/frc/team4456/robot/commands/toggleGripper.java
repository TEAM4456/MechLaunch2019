package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class toggleGripper extends Command {
	
	public toggleGripper() {
		requires(Robot.pneumatics);
	}
	
	protected void initialize() {
		Robot.pneumatics.toggleGripper();
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void end() { }
	
	protected void interrupted() {
		end();
	}
	
}
