/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora30;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Calculadora30 {

    public static void main(String[] args) {
        
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2"));

        Operaciones3 oper=new Operaciones3();
        int suma=oper.sumar(n1,n2);
        int resta=oper.resta(n1, n2);
        int multiplicacion=oper.multiplicacion(n1, n2);
        int division=oper.division(n1,n2);
        int modulo=oper.modulo(n1,n2);
        oper.mostrarResultados(suma, resta, multiplicacion, division,modulo);
        
    }
    }

