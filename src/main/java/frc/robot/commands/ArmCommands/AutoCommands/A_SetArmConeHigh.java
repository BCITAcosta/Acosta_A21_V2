package frc.robot.commands.ArmCommands.AutoCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class A_SetArmConeHigh extends CommandBase{
    private Arm arm;

    public A_SetArmConeHigh(){
        arm = Arm.getInstance();
        addRequirements(arm);
    }

    @Override 
    public void initialize(){
        
    }

    @Override
    public void execute(){
        arm.setArmToPos(190);
    }

    @Override
    public void end(boolean interrupted){
        arm.setArmSpeed(0);
    }

    @Override
    public boolean isFinished(){
        if (arm.getArmInPos()){
            return true;
        }
        return false;
    }
}