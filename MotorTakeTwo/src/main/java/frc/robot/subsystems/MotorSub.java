// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSub extends SubsystemBase {
  TalonFX motor1;
  TalonFX motor2;
  /** Creates a new MotorSub. */
  public MotorSub() {
    motor1 = new TalonFX(4);
    motor2 = new TalonFX(3);
  }
  public void setMotor(double speed) {
    motor1.set(speed);
    motor2.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
