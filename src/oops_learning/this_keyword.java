// this keyword points to self class. It can aslo be used for explicit constructor invocation.
// ex ->

class Rectangle{
    private int x, y;
    private int width , height;

    public Rectangle(){
        this(0,0,1,1);
    }

    public Rectangle(int w , int h){
        this(0,0,w,h);
    }

    public Rectangle(int x , int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public void display(){
        System.out.println("x,y,width,height: " + this.x + "," + this.y + "," + this.width + "," + this.height);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.display();
        
    }
}
