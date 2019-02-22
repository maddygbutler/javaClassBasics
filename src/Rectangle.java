public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }

    public double getWidth() { return width; }

    public void setLength(double length) { this.length = length; }

    public void setWidth(double width) {this.width = width; }

    public double getArea(){return length*width; }

    public double getDiagonal(){ return java.lang.Math.sqrt(length*length + width*width); }

    public boolean isSquare(){
        boolean output= false;
        if(length==width){
            output=true;
        }
        return output;

    }

    public String toString() {
        return "It's a rectangle with length=" + length + " and width=" + width;
    }
}
