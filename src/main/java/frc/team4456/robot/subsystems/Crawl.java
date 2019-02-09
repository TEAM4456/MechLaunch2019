package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.RobotMap;

public class Crawl extends Subsystem {
	
	protected void initDefaultCommand() { }
	
	public void crawlForward() {
		RobotMap.crawlMasterTalon.set(ControlMode.PercentOutput, .5);
	}
	
	public void crawlBack() {
		RobotMap.crawlMasterTalon.set(ControlMode.PercentOutput, -.5);
	}
	
	public void stopCrawl() {
		RobotMap.crawlMasterTalon.set(ControlMode.PercentOutput, 0);
	}
	
}
