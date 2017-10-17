/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leilao;

     import java.io.IOException;
     import java.net.ServerSocket;
     import java.net.Socket;
     import java.util.Scanner;
     import java.sql.*;
/**
 *
 * @author Luana
 */
public class Servidor {

         public static void main(String[] args) throws IOException {
              
             Integer idsuario;
              
             ServerSocket servidor = new ServerSocket(12345);
             System.out.println("Porta 12345 aberta!");

             Socket cliente = servidor.accept();
             System.out.println("Nova conexão com o cliente " +
                 cliente.getInetAddress().getHostAddress());

             Scanner entrada = new Scanner(cliente.getInputStream());
             while (entrada.hasNextLine()) {
                  idusuario=entrada.nextLine();
                  System.out.println(idusuario);
                  
                  if(txt.equals("select * from idusuario where usuario")){
                  saida.println("Usuario correto");
                  }
                  else{
                  saida.println("usuario incorreto");
                  }
             }

             entrada.close();
             servidor.close();
         }
     }
}
