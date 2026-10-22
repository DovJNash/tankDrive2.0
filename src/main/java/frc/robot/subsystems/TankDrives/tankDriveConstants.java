package frc.robot.subsystems.TankDrives;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.lib.generic.hardware.motor.Motor;
import frc.lib.generic.hardware.motor.MotorFactory;
import frc.lib.generic.hardware.motor.MotorProperties;

public class tankDriveConstants {
    protected final Motor TankLeftLead = MotorFactory.createTalonFX("TankLtLead", 5);
    protected final Motor TankLeftFollower = MotorFactory.createTalonFX("TankLtFollow", 6);
    protected final Motor TankRightLead = MotorFactory.createTalonFX("TankRtLead", 8);
    protected final Motor TankRightFollower = MotorFactory.createTalonFX("TankRtFollow", 4);

    public final DifferentialDrive tankDrive  = new DifferentialDrive(
            output -> TankLeftLead.setOutput(MotorProperties.ControlMode.VOLTAGE ,output),
            output -> TankRightLead.setOutput(MotorProperties.ControlMode.VOLTAGE ,output)
    );

    public void motorFollowConfig() {
    TankLeftFollower.setFollowerOf(TankLeftLead, false);
    TankRightFollower.setFollowerOf(TankRightLead, false);
}
}
