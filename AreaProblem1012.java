
package uriproblem;

import java.util.Scanner;


public class AreaProblem1012 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double A, B, C;
        
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        // a) Rectangled tringle
        double TRIANGULO = ((1*A*C)/2);
        System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
        
        // b) Radius circle
        double CIRCULO = (3.14159*C*C);
        System.out.printf("CIRCULO: %.3f\n",CIRCULO);
        
        // c) Trapezium
        double TRAPEZIO = (0.5*(A+B)*C);
        System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
        
        // d) Square
        double QUADRADO = (B*B);
        System.out.printf("QUADRADO: %.3f\n",QUADRADO);
        
        // e) Rectangle
        double RETANGULO = (A*B);
        System.out.printf("RETANGULO: %.3f\n",RETANGULO);
    }
    
}
