package frc.team4456.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4456.robot.Robot;

public class crawlForward extends Command {
	
	public crawlForward() {
		requires(Robot.crawl);
	}
	
	@Override
	protected void initialize() {
		Robot.crawl.crawlForward();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		Robot.crawl.stopCrawl();
	}
	
	@Override
	protected void interrupted() {
		end();
	}
}
