/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.kauailabs.navx.frc.*;

import frc.lib.Drive;
import frc.lib.Pneumatic;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public AHRS ahrs;

  public WPI_VictorSPX leftfrontmotor=new WPI_VictorSPX(0);
  public WPI_VictorSPX leftrearmotor=new WPI_VictorSPX(1);
  public WPI_VictorSPX rightfrontmotor=new WPI_VictorSPX(2);
  public WPI_VictorSPX rightrearmotor=new WPI_VictorSPX(3);
  public SpeedControllerGroup m_left = new SpeedControllerGroup(leftfrontmotor, leftrearmotor);
  public SpeedControllerGroup m_right = new SpeedControllerGroup(rightfrontmotor, rightrearmotor);
  public DifferentialDrive cur_drive = new DifferentialDrive(m_left, m_right);

  public WPI_VictorSPX flywheelcim = new WPI_VictorSPX(4);
  public WPI_VictorSPX intake = new WPI_VictorSPX(5);
  private Pneumatic pne = new Pneumatic();
  private Drive drive = new Drive();

  public Joystick joystick = new Joystick(0);
  
  





  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {

    
  }

  @Override
  public void autonomousInit() {
    pne.set();
   
    
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    drive.cdrive(joystick.getX(),1.5*joystick.getThrottle()*joystick.getZ(), joystick.getRawButton(1));
    

    
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}

