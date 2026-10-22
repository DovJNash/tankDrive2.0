package frc.robot.subsystems.TankDrives;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.lib.generic.GenericSubsystem;

public class Tankdrive extends GenericSubsystem {

    tankDriveConstants tankDriveConstants = new tankDriveConstants();
    public final DifferentialDrive tankDrive  = tankDriveConstants.tankDrive;



    public Command setupTankDrive(double leftStickValue, double rightStickValue) {
        return Commands.run(()-> {tankDrive.arcadeDrive(leftStickValue, rightStickValue); tankDriveConstants.motorFollowConfig();}, this);
    }
}