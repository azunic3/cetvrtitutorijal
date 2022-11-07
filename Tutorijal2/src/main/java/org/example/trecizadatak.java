package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class trecizadatak {
    private static int max;

    public static void main(String[] args){
        Scanner stringScanner = new Scanner(System.in);
        List<Integer> l=new ArrayList<Integer>();
        String n=stringScanner.next();
        while(!n.equals("stop")){
            if(isNumeric(n))
            {
                l.add(Integer.parseInt(n));
            }
            n=stringScanner.next();
        }
        int c=MAX(l);
        System.out.println("Max je " + c);
        double average=srednjaVrijednost(l);
        System.out.println("\nSrednja vrijednost je "+average);

    }
    public static boolean isNumeric(String args){
        try{
            int intValue=Integer.parseInt(args);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    public static int MAX(List<Integer>e){
        int max= e.get(0);
        for(int i=0;i<e.size();i++){
            if(e.get(i)>max)
                max=e.get(i);
        }
        return max;
    }
    public static int MIN(List<Integer>e){
        int min= e.get(0);
        for(int i=0;i<e.size();i++){
            if(e.get(i)>min)
                min=e.get(i);
        }
        return min;
    }
    public static double srednjaVrijednost(List<Integer>e){
        int suma=0;
        for(int i=0;i<e.size();i++)
            suma+=e.get(i);
        return (suma/e.size());
    }
    public static double standardDeviation(List<Integer> e){
        int suma=0;
        double x=srednjaVrijednost(e);
        for(int i=0;i<e.size();i++)
        {
            double c=e.get(i)-x;
            suma+=(Math.pow(c,2));
        }
        return Math.sqrt(suma/e.size());
    }
}
