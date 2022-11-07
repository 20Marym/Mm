import java.awt.*;
public class Betterrectangle3 extends Rectangle {
    public Betterrectangle3(int x, int y, int width, int height)
    {
        super(x,y,width,height);
        setLocation(x,y);
        setSize(width,height);
    }
    public double getPerimeter()
    {
        double Perimeter=2*(super.getHeight()+super.getWidth());
        return  Perimeter;
    }
    public double getArea()
    {
        double Area=super.getHeight()*super.getWidth();
        return Area;
    }
}

