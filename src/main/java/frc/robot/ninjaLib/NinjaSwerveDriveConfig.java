package frc.robot.ninjaLib;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.TimedRobot;

public class NinjaSwerveDriveConfig {

  /**
   * NavX gyro connected to MXP SPI port, used for field-oriented driving. If null, field-oriented
   * driving is disabled.
   */
  public AHRS gyro;

  /** Initialize with four initialized wheels, in order from wheel 0 to wheel 3. */
//   public NinjaWheel[] wheels;

  /** Wheel base length from front to rear of robot. */
  public double length = 21.125;

  /** Wheel base width from left to right of robot. */
  public double width = 21.125;

  /**
   * Robot period is the {@code TimedRobot} period in seconds, defaults to {@code
   * TimedRobot.kDefaultPeriod}.
   */
  public double robotPeriod = TimedRobot.kDefaultPeriod;

  /** Factor to correct gyro lag when simultaneously applying azimuth and drive. */
  public double gyroRateCoeff = 0.0;

  /** Log gyro errors, set to false if too spammy. */
  public boolean gyroLoggingEnabled = true;

  /**
   * Summarize Talon configuration errors. If false, will log error messages as each error is
   * encountered.
   */
  public boolean summarizeTalonErrors = false;
}
