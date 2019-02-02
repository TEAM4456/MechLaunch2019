package frc.team4456.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class RobotMap {
	
	public static WPI_TalonSRX leftDriveMaster;
	public static WPI_TalonSRX rightDriveMaster;
	public static WPI_VictorSPX leftDriveFollower;
	public static WPI_VictorSPX rightDriveFollower;
	public static WPI_TalonSRX liftTalon;
	public static WPI_TalonSRX climbTalon;
	public static WPI_TalonSRX crawlMasterTalon;
	public static WPI_TalonSRX crawlFollowerTalon;
	public static DoubleSolenoid leftGripperPiston;
	public static DoubleSolenoid rightGripperPiston;
	public static DoubleSolenoid gripperPivotPiston;
	
	public static Compressor compressor; // TODO: MOVE TO DEDICATED PNEUMATICS CONTROLLER CLASS
	
	public static void init() {
		
		leftDriveMaster = new WPI_TalonSRX(1);
		leftDriveMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		
		leftDriveFollower = new WPI_VictorSPX(2);
		leftDriveFollower.set(ControlMode.Follower, 1);
		
		rightDriveMaster = new WPI_TalonSRX(3);
		rightDriveMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rightDriveFollower = new WPI_VictorSPX(4);
		rightDriveFollower.set(ControlMode.Follower, 3);
		
		liftTalon = new WPI_TalonSRX(5);
		
		climbTalon = new WPI_TalonSRX(6);
		
		crawlMasterTalon = new WPI_TalonSRX(7);
		crawlFollowerTalon = new WPI_TalonSRX(8);
		crawlFollowerTalon.set(ControlMode.Follower, 7);
		
		leftGripperPiston = new DoubleSolenoid(0, 1);
		rightGripperPiston = new DoubleSolenoid(2, 3);
		
		gripperPivotPiston = new DoubleSolenoid(4, 5);
		
		compressor = new Compressor(); // TODO: MOVE TO DEDICATED PNEUMATICS CONTROLLER CLASS
		
	}
	
}
