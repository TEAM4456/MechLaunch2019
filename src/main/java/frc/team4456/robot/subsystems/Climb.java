package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.RobotMap;

public class Climb extends Subsystem {
	
	protected void initDefaultCommand() { }
	
	public void extendLeg() {
		RobotMap.climbTalon.set(ControlMode.PercentOutput, 1);
	}
	
	public void retractLeg() {
		RobotMap.climbTalon.set(ControlMode.PercentOutput, -1);
	}
	
	public void stopLeg() {
		RobotMap.climbTalon.set(ControlMode.PercentOutput, 0);
	}
	
}
