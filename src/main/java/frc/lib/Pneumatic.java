/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.lib;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
/**
 * Add your docs here.
 */
public class Pneumatic {
    Compressor c = new Compressor();
    DoubleSolenoid doubleSolenoid = new DoubleSolenoid(0,1);
   public void set(){
       c.setClosedLoopControl(true);
       doubleSolenoid.set(DoubleSolenoid.Value.kForward);

   } 
}
