/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
//import paquetedatos.*;
import paquetedatos.VariableJava; /* es valido */
import paquetedatos.VariableDatos;
/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        //metodo principal
        double resultado;
        resultado = VariableJava.numero1 +VariableJava.numero2;
        
        System.out.printf("El resultado es; %.1f", resultado);
        
        double resultado2;
        resultado2 = VariableJava.numero1 + VariableDatos.numero3;
        System.out.printf("El resultado es; %.1f", resultado2);
   } 
}
