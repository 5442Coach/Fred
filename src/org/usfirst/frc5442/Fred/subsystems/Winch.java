package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;
import org.usfirst.frc5442.Fred.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;



public class Winch extends Subsystem {
	public SpeedController winchController = RobotMap.winchController;

	
	 public void initDefaultCommand() {
		 setDefaultCommand(new winchMove());
		 
	 }
	    	
	    public void move (double speed)
	    	    {
	    	    	winchController.set(speed);
	    	    }  

}
