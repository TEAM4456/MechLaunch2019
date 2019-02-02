package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class retractLeg extends Command{
	public retractLeg(){
		requires(Robot.climb);
	}

	protected void initialize() {
		Robot.climb.retractLeg();
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
