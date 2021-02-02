
package demo01;

    /** identify common properties & data types
     * create class 
    */ 

class Car{
    String color;
    int seats;
    int doors;
    
    void drive(){
      System.out.println("Drive\n");
    }
    
    void reverse(){
        System.out.println("Reverse\n");
    }
    
    void park(){
        System.out.println("Park\n");
    }
}

class Number{
    
    void numbers(){
    int i = 1;
    //declare & initialize variables
    
    while( i < 10) //loop as long as i<10
    {
    System.out.println("i"); //print values for i
    i++;
    }
    }
}

public class Demo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // add properties to varibales specific to that object
        Car mycar = new Car();
        mycar.color = "black";
        mycar.doors = 4;
        mycar.seats = 5;
        
        
        //call methods for that object
        mycar.drive();
        mycar.reverse();
        mycar.park();
        
        //call number() method
        Number c = new Number(); //create an object of Number class
        c.numbers(); //call number() method for new object. 
    }
    
}
