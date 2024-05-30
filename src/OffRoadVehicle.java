import Strategy.DriveStrategy;
import Strategy.NormalDrive;
import Strategy.XYZDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new XYZDrive());
    }
    //how to call a specific method

}
