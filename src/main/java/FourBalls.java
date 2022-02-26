import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;

    List<Ball> ballObject;    //List<Object> list = new ArrayList<Object>();

    public FourBalls() {
        ballObject = new ArrayList<Ball>();

        ballObject.add(new Ball(getYPosition(HEIGHT), getSpeed(1)));
        ballObject.add(new Ball(getYPosition((HEIGHT * 2)), getSpeed(2)));
        ballObject.add(new Ball(getYPosition((HEIGHT * 3)), getSpeed(3)));
        ballObject.add(new Ball(getYPosition((HEIGHT * 4)), getSpeed(4)));
    }

    private int getSpeed(int speed) {
        return speed;
    }

    private int getYPosition(int height) {
        return height / getSpeed(5);
    }

    public  static void main(String[] args) {
        PApplet.main("FourBalls", args);

    }

    @Override
    public  void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        updatePositionAndDrawBall();
    }

    public void updatePositionAndDrawBall(){
        for (Ball ball: ballObject){
            ellipse(ball.getXPosition(), ball.getYPosition(), DIAMETER, DIAMETER);
            int newPosition = ball.getXPosition() + ball.getSpeed();
            ball.setPosition(newPosition);
        }
    }
}
