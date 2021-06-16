// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height

import java.lang.Math.*;
public class EquilateralTriangle {

    private double base;
    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        if(base > 0){
            this.base = base;
        }
    }

    public double area(){
        double height = Math.sqrt(3) * base / 2;
        return (height * this.base)/2;
    }

    public double perimeter(){
        return 3*this.base;
    }
}