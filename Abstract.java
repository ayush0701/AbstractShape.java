abstract class Shape{
   
    Shape(){
       
    }
     void area(){
             System.out.println("Method for calculating area " );
        }
        void parameter(){
            System.out.println("Method for calculating parameter of shape" );
        }
    
    
}
class Rectangle extends Shape{
    Rectangle(){
        System.out.println("This is rectangle ");
    }
    void area(){
        int length = 12;
        int breadth = 23;
        System.out.println(" the area of the rectangle is " +  length*breadth);
    }
    void parameter( ){
        int length = 12;
        int breadth = 13;
System.out.println(" the parameter of rectangle is " + 4*(length+breadth));
    }
}

class Square extends Shape{
    Square(){  
        System.out.println("This is square ");
    }
    void area(){
        int side = 4;
        System.out.println(" the area of the square is " +  side*side);
    }
    void parameter( ){
        int side = 5;
System.out.println(" the parameter of square is " + 4*side);
    }
}

class Circle extends Shape{
    Circle(){
        System.out.println(" this is circle ");
    }
    void area(){
        int r = 12;
        System.out.println(" the area of circle is "+ 3.14*r*r);
    }
    void circumference(){
        int rad = 3;
        System.out.println("The circumference of circle is " + 2*3.14*rad);
        
    }

}

 



public class Abstract {
    static void call (Shape shape){
        shape.area();
        shape.parameter();
        if(shape instanceof Circle){
            ((Circle)shape).circumference(); // Downcasting
         }
        
    }

    public static void main(String[] args) {
        call(new Rectangle());
        call(new Square());
        call(new Circle());
    }
}