package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class toggleTracking extends Command{

	public toggleTracking(){
		requires(Robot.drive);
	}
	
	protected void initialize() {
		Robot.drive.toggleTracking();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
	}

	protected void interrupted() {
		end();
	}
	
}
