package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.Robot;
import org.usfirst.frc5442.Fred.subsystems.Manipulator;
import org.usfirst.frc5442.Fred.subsystems.RearHooks;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Command to retract the manipulator cylinder. Command will run for the time
 * need to execute or until another command which requires one or more of the 
 * same subsystems is scheduled to run.
 * 
 */
public class  HooksDriverControlled extends CommandGroup {

    private RearHooks hooks = Robot.hooks;
    private boolean hookPos = true;
        
    public HooksDriverControlled() {
    	requires(hooks);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.hooks.cylinder(DoubleSolenoid.Value.kReverse);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (hookPos == true) {
    		addSequential(new HooksOut());
    		//hooks.cylinder(DoubleSolenoid.Value.kForward);
    		hookPos = false;
    	} else if (hookPos == false) {
    		addSequential(new HooksIn());
    		//hooks.cylinder(DoubleSolenoid.Value.kReverse);
    		hookPos = true;
    	}
    	
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
