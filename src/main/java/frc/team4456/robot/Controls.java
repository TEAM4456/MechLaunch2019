package frc.team4456.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team4456.robot.commands.*;

public class Controls {
	
	public static Joystick joystick;
	public static ButtonBoard buttonBoard;
	
	public Controls() {
		
		joystick = new Joystick(0);
		buttonBoard = new ButtonBoard(1);
		
		//xbox controller buttons
		JoystickButton aButton = new JoystickButton(joystick, 1);
		aButton.whileHeld(new raiseElevatorManual());
		
		JoystickButton bButton = new JoystickButton(joystick, 2);
		bButton.whileHeld(new lowerElevatorManual());
		
		JoystickButton xButton = new JoystickButton(joystick, 3);
		xButton.whileHeld(new extendLeg());
		
		JoystickButton yButton = new JoystickButton(joystick, 4);
		yButton.whileHeld(new retractLeg());
		
		JoystickButton leftBumper = new JoystickButton(joystick, 5);
		leftBumper.whileHeld(new crawlBack());
		
		JoystickButton rightBumper = new JoystickButton(joystick, 6);
		rightBumper.whileHeld(new crawlForward());
		
		JoystickButton backButton = new JoystickButton(joystick, 7);
		backButton.whenPressed(new togglePunch());
		
		JoystickButton startButton = new JoystickButton(joystick, 8);
		startButton.whenPressed(new toggleGripper());
		
		JoystickButton leftStick = new JoystickButton(joystick, 9);
		leftStick.whenPressed(new togglePivot());
		
		JoystickButton rightStick = new JoystickButton(joystick, 10);
		rightStick.whenPressed(new toggleLock());
		
		//button pad buttons
		/*
		JoystickButton button1 = new JoystickButton(buttonBoard, 1);
		button1.whenPressed(new setElevatorPosition(Globals.cargoPositions[0]));
		
		JoystickButton button2 = new JoystickButton(buttonBoard, 2);
		button2.whenPressed(new setElevatorPosition(Globals.cargoPositions[1]));
		
		JoystickButton button3 = new JoystickButton(buttonBoard, 3);
		button3.whenPressed(new setElevatorPosition(Globals.cargoPositions[2]));
		
		JoystickButton button4 = new JoystickButton(buttonBoard, 4);
		button4.whenPressed(new setElevatorPosition(Globals.cargoPositions[3]));
		
		JoystickButton button5 = new JoystickButton(buttonBoard, 5);
		//button5.whenPressed();
		
		JoystickButton button6 = new JoystickButton(buttonBoard, 6);
		//button6.whenPressed();
		*/
	}
	
}
