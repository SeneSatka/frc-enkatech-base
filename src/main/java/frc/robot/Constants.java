package frc.robot;

import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.wpilibj.RobotBase;

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

  public static final class CanIds {}

  public static final class Vision {
    public static final AprilTagFields FieldType = AprilTagFields.k2025ReefscapeWelded;

    // Camera names
    public static final String FrontRightName = "Front Right";
    public static final String FrontLeftName = "Front Left";
    public static final String BackRightName = "Back Right";
    public static final String BackLeftName = "Back Left";

    // Camera poses
    public static final Transform3d FRONT_RIGHT_TRANSFORM =
        new Transform3d(
            new Translation3d(-0.012552, -0.319809, 0.191168),
            new Rotation3d(0.0, Math.toRadians(-20.0), Math.toRadians(-70.0)));
    public static final Transform3d BACK_RIGHT_TRANSFORM =
        new Transform3d(
            new Translation3d(-0.081165, -0.322330, 0.191168),
            new Rotation3d(0.0, Math.toRadians(-20.0), Math.toRadians(-(180.0 - 55.0))));
    public static final Transform3d FRONT_LEFT_TRANSFORM =
        new Transform3d(
            new Translation3d(-0.012552, 0.319809, 0.191168),
            new Rotation3d(0.0, Math.toRadians(-20.0), Math.toRadians(70.0)));
    public static final Transform3d BACK_LEFT_TRANSFORM =
        new Transform3d(
            new Translation3d(-0.081165, 0.322330, 0.191168),
            new Rotation3d(0.0, Math.toRadians(-20.0), Math.toRadians(180.0 - 55.0)));
  }
}
