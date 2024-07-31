public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int altitude = status.Altitude;
        int velocity = status.Velocity;
        int fuel = status.Fuel;
        int seconds = status.Seconds;
        int currentStatus = status.getStatus();

        int burn = 0;

        if (velocity == 2){
            burn = 100;
        } else if (altitude >6000){
            burn = 100;
        } else if (velocity > 100){
            burn = 200;
        } else if (altitude >100){
            burn =100;
        } else {
            burn =198;
        }
        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
