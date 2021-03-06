/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.chargerrobotics.commands;

import com.chargerrobotics.subsystems.LimelightSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class LimelightCommand extends CommandBase {

	private final LimelightSubsystem limelightSubsystem;

	/**
	 * Creates a new LimelightCommand.
	 */
	public LimelightCommand(LimelightSubsystem limelightSubsystem) {
		this.limelightSubsystem = limelightSubsystem;
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
		limelightSubsystem.setRunning(true);
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		limelightSubsystem.setRunning(false);
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}
