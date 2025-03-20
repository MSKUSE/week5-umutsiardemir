public class Rectangle {

    private Point topLeft;
    private int sideA, sideB;

    public Point getTopLeft() {
        return topLeft;
    }

    public int getSideB() {
        return sideB;
    }

    public Rectangle(Point topLeft , int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setSideA(int sideA) {
       if(sideA < 0){
        this.sideA = sideA;
        System.out.println("sideA cant be negative");
    }else{
        this.sideA = sideA;
    } }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public Rectangle(int sideA) {
        this.sideA = sideA;
    }
    public int perimeter() {
        return 2*(this.sideA+this.sideB);
    }
    public int area() {
        return this.sideA*this.sideB;
    }
}


