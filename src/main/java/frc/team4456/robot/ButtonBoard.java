package frc.team4456.robot;

import edu.wpi.first.wpilibj.Joystick;

public class ButtonBoard {
	
	private final int HORIZ_BUTTON_1       = 1;
	private final int HORIZ_BUTTON_2       = 2;
	private final int HORIZ_BUTTON_3       = 3;
	private final int HORIZ_BUTTON_4       = 4;
	private final int RIGHT_JOYSTICK_UP    = 5;
	private final int RIGHT_JOYSTICK_RIGHT = 6;
	private final int RIGHT_JOYSTICK_DOWN  = 7;
	private final int RIGHT_JOYSTICK_LEFT  = 8;
	private final int VERTI_BUTTON_1       = 9;
	private final int VERTI_BUTTON_2       = 10;
	private final int VERTI_BUTTON_3       = 11;
	private final int VERTI_BUTTON_4       = 12;
	
	private final Joystick buttonBoard;
	
	public ButtonBoard(int joystickID) {
		buttonBoard = new Joystick(joystickID);
	}
	
	public boolean getLeftJoystickUp() {
		return buttonBoard.getRawAxis(1) == 1.0;
	}
	public boolean getLeftJoystickDown() {
		return buttonBoard.getRawAxis(1) == -1.0;
	}
	public boolean getLeftJoystickLeft() {
		return buttonBoard.getRawAxis(0) == -1.0;
	}
	public boolean getLeftJoystickRight() {
		return buttonBoard.getRawAxis(0) == 1.0;
	}
	
	public boolean getRightJoystickUp() {
		return buttonBoard.getRawButton(RIGHT_JOYSTICK_UP);
	}
	public boolean getRightJoystickDown() {
		return buttonBoard.getRawButton(RIGHT_JOYSTICK_DOWN);
	}
	public boolean getRightJoystickLeft() {
		return buttonBoard.getRawButton(RIGHT_JOYSTICK_LEFT);
	}
	public boolean getRightJoystickRight() {
		return buttonBoard.getRawButton(RIGHT_JOYSTICK_RIGHT);
	}
	
	public boolean getHorizButton1Held() {
		return buttonBoard.getRawButton(HORIZ_BUTTON_1);
	}
	public boolean getHorizButton1Pressed() {
		return buttonBoard.getRawButtonPressed(HORIZ_BUTTON_1);
	}
	public boolean getHorizButton2Held() {
		return buttonBoard.getRawButton(HORIZ_BUTTON_2);
	}
	public boolean getHorizButton2Pressed() {
		return buttonBoard.getRawButtonPressed(HORIZ_BUTTON_2);
	}
	public boolean getHorizButton3Held() {
		return buttonBoard.getRawButton(HORIZ_BUTTON_3);
	}
	public boolean getHorizButton3Pressed() {
		return buttonBoard.getRawButtonPressed(HORIZ_BUTTON_3);
	}
	public boolean getHorizButton4Held() {
		return buttonBoard.getRawButton(HORIZ_BUTTON_4);
	}
	public boolean getHorizButton4Pressed() {
		return buttonBoard.getRawButtonPressed(HORIZ_BUTTON_4);
	}
	
	public boolean getVertiButton1Held() {
		return buttonBoard.getRawButton(VERTI_BUTTON_1);
	}
	public boolean getVertiButton1Pressed() {
		return buttonBoard.getRawButtonPressed(VERTI_BUTTON_1);
	}
	public boolean getVertiButton2Held() {
		return buttonBoard.getRawButton(VERTI_BUTTON_2);
	}
	public boolean getVertiButton2Pressed() {
		return buttonBoard.getRawButtonPressed(VERTI_BUTTON_2);
	}
	public boolean getVertiButton3Held() {
		return buttonBoard.getRawButton(VERTI_BUTTON_3);
	}
	public boolean getVertiButton3Pressed() {
		return buttonBoard.getRawButtonPressed(VERTI_BUTTON_3);
	}
	public boolean getVertiButton4Held() {
		return buttonBoard.getRawButton(VERTI_BUTTON_4);
	}
	public boolean getVertiButton4Pressed() {
		return buttonBoard.getRawButtonPressed(VERTI_BUTTON_4);
	}
	
}
