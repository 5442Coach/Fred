package org.usfirst.frc5442.Fred.subsystems;

import org.usfirst.frc5442.Fred.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 * The Team 4478 Manipulator subsystem implements the robot manipulator 
 * mechanism control methods
 * 
 * @author Temporo Materia Oscura
 */
public class Manipulator extends Subsystem {

    DoubleSolenoid cylinder = RobotMap.manipulatorCylinder;

    public void initDefaultCommand() {

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
