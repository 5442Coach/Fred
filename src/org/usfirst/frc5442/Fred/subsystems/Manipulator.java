package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;
import org.usfirst.frc5442.Fred.commands.CylinderIn;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Manipulator extends Subsystem {

    DoubleSolenoid cylinder = RobotMap.manipulatorCylinder;

    public void initDefaultCommand() {
    	setDefaultCommand(new CylinderIn());

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
