package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import static frc.robot.HAL.limelight;


public class SetPipeline extends Command {

    int pipeline;
	  
    public SetPipeline(int pipeline) {
    	this.pipeline = pipeline;
    }
    

    @Override
    protected void initialize() {
        //
    }
  
    @Override
    protected void execute() {
        limelight.setPipeline(pipeline);
    }

    @Override
    protected boolean isFinished() {
      return isTimedOut();
        }
    

    @Override
    protected void end() {
        limelight.setPipeline(pipeline);

    }

    @Override
    protected void interrupted() {
    	end();
    }
}