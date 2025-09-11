package roberPSI.util;

import java.util.Scanner;

public class Util {
    public static int lerInt(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        return i;
    }
    
    public static String lerString(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        return s;
    }
    
    public static float lerFloat(){
        Scanner in = new Scanner(System.in);
        float f = in.nextFloat();
        return f;
    }
    
    public static double lerDouble(){
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        return d;
    }
}
