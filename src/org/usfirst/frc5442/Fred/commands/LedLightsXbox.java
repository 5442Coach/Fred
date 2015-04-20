package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class LedLightsXbox extends Command {
	boolean ledsState;
	
	public LedLightsXbox() {
		requires(Robot.Leds);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		ledsState = true;
	}

	@Override
	protected void execute() {
		//Robot.Leds.ledOn();
		if (ledsState == false) {
			RobotMap.LedLights2.set(true);
			RobotMap.ledlights.set(DoubleSolenoid.Value.kForward);
		} else if (ledsState == true) {
			RobotMap.LedLights2.set(false);
			RobotMap.ledlights.set(DoubleSolenoid.Value.kOff);
			ledsState = false;
		}
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//Robot.Leds.ledOff();
	}

	@Override
	protected void interrupted() {
		//Robot.Leds.ledOff();
		// TODO Auto-generated method stub
		
	}
	

}
