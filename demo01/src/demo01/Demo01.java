
package demo01;

    /** identify common properties & data types
     * create class 
    */ 

class Car{
    String color;
    int seats;
    int doors;
    
    void drive(){
      // do something  
    }
    
    void reverse(){
        // do something
    }
    
    void park(){
        // do something
    }
}

public class Demo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car mycar = new Car();
        mycar.color = "black";
        mycar.doors = 4;
        mycar.seats = 5;
    }
    
}
