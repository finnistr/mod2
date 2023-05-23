import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.program.*;

import java.awt.*;

public class flagg extends GraphicsProgram{
    public void run(){
        GStar star = new GStar(20,20,50);
        star.setFilled(true);
        star.setFillColor(Color.yellow);
        add(star);
        star.sendForward();


        GStar star1 = new GStar(10,70,50);
        star1.setFilled(true);
        star1.setFillColor(Color.yellow);
        add(star1);

        GStar star2 = new GStar(20,100,50);
        star2.setFilled(true);
        star2.setFillColor(Color.yellow);
        add(star2);
        star2.sendForward();

        GOval circle = new GOval(50, 50, 100, 50);
        circle.setFilled(true);
        circle.setFillColor(Color.yellow);
        add(circle);



        GPoint[] bluepoints = new GPoint[4];
        bluepoints[0] = new GPoint(0,0);
        bluepoints[1] = new GPoint(this.getCanvasWidth(), 0);
        bluepoints[2] = new GPoint(this.getWidth(), this.getHeight()/2);
        bluepoints[3] = new GPoint(this.getWidth()/2, this.getHeight()/2);

        GPolygon blue = new GPolygon(bluepoints);
        blue.setFilled(true);
        blue.setFillColor(Color.blue);
        add(blue);

        GPoint[] redpoints = new GPoint[4];
        redpoints[0] = new GPoint(0, 0/2);
        redpoints[1] = new GPoint(this.getCanvasWidth(), 0);
        redpoints[2] = new GPoint(this.getWidth(), this.getHeight()/2);
        redpoints[3] = new GPoint(this.getWidth()/2, this.getHeight()/2);

        GPolygon red = new GPolygon(redpoints);
        red.setFilled(true);
        red.setFillColor(Color.red);
        add(red);

    }
    public static void main (String [] args){
        (new flagg()).start(args);
    }
}
