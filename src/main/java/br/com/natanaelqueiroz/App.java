package br.com.natanaelqueiroz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        /*
         mostre()
         leia()
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite um numero para X");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Digite um numero para Y");
        int y = Integer.parseInt(reader.readLine());

        var resultado = (x * 8 + y) - x + y / 100;
        
        System.out.println("O resultado dessa expressão é " + resultado);
        
        /*
        System.out.println("Digite um número");
        int numero = Integer.parseInt(reader.readLine());
        var resultado = numero + 1000;
        System.out.println("O resultado de (" + numero + ") + 1000 é de : " + resultado);
        */

        /* 
        //mostre()
        System.out.println("Digite o seu nome");

         //leia()
        var nome = reader.readLine();
        
        //mostre() mostrando dados concatenando variável nome
        System.out.println("O nome digitado foi: " + nome);

        //  String name = reader.readLine();

        //  int numero1 = 3;
        //  var numero2 = 5;

        //  int soma = numero1 + numero2;

        // System.out.println( "O resultado da operação é " + soma );
        */
    }
}
