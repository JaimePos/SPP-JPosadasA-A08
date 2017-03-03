
package spp.jposadasa.a08;

public class SPPJPosadasAA08 {

    public static void main(String[] args) {
        
        int sumaPar=0,sumaNon=0,promedio=0, contaPar=0, contaNon=0;
        
        int [][] matriz = {
            {10,30,89,48,56},{32,23,84,20,10},{23,43,12,26,54}
        };
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j=j+2){
                sumaPar = sumaPar + matriz[i][j];
                contaPar++;
                promedio = sumaPar/contaPar;
            }   
        };
        System.out.println("Suma de pares: " + sumaPar);
        System.out.println("Promedio de numeros: " + promedio);
        
        for(int i=0;i<matriz.length;i++){
            for(int j=1;j<matriz[i].length;j=j+2){
                sumaNon = sumaNon + matriz[i][j];
                contaNon++;
                promedio = sumaNon/contaNon;
            }   
        };
        System.out.println("Suma de nones: " + sumaNon);
        System.out.println("Promedio de numeros: " + promedio);   
    }   
}
