package frc.team4456.robot;

public class Globals {
	
	public static double leftDriveP = 0.001;
	public static double leftDriveI = 0.000001;
	public static double leftDriveD = 1.0;
	public static double leftDriveF = 0.3431872467;
	
	public static double rightDriveP = 0.001;
	public static double rightDriveI = 0.000001;
	public static double rightDriveD = 1.0;
	public static double rightDriveF = 0.3439511004;
	
	public static double elevatorP = 2.5;
	public static double elevatorI = 0.000499;
	public static double elevatorD = 0.0;
	public static double elevatorF = 0.0;
	public static double elevatorRampRate = 0.0;
	public static double elevatorManualStepSize = 300.0;
	public static double elevatorLowerLimit = 0.0;
	public static double elevatorUpperLimit = 9730.0;
	
	public static double[] elevatorPositions = {0, 2200, 5100, 9600};
	
	public static double climberP = 0.6;
	public static double climberI = 0.0;
	public static double climberD = 0.0;
	public static double climberF = 0.0;
	public static double climberRampRate = 0.2;
	
	public static double crawlRampRate = 0.1;
	
}
