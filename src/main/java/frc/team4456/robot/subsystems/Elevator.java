package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.Globals;
import frc.team4456.robot.RobotMap;

public class Elevator extends Subsystem {
	
	private final WPI_TalonSRX liftTalon = RobotMap.liftTalon;
	
	protected void initDefaultCommand() { }
	
	public Elevator() {
		liftTalon.configClosedloopRamp(Globals.elevatorRampRate);
		liftTalon.config_kP(0, Globals.elevatorP, 10);
		liftTalon.config_kI(0, Globals.elevatorI, 10);
		liftTalon.config_kD(0, Globals.elevatorD, 10);
		liftTalon.config_kF(0, Globals.elevatorF, 10);
		resetElevatorPosition();
	}
	
	private int getPosition() {
		return liftTalon.getSelectedSensorPosition(0);
	}
	
	public void resetElevatorPosition() {
		liftTalon.setSelectedSensorPosition(0, 0, 10);
	}
	
	public void raiseElevatorManual() {
		//if (liftTalon.getClosedLoopTarget(0) < Globals.elevatorUpperLimit) {
			liftTalon.set(ControlMode.Position, getPosition() + Globals.elevatorManualStepSize);
		//}
	}
	
	public void lowerElevatorManual() {
		//if (liftTalon.getClosedLoopTarget(0) < Globals.elevatorLowerLimit) {
			liftTalon.set(ControlMode.Position, getPosition() - Globals.elevatorManualStepSize);
		//}
	}
	
	public void moveToPosition(int position) {
		liftTalon.set(ControlMode.Position, position);
	}
	
}
