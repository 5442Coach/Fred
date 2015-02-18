package org.usfirst.frc5442.Fred.commands;

import org.usfirst.frc5442.Fred.RobotMap;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

public class Debug extends Command {
	
	public Debug() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
        System.out.println("Winch Current: " + RobotMap.m_winchController.getOutputCurrent());
        System.out.println("Winch Value: " + CANTalon.FeedbackDevice.AnalogPot.value);
        System.out.println("Pot Value: " + RobotMap.m_winchController.getPosition());
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
