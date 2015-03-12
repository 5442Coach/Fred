package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;

import com.kauailabs.navx_mxp.AHRS;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;

public class NavXBoard extends PIDSubsystem {
	private AHRS gyro = RobotMap.imu;

	public NavXBoard() {
		super("Gyro", 2.0,0.0,0.0);
		setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
	}
	public void initDefaultCommand() {
		//setDefaultCommand(new winchMove());
	}
	//Move the winch based on the value passed to it in commands    	
	@Override
	protected double returnPIDInput() {
		return gyro.getYaw();
	}
	@Override
	protected void usePIDOutput(double output) {
		
	}  

}
