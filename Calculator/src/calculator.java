
import java.util.Scanner;
import jdk.dynalink.Operation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class calculator {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("a ni daxil et:");
        double a=sc.nextDouble();
        
        System.out.println("b ni daxil et:");
        double b=sc.nextDouble();
        
        System.out.println("operationu nu daxil et:+1, -2 ,*3 ,,/4 :");
        double c=sc.nextInt();
        
        double result=0;
        if(c ==1){
            result=topla(a, b);
        }
        else if(c==2){
            result=cix(a, b);
        }
        else if(c==3){
            result =vur(a, b);
        }
       else if(c==4){
            result=bol(a, b);
        }
       else{
            System.out.println("Operatino is invaild");
       }
        System.out.println("REsult="+result);
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static double cix(double a, double b) {
        return a - b;
    }

    public static double vur(double a, double b) {
        return a * b;
    }

    public static double bol(double a, double b) {
        return a / b;
    }

}
