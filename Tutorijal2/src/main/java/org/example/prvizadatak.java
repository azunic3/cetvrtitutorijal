package org.example;

class matematika{
    public static int faktorijel(double n){
        int fakt=1;
        for(int i=1;i<=n;i++)  {
            fakt*=i;
        }
        return fakt;
    }
    public static double sinus(double n){
        int sinus=0; int br=0,stepen=1;
        for(int i=1;i<=10;i++){
            sinus+= Math.pow(-1,br)*Math.pow(n,stepen)/ matematika.faktorijel(stepen);
            stepen+=2;
            br++;
        }
        return sinus;
    }
}
