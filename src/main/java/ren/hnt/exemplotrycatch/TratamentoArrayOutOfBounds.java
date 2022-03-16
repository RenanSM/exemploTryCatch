/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ren.hnt.exemplotrycatch;

/**
 *
 * @author renan
 */
public class TratamentoArrayOutOfBounds {
    public static void main(String[] args) {
        
        int[] matrizA = new int[25];
        
        try{
            for(int i=1;i<150;i++){
            matrizA[i] = i;
            System.out.println("Posição "+(i-1)+"º, valor = "+matrizA[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("%nExceção encontrada: %s%n", e);
            System.out.println("Excesso no limite de elementos na matriz");
            
        }
        
        
        
    }
}
