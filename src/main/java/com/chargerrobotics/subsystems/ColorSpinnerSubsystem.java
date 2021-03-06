/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.chargerrobotics.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.chargerrobotics.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class ColorSpinnerSubsystem extends SubsystemBase {
	/**
	 * Creates a new ColorSpinnerSubsystem.
	 */
	private static ColorSpinnerSubsystem instance;
	private WPI_TalonSRX spinnerMotor;
	private boolean isRunning;

	public static ColorSpinnerSubsystem getInstance() {
		if (instance == null)
			instance = new ColorSpinnerSubsystem();
		return instance;
	}

	public ColorSpinnerSubsystem() {
		spinnerMotor = new WPI_TalonSRX(Constants.colorSpinner);
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
		spinnerMotor.set(this.isRunning ? 0.2 : 0);
	}

	@Override
	public void periodic() {
	}
}
