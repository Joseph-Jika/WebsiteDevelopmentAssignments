class Area{
    private int length;
    private int width;

    public Area(){

    }
    public Area(int newLength, int newWidth){
        this.length = newLength;
        this.width  = newWidth;
    }

    public double getArea(){
            double area = length * width;
            return area;

    }
    public void setArea(int newLength, int newWidth){
        this.length = newLength;
        this.width  = newWidth;
    }

}