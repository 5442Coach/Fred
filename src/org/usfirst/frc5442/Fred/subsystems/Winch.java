package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;
import org.usfirst.frc5442.Fred.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.hal.CanTalonSRX;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;



public class Winch extends PIDSubsystem {
	private CANTalon m_winchController = RobotMap.m_winchController;
	private Potentiometer winchPot = RobotMap.winchPot;

	public Winch() {
		super("Winch", 0.3,0.0,0.0);
		setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
	}
	public void initDefaultCommand() {
		//setDefaultCommand(new winchMove());
	}
	//Move the winch based on the value passed to it in commands    	
	public void move (double speed)
	  {
	    m_winchController.set(speed);
	  }
	@Override
	protected double returnPIDInput() {
		return winchPot.pidGet();
	}
	@Override
	protected void usePIDOutput(double output) {
		m_winchController.pidWrite(output);
	}  

}