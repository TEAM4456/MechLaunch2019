package frc.team4456.robot;

import edu.wpi.first.wpilibj.Joystick;

public class ButtonBoard {
	
	private final Joystick buttonBoard;
	
	public ButtonBoard(int joystickID) {
		buttonBoard = new Joystick(joystickID);
	}
	
	public boolean getLeftJoystickUp() {
		return buttonBoard.getRawAxis(1) == -1.0;
	}
	public boolean getLeftJoystickDown() {
		return buttonBoard.getRawAxis(1) == 1.0;
	}
	public boolean getLeftJoystickLeft() {
		return buttonBoard.getRawAxis(0) == -1.0;
	}
	public boolean getLeftJoystickRight() {
		return buttonBoard.getRawAxis(0) == 1.0;
	}
	
	public boolean getRightJoystickUp() {
		return false; // TODO: check for real joystick move on real board
	}
	public boolean getRightJoystickDown() {
		return false; // TODO: check for real joystick move on real board
	}
	public boolean getRightJoystickLeft() {
		return false; // TODO: check for real joystick move on real board
	}
	public boolean getRightJoystickRight() {
		return false; // TODO: check for real joystick move on real board
	}
	
	public boolean getHorizButton1Held() {
		return buttonBoard.getRawButton(5); // TODO: check for button on real button board
	}
	public boolean getHorizButton1Pressed() {
		return buttonBoard.getRawButtonPressed(5); // TODO: check for button on real button board
	}
	public boolean getHorizButton2Held() {
		return buttonBoard.getRawButton(6); // TODO: check for button on real button board
	}
	public boolean getHorizButton2Pressed() {
		return buttonBoard.getRawButtonPressed(6); // TODO: check for button on real button board
	}
	public boolean getHorizButton3Held() {
		return buttonBoard.getRawButton(7); // TODO: check for button on real button board
	}
	public boolean getHorizButton3Pressed() {
		return buttonBoard.getRawButtonPressed(7); // TODO: check for button on real button board
	}
	public boolean getHorizButton4Held() {
		return buttonBoard.getRawButton(8); // TODO: check for button on real button board
	}
	public boolean getHorizButton4Pressed() {
		return buttonBoard.getRawButtonPressed(8); // TODO: check for button on real button board
	}
	
	public boolean getVertiButton1Held() {
		return buttonBoard.getRawButton(1); // TODO: change to actual button on real board
	}
	public boolean getVertiButton1Pressed() {
		return buttonBoard.getRawButtonPressed(1);  // TODO: change to actual button on real board
	}
	public boolean getVertiButton2Held() {
		return buttonBoard.getRawButton(2); // TODO: change to actual button on real board
	}
	public boolean getVertiButton2Pressed() {
		return buttonBoard.getRawButtonPressed(2);  // TODO: change to actual button on real board
	}
	public boolean getVertiButton3Held() {
		return buttonBoard.getRawButton(3); // TODO: change to actual button on real board
	}
	public boolean getVertiButton3Pressed() {
		return buttonBoard.getRawButtonPressed(3);  // TODO: change to actual button on real board
	}
	public boolean getVertiButton4Held() {
		return buttonBoard.getRawButton(4); // TODO: change to actual button on real board
	}
	public boolean getVertiButton4Pressed() {
		return buttonBoard.getRawButtonPressed(4);  // TODO: change to actual button on real board
	}
	
}
