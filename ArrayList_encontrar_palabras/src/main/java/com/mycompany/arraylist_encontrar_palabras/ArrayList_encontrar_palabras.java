/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraylist_encontrar_palabras;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ricar
 */
public class ArrayList_encontrar_palabras {

    public static void main(String[] args) {
        ArrayList<String> array_lista=new ArrayList<>(){};
        ArrayList<Integer> array_cont=new ArrayList<>(){};
        String usuario;
        int cont=0;
        Scanner teclado=new Scanner(System.in);
        array_lista.add("ricardo");
        array_lista.add("anabel");
        array_lista.add("joaquin");
        array_lista.add("lucia");
        array_lista.add("encarna");
        array_lista.add("pilar");
        array_lista.add("montse");
        array_lista.add("lucia");
        do{
        System.out.println("Que nombre desea buscar?o pulse S para salir");
        usuario=teclado.next();
        
        for(int i=0;i<array_lista.size();i++){
            if(array_lista.get(i).equals(usuario)){
                cont++;
                array_cont.add(i);
            }
        }
        if(cont>0){
                   System.out.println("el nombre "+usuario+" si que está en  la lista y se repite "+cont+" veces"+"y las posiciones de la lista son "+array_cont);
                   //for(int x=0;x<array_cont.size();x++){
                  // System.out.println("el nombre "+usuario+" si que está en  la lista y se repite en la posición"+array_cont.get(x));}
        }
        else{
            System.out.println("el nombre seleccionado "+usuario+" no está en la lista");}
        cont=0;
        array_cont.clear();
        }
        while(!"S".equals(usuario)); 
    }
}
