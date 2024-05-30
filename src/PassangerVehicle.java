import Strategy.DriveStrategy;
import Strategy.NormalDrive;

public class PassangerVehicle extends Vehicle{
    PassangerVehicle(){
        super(new NormalDrive());
    }

}
