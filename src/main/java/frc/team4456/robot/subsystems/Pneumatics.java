package frc.team4456.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.RobotMap;

public class Pneumatics extends Subsystem {
	
	/*
	private enum GripperState { OPEN, CLOSED }
	private enum PuncherState { IN, OUT }
	private enum LockState { LOCKED, UNLOCKED }
	*/
	
	private final DoubleSolenoid leftGripperPiston = RobotMap.leftGripperPiston;
	private final DoubleSolenoid rightGripperPiston = RobotMap.rightGripperPiston;
	private final DoubleSolenoid punchPiston = RobotMap.punchPiston;
	private final DoubleSolenoid lockPiston = null; // TODO: add lock piston
	
	/*
	private GripperState gripperState;
	private PuncherState puncherState;
	private LockState lockState;
	*/
	
	public Pneumatics() {
		/*
		gripperState = GripperState.CLOSED;
		puncherState = PuncherState.IN;
		lockState = LockState.LOCKED;
		*/
		resetPistons();
	}
	
	private void resetPistons() {
		leftGripperPiston.set(Value.kReverse);
		rightGripperPiston.set(Value.kReverse);
		punchPiston.set(Value.kReverse);
		//lockPiston.set(Value.kReverse);
	}
	
	protected void initDefaultCommand() {
		RobotMap.compressor.start();
	}
	
	public void toggleGripper() {
		if (leftGripperPiston.get() == Value.kReverse) {
			leftGripperPiston.set(Value.kForward);
		} else {
			leftGripperPiston.set(Value.kReverse);
		}
	}
	
	public void togglePunch() {
		if (punchPiston.get() == Value.kReverse) {
			punchPiston.set(Value.kForward);
		} else {
			punchPiston.set(Value.kReverse);
		}
	}
	
	/*
	public void toggleLock() {
		if (lockPiston.get() == Value.kReverse) {
			lockPiston.set(Value.kForward);
		} else {
			lockPiston.set(Value.kReverse);
		}
	}
	*/
	
}
