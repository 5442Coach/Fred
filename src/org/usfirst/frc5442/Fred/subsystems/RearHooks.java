package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;
import org.usfirst.frc5442.Fred.commands.CylinderIn;
import org.usfirst.frc5442.Fred.commands.HooksIn;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RearHooks extends Subsystem {

    private DoubleSolenoid cylinder = RobotMap.hook1Cylinder;

    public void initDefaultCommand() {
    	setDefaultCommand(new HooksIn());

    }
    
    /**
     * Set the position of the cylinder piston
     * 
     * @param position The relay value corresponding to piston position
     */
    public void cylinder(DoubleSolenoid.Value position) {
        cylinder.set(position);
    }
}
