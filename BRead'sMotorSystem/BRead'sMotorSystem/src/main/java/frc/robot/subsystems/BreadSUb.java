// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BreadSUb extends SubsystemBase {
  TalonFX motor1;
  
  /** Creates a new BreadSUb. */
  public BreadSUb() {
    motor1 = new TalonFX(10,"rio");
  }

  public void setMotor(double speed) {
    motor1.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
