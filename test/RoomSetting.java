package test;

import java.util.ArrayList;
import java.util.Random;

public class RoomSetting {
    public Point[] getPolluters() {
        return null;
    }
    private int width;
    private final String AHA = "Insufficient singers";
    private int height;
    private ArrayList<Point> pollutants;
    int noOfPolluters;

    public RoomSetting(int width, int height, int noOfPolluters)throws AHAException{
        if((width*height)<noOfPolluters){
            throw new AHAException(AHA);
        }
        this.width=width;
        this.height=height;
        this.noOfPolluters=noOfPolluters;
        for(int i=0; i<noOfPolluters;i++){
                Random x = new Random();
                Random y = new Random();
                Point neu = new Point(x.nextInt((width+1)),y.nextInt((height+1)));
                while(pollutants.contains(neu)==true){
                    neu = new Point(x.nextInt((width+1)),y.nextInt((height+1)));
                }
                pollutants.add(neu);
        }
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


}
