package frc.robot.subsystems.TankDrives;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.lib.generic.GenericSubsystem;

import java.util.function.DoubleSupplier;

public class Tankdrive extends GenericSubsystem {

    tankDriveConstants tankDriveConstants = new tankDriveConstants();
    public final DifferentialDrive tankDrive  = tankDriveConstants.tankDrive;

    public Tankdrive() {
        tankDriveConstants.motorFollowConfig();
    }



    public Command setupTankDrive(DoubleSupplier leftStickValue, DoubleSupplier rightStickValue) {
        return Commands.run(()-> tankDrive.arcadeDrive(leftStickValue.getAsDouble(), rightStickValue.getAsDouble()), this);
    }

}