package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class LedLightsOff extends Command {
	
	public LedLightsOff() {
		requires(Robot.Leds);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		Robot.Leds.ledOff();
		RobotMap.ledlights.set(false);
		
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
