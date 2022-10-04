public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    
    //complete the constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    //create a printArea method
    public void printArea(){
        int area = width*height;
        System.out.println(area);
    }
    
    //setter method, need to be able to set width and height
    public void setTheThing(int newHeight, int newWidth){
        height = newHeight;
        width = newWidth;
    }
    
    
    
    /**
     * This is the toString method. It returns a String
     * representation of the object. See what happens
     * if you print out the object without a toString.
     */
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}