public class Point {
    double x,y;
    Point(double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));

    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(p1.getDistance(origin));

    }
}