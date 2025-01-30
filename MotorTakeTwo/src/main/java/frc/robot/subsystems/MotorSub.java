// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSub extends SubsystemBase {
  TalonFX motor1;
  TalonFX motor2;
  TalonFX motor3;
  TalonFX motor4;
  TalonFX motor5;

  MotorControllerGroup left;
  MotorControllerGroup right;
  DifferentialDrive drive;

  
  /** Creates a new MotorSub. */
  public MotorSub() {
    motor1 = new TalonFX(4);
    motor2 = new TalonFX(3);
    motor3 = new TalonFX(2);
    motor4 = new TalonFX(1);
    motor5 = new TalonFX(6);
    

    left = new MotorControllerGroup(motor3,motor4);
    right = new MotorControllerGroup(motor1,motor2);
    drive = new DifferentialDrive(left,right);
  }
  public void setMotor(double speed,double rotation) {
      drive.arcadeDrive(speed, rotation);
      motor1.set(speed);
  }

  public void motormovement(double speed) {
    motor5.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
