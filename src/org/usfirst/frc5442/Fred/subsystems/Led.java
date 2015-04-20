package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;
import org.usfirst.frc5442.Fred.commands.LedLightsOff;
import org.usfirst.frc5442.Fred.commands.LedLightsXbox;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Led extends Subsystem {
	
	private Solenoid LED = RobotMap.LedLights2;

	@Override
	protected void initDefaultCommand() {
		//setDefaultCommand(new LedLightsXbox());
		// TODO Auto-generated method stub
	
	}
	public void ledOn() {
		LED.set(true);
		
	}
	public void ledOff() {
		LED.set(false);
	}

}
