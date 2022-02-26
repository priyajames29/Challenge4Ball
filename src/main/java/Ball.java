public class Ball {
    private int xPosition, yPosition, speed;

    public Ball(int yPosition, int speed){
        xPosition = 0;
        this.yPosition = yPosition;
        this.speed = speed;
    }

    public int getXPosition(){
        return xPosition;
    }

    public int getYPosition(){
        return yPosition;
    }

    public void setPosition(int xPosition){
        this.xPosition = xPosition;
    }

    public int getSpeed(){
        return speed;
    }

}
