
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
