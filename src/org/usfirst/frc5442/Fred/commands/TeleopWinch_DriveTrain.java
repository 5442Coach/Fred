package org.usfirst.frc5442.Fred.commands;
//import DriveTrain and winch subsystems
import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class TeleopWinch_DriveTrain extends CommandGroup {
	
	public TeleopWinch_DriveTrain() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	addParallel(new DriveWithController());
    	addParallel(new winchMove());
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}