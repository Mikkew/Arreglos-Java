package arreglos;

import java.util.*;

public class Arreglos {

    public static void main(String[] args) {
        String productos[] = new String[5];
        productos[0] = "Juan";
        productos[1] = "Mario";
        productos[2] = "Karla";
        productos[3] = "Anastasia";
        productos[4] = "Roberto";

        //Ordena de menor a mayor sin importar letra o numero
        Arrays.sort(productos);
        
        //Incrementando
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }
        
        System.out.println();
        
        //Ordena de mayor a menor sin importar letra o numero
        Arrays.sort(productos, Collections.reverseOrder());
        
        //Decrementando
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }
        
        System.out.println();

        int numeros[] = {12, 3, 43, 62, 653, 45, 5, 8, 2};

        Arrays.sort(numeros);
        
        //Incrementado
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }
        
        System.out.println();
        
        //Decrementado
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println("numero " + (i+1) + " = " + numeros[i]);
        }
        
        System.out.println();
        
        for(int i=0; i< numeros.length - 1; i++){
            System.out.println("numero " + (i+1) +" = " + numeros[i]);
        }
    }
    
    
}
