package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.OI;
import org.usfirst.frc5442.Fred.Robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

public class XboxWinchUp extends Command {
	public XboxWinchUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

		requires(Robot.winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.winch.move(1);
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.winch.move(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.winch.move(0.0);
    }

}

