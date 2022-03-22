
package com.mycompany.p1;
class Box {
    static double height, width, depth;
    static int count;
    void Box(double h, double w, double d, int c){
        height = h;
        width = w;
        depth = d;
        count = c;
    }
    void displayResult(){
        System.out.println("Volume for box "+ count + " is " + height * width * depth);
    }
    
}


package com.mycompany.p1;

public class Volume_Box {
    public static void main(String[] args) {
        Box vol = new Box();
        vol.Box(10, 10, 20, 1);
        vol.displayResult();
        vol.Box(23, 33, 40, 2);
        vol.displayResult();
        vol.Box(50, 40, 60, 3);
        vol.displayResult();
        vol.Box(1.40, 10.45, 20.34, 4);
        vol.displayResult();
    }
}
