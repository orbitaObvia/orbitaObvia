/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leilao;

/**
 *
 * @author Luana
 */
     import java.io.IOException;
     import java.io.PrintStream;
     import java.net.Socket;
     import java.net.UnknownHostException;
     import java.util.Scanner;
     import java.sql.*;

     public class Cliente {
         public static void main(String[] args)
                         throws UnknownHostException, IOException {
             
             Integer idusuario; 
             
             if(idusuario=="select * from idusuario where usuario") {
             
             Scanner teclado = new Scanner(cliente.getOutputStream());
             PrintStream saida = new PrintStream(cliente.getOutputStream());

             while (teclado.hasNextLine()) {
             saida.println(teclado.nextLine());
             
             saida.close();
             teclado.close();
             
             }
             
             else{
             
             
             }
           
               System.out.println("O cliente se conectou ao servidor!");

            
             }

             
         }
     }
