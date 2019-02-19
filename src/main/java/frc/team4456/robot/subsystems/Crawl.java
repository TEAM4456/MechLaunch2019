package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.Globals;
import frc.team4456.robot.RobotMap;

public class Crawl extends Subsystem {
	
	private final WPI_TalonSRX crawlTalon = RobotMap.crawlMasterTalon;
	
	public Crawl() {
		crawlTalon.configOpenloopRamp(Globals.crawlRampRate);
	}
	
	protected void initDefaultCommand() { }
	
	public void crawlForward() {
		crawlTalon.set(ControlMode.PercentOutput, .5);
	}
	
	public void crawlBack() {
		crawlTalon.set(ControlMode.PercentOutput, -.5);
	}
	
	public void stopCrawl() {
		crawlTalon.set(ControlMode.PercentOutput, 0);
	}
	
}
