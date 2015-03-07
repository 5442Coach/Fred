package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.subsystems.Manipulator;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command to extend the manipulator cylinder. Command will run for the time
 * need to execute or until another command which requires one or more of the 
 * same subsystems is scheduled to run.
 * 
 */
public class  CylinderOut extends Command {

    private Manipulator manipulator = Robot.manipulator;
    
    public CylinderOut() {
    	requires(manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        manipulator.cylinder(DoubleSolenoid.Value.kForward);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        manipulator.cylinder(DoubleSolenoid.Value.kOff);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        manipulator.cylinder(DoubleSolenoid.Value.kOff);
    }
}
