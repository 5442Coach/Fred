package org.usfirst.frc5442.Fred.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc5442.Fred.OI;
import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.RobotMap;

/**
 *
 */
//@SuppressWarnings("unused")
public class  AutoPickUpBinsWithHooks extends Command {
	
    public AutoPickUpBinsWithHooks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.encoders.encoderLeft.reset();
    	Robot.encoders.encoderLeft.reset();
    	RobotMap.imu.zeroYaw();
    	Robot.manipulator.cylinder(DoubleSolenoid.Value.kForward);
    	//driveTo.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//distance(in)/12.56/1.5
    	while (Robot.encoders.encoderRight.getDistance() < -2)
    	{
    		Robot.navXBoard.setSetpoint(0);
    		Robot.driveTrain.tankDrive(1, 1);
    		Robot.manipulator.cylinder(DoubleSolenoid.Value.kReverse);
    	}
    	while (Robot.encoders.encoderRight.getDistance() < 9.6)
    	{
    		
    		Robot.driveTrain.tankDrive(-1, -1);
    	}
    }
    
	// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.manipulator.cylinder(DoubleSolenoid.Value.kReverse);
    	Robot.driveTrain.driveStraight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveTrain.driveStraight(0);
    }
}
