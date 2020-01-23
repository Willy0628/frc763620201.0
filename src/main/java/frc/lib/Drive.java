/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


package frc.lib;
import frc.robot.*;

public class Drive {
    Robot robot =new Robot();
    public void cdrive(double xSpeed,double zRotation,boolean isQuickTurn){
        
        robot.cur_drive.curvatureDrive(xSpeed, zRotation, isQuickTurn);
    }
}
