package edu.dmacc.codedsm.hw5;

public class Calculator {

    public static void main(String[] args) {

        double a = Math.sqrt(27); // square root of 27
        System.out.println("a = "+ a);

        int b = 28 / 5 ;   // 28 divided by 5
        System.out.println("b = "+ b);

        double c = Math.pow(2.2 , 4);
        System.out.println("c = "+ c);

        double d = Math.random() * 10 ;
        System.out.println("d = "+ (int) d); // cast the final answer to get the response as integer
    }
}
