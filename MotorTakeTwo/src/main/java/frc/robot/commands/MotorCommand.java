// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorSub;

public class MotorCommand extends Command {
  MotorSub m_subsystem;
  Joystick m_Joystick;
  /** Creates a new MotorCommand. */
  public MotorCommand(MotorSub subsystem, Joystick joystick) {
    m_subsystem = subsystem;
    m_Joystick = joystick;
    addRequirements(m_subsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.setMotor(-m_Joystick.getRawAxis(5),m_Joystick.getRawAxis(1));
    m_subsystem.motormovement(0.2);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.motormovement(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
