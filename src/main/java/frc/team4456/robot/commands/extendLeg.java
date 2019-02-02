package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class extendLeg extends Command{
	public extendLeg(){
		requires(Robot.climb);
	}
	
	protected void initialize() {
		Robot.climb.extendLeg();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
		end();
	}
}
