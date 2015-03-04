package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;
import org.usfirst.frc5442.Fred.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.hal.CanTalonSRX;



public class Winch extends Subsystem {
	public CANTalon m_winchController = RobotMap.m_winchController;

	
	 public void initDefaultCommand() {
	 }
	    	
	 public void move (double speed)
	   {
	    	m_winchController.set(speed);
	   }  

}
