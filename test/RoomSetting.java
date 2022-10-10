package test;

public class RoomSetting {
    public class AHAException extends Exception{
        public AHAException(String message){
            super(message);
        }
    }
    private int width;
    private final String AHA = "Insufficient singers";
    private int height;
    private int[][] pollutants;
    int noOfPolluters;

    public RoomSetting(int width, int height, int noOfPolluters)throws AHAException{
        if((width*height)<noOfPolluters){
            throw new AHAException(AHA);
        }
        this.width=width;
        this.height=height;
        this.noOfPolluters=noOfPolluters;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth(){
        return width;
    }

    public int getNoOfPolluters() {
        return noOfPolluters;
    }

    public int[][] getPollutants() {
        return pollutants;
    }
}
