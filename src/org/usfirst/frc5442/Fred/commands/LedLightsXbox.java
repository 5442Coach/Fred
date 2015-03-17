package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class LedLightsXbox extends Command {
	

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		Robot.Leds.ledOn();
		RobotMap.ledlights.set(true);
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
