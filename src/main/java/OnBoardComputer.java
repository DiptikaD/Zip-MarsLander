public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int altitude = status.Altitude;
        int velocity = status.Velocity;
        int fuel = status.Fuel;
        int seconds = status.Seconds;
        int currentStatus = status.getStatus();

        int burn = 0;
        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
