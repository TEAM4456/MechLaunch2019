package frc.team4456.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Compressor;

public class RobotMap{
	public static WPI_TalonSRX leftMain;
	public static WPI_TalonSRX rightMain;
	public static WPI_VictorSPX leftSlave;
	public static WPI_VictorSPX rightSlave;
	public static WPI_TalonSRX liftTalon;
	public static WPI_TalonSRX climbTalon;
	public static WPI_TalonSRX leftCrawl;
	public static WPI_TalonSRX rightCrawl;
	public static DoubleSolenoid leftGrab;
	public static DoubleSolenoid rightGrab;
	public static DoubleSolenoid leftPivot;
	public static DoubleSolenoid rightPivot;
	public static Compressor compressor;
	
	public static void init(){
		leftMain = new WPI_TalonSRX(1);
		leftSlave = new WPI_VictorSPX(2);
		rightMain = new WPI_TalonSRX(3);
		rightSlave = new WPI_VictorSPX(4);
		liftTalon = new WPI_TalonSRX(5);
		climbTalon = new WPI_TalonSRX(6);
		leftCrawl = new WPI_TalonSRX(7);
		rightCrawl = new WPI_TalonSRX(8);
		leftGrab = new DoubleSolenoid(0, 1);
		rightGrab = new DoubleSolenoid(2, 3);
		leftPivot = new DoubleSolenoid(4, 5);
		rightPivot = new DoubleSolenoid(6, 7);
		compressor = new Compressor();
		
		leftSlave.set(ControlMode.Follower, 1);
		rightSlave.set(ControlMode.Follower, 3);
		
		leftMain.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		rightMain.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		liftTalon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
	}
}
