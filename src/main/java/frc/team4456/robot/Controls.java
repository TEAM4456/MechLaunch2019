package frc.team4456.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team4456.robot.commands.*;
import frc.team4456.robot.subsystems.*;

public class Controls {
	
	private static Joystick joystick;
	private static ButtonBoard buttonBoard;
	
	private boolean climbControls;
	
	private final Elevator elevator = Robot.elevator;
	private final Climb climb = Robot.climb;
	private final Crawl crawl = Robot.crawl;
	
	public Controls() {
		
		joystick = new Joystick(0);
		buttonBoard = new ButtonBoard(1);
		
		climbControls = false;
		
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
		
	}
	
	public void doButtonBoardControls() {
		
		// button board controls (commands don't behave well for some reason)
		// yes, it's ugly, but it's reliable
		if (!climbControls) {
			if (buttonBoard.getLeftJoystickUp()) {
				elevator.raiseElevatorManual();
			} else if (buttonBoard.getLeftJoystickDown()) {
				elevator.lowerElevatorManual();
			}
			if (buttonBoard.getVertiButton1Pressed()) {
				elevator.moveToPosition(Globals.cargoPositions[0]);
			} else if (buttonBoard.getVertiButton2Pressed()) {
				elevator.moveToPosition(Globals.cargoPositions[1]);
			} else if (buttonBoard.getVertiButton3Pressed()) {
				elevator.moveToPosition(Globals.cargoPositions[2]);
			} else if (buttonBoard.getVertiButton4Pressed()) {
				elevator.moveToPosition(Globals.cargoPositions[3]);
			} else if (buttonBoard.getHorizButton4Pressed()) {
				elevator.moveToPosition(Globals.hatchPositions[0]);
			} else if (buttonBoard.getHorizButton3Pressed()) {
				elevator.moveToPosition(Globals.hatchPositions[1]);
			} else if (buttonBoard.getHorizButton2Pressed()) {
				elevator.moveToPosition(Globals.hatchPositions[2]);
			}
			if (buttonBoard.getHorizButton1Pressed()) {
				climbControls = true;
			}
		} else {
			if (buttonBoard.getLeftJoystickUp()) {
				crawl.crawlForward();
			} else if (buttonBoard.getLeftJoystickDown()) {
				crawl.crawlBack();
			} else {
				crawl.stopCrawl();
			}
			
			if (buttonBoard.getRightJoystickUp()) {
				climb.extendLeg();
			} else if (buttonBoard.getRightJoystickDown()) {
				climb.retractLeg();
			} else {
				climb.stopLeg();
			}
			/*
			if (buttonBoard.getVertiButton4Pressed()) {
				pneumatics.toggleLock();
			}
			*/
			if (buttonBoard.getHorizButton1Pressed()) {
				climbControls = false;
			}
		}
		
	}
	
	public Joystick getJoystickInstance() {
		return joystick;
	}
	
	public boolean isClimbControls() {
		return climbControls;
	}
	
}
