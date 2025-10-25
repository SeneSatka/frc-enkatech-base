package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import frc.robot.utils.Constants.CanIds;
import frc.robot.utils.Constants.TunerConstants;

public final class Constants {
    public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  };
  public static final Mode simMode = Mode.SIM;
  public static final Mode currentMode = RobotBase.isReal() ? Mode.REAL : simMode;

  public static final TunerConstants Tuner = new TunerConstants();
  public static final CanIds CanId = new CanIds();
    
}
