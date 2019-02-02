package frc.team4456.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team4456.robot.commands.extendLeg;
import frc.team4456.robot.commands.retractLeg;
import frc.team4456.robot.commands.toggleTracking;

public class Controls{
	public static Joystick joystick;
	public static Joystick buttonPad;
	
	public Controls(){
		joystick = new Joystick(0);
		buttonPad = new Joystick(1);
		
		//xbox controller buttons
		JoystickButton aButton = new JoystickButton(joystick, 1);
		//aButton.whileHeld(/*Toggle Grabber*/);

		JoystickButton bButton = new JoystickButton(joystick, 2);
		bButton.whenPressed(new toggleTracking());

		JoystickButton xButton = new JoystickButton(joystick, 3);
		xButton.whileHeld(new extendLeg());

		JoystickButton yButton = new JoystickButton(joystick, 4);
		yButton.whileHeld(new retractLeg());

		JoystickButton backButton = new JoystickButton(joystick, 7);
		//backButton.whileHeld(/*Toggle Wrist*/);
		
		//button pad buttons
		JoystickButton button1 = new JoystickButton(buttonPad, 1);
		//button1.whenPressed(/*Hatch Level 1*/);

		JoystickButton button2 = new JoystickButton(buttonPad, 2);
		//button2.whenPressed(/*Cargo Level 1*/);

		JoystickButton button3 = new JoystickButton(buttonPad, 3);
		//button3.whenPressed(/*Hatch Level 2*/);

		JoystickButton button4 = new JoystickButton(buttonPad, 4);
		//button4.whenPressed(/*Cargo Level 2*/);

		JoystickButton button5 = new JoystickButton(buttonPad, 5);
		//button5.whenPressed(/*Hatch Level 3*/);

		JoystickButton button6 = new JoystickButton(buttonPad, 6);
		//button6.whenPressed(/*Cargo Level 3*/);
	}
}
