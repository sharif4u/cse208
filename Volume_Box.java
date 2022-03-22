
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
