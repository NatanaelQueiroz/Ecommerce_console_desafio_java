package br.com.natanaelqueiroz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

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

        /*
        Paula tem uma petshop, ela está precisando de um sistema
        para controlar seus serviços. neste sistema, precisa cadastrar
        o cliente (Dados básicos) os dados do Pet e o peso do pet,
        depois o sistema deverá calcular o valor do banho, pelo peso
        qual será este calculo:
        - Para macho:
            (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100
        - Para femêa
            (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100
        Feito o calculo o sistema deverá mostrar um relatório com os dados do
        pedido e o valor total a pagar.
        Coloque uma usabilidade agradável
        */

        /* 
        var mensagem = "[ Petshop da Paula ]\nVamos começar?";
        JOptionPane.showMessageDialog(null, mensagem);
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do(s) " + nome);
        String nomeDoPet = JOptionPane.showInputDialog("Digite o nome do Pet");
        double pesoDoPet = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do(a) " + nomeDoPet));
        int sexoPet = Integer.parseInt(JOptionPane.showInputDialog("O(a) " + nomeDoPet + " é macho ou fêmea ?\n1 - Macho\n2 - Fêmea"));
        double valorPorPeso = Double.parseDouble(JOptionPane.showInputDialog("Digite o R$ valor por peso"));
        // String nome = "Fabiana";
        // String telefone = "(11) 99999-9999";
        // String nomeDoPet = "Maikey";
        // double pesoDoPet = 20.5;
        // int sexoPet = 1;
        // double valorPorPeso = 2.6;
        double resultado = 0;
        if(sexoPet == 2){
            resultado = (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100;
        }
        else{
            resultado = (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100;
        }
       
        String relatorio = "Nome do cliente: " + nome + "\n";
        relatorio += "Telefone do(a) " + nome + ": " + telefone + "\n";
        relatorio += "Pet do(a) " + nome + ": " + nomeDoPet + "\n";
        relatorio += "Peso do(a) " + nomeDoPet + ": " + pesoDoPet + "\n";
        Locale localeBR = new Locale( "pt", "BR" );  
        NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);  
        String valorFormatado = dinheiroBR.format(resultado);
        relatorio += "Valor total do serviço: " + valorFormatado;
        //System.out.println(relatorio);
        JOptionPane.showMessageDialog(null, relatorio);
        */

       
        // === tipos primitivos mais utilizados
        // int inteiro = 5;
        // double moeda = 5.99;
        // char umCaractere = 'D';
        // boolean verdadeiroFalso = true;
        // String texto = "Hello";

        // double restoDivisao = 3.5/2;
        // System.out.println("O resto da divisão é: " + restoDivisao);

        // var hojeEstaFrio = false;
        // System.out.println("O tempo está frio?: " + hojeEstaFrio);

        // var moeda = 4.5;
        // var inteiro = 4;
        // var stringNumero = "8";

        // var valor  = moeda * inteiro;
        // var valor2 = moeda - inteiro;
        // var valor3 = moeda + inteiro + Double.parseDouble(stringNumero);

        // System.out.println("Resultado: " + valor3);

        //== concatenações
        // var rotulo = "Nome: ";
        // var nome = "Leandro";

        // var dadoCompleto = rotulo + nome;
        // System.out.println("Dado: " + dadoCompleto);

        // var dadoCompleto = rotulo.concat(nome);
        // System.out.println("Dado: " + dadoCompleto);

        // var resultado = String.format("O valor de nome é: %s e o valor de rotulo é: %s", nome, rotulo);
        // System.out.println(resultado);

        // var calculo = 4.555;
        // System.out.printf( "O resultado é %.2f", calculo); // mostrar número com 2 cadas decimais

        /*
         * João tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereco do seu cliente
         * o nome do material de construção
         * o valor do material de contrução
         * e a quantidade que o cliente deseja
         * se a compra do cliente for maior que 100, fale que ele terá desconto na proxima
         * no final final do programa, mostre um relatório com o valor total do produto comprado
         * -----------------------------
         * Cliente: João
         * Endereço de entrega: Rua ...
         * Comprou o material: XXX no valor de R$ XXX
         * O valor total da compra deu: R$ XXX
         * Seu pedido foi maior que R$ 100 e você terá um desconto na proxima
         * -----------------------------
         */

        // == padrão americano
        // double d = 1243123.1;
        // DecimalFormat df = new DecimalFormat("###,###.00");
        // System.out.println(df.format(d));


        //== padrão Brasil
        // double d = 1243123.1;
        // Locale localeBR = new Locale( "pt", "BR" );  
        // NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);  
        // System.out.println(dinheiroBR.format(d));


        //== comparação em java com operadores lógicos
        // int numero1 = 2;
        // int numero2 = 1;

        // operador lógico && = e
        // operador lógico || = ou
        // var resultado = numero1 <= numero2 || numero1 > numero2;
        // var resultado2 = numero1 <= numero2 && numero1 > numero2;
        // System.out.println( resultado );

        // var inicial = "01/01/20222";
        // var dataFinal = "30/01/20222";
        // var diaCorrente = "15/01/2022";
        // var diaCorrenteEntreDataInicialEFinal = diaCorrente >= inicial && diaCorrente <= dataFinal;

        // var inicial = 1;
        // var diaFinal = 30;
        // var diaCorrente = 15;
        // var diaCorrenteEntreDataInicialEFinal = diaCorrente >= inicial && diaCorrente <= diaFinal;
        // System.out.println(diaCorrenteEntreDataInicialEFinal);

        //=== conticionais
        // int valorTotal2 = 101;
        // if(valorTotal2 > 100){
        //     System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");
        //     System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");
        // }

        // if(valorTotal2 > 100) System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");

        //=== ternário
        // var resultado = "Padrão";
        // resultado = valorTotal2 > 100 ? "Foiii verdade" : "";
        // System.out.println(resultado);

        System.out.println("==============[ Calculo produto/cliente ]===================");
        System.out.println("Olá João seja muito bem vindo, vamos começar?");
        
        System.out.println("Digite o nome do seu cliente: ");
        var nome = reader.readLine();

        System.out.println("Digite o endereço do seu cliente: ");
        var endereco = reader.readLine();

        System.out.println("Digite o nome do produto: ");
        var produto = reader.readLine();

        System.out.printf("Digite o valor do produto (%s): ", produto);
        var valor = Double.parseDouble(reader.readLine());

        System.out.printf("Digite a quantidade do produto (%s): ", produto);
        var quantidade = Integer.parseInt(reader.readLine());
         
        var valorTotal = valor * quantidade;

        System.out.println("-----------------------------");
        System.out.printf("Cliente: %s \n", nome);
        System.out.printf("Endereço de entrega: %s \n", endereco);
        System.out.printf("Comprou o material: %s no valor de R$ %s \n", produto, valor);
        System.out.printf("O valor total da compra deu: R$ %.2f \n", valorTotal);

        if(valorTotal > 100){
            System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");
        }

        System.out.println("-----------------------------");


        // System.out.printf("Digite um valor \n");
        // var valorString = reader.readLine();
        // valorString = valorString.replace(".", "");
        // valorString = valorString.replace(",", ".");
        // var valor = Double.parseDouble(valorString);

        // Locale localeBR = new Locale( "pt", "BR" );  
        // NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);  
        // System.out.printf("O valor total da compra deu: R$ %s \n", dinheiroBR.format(valor));

        // System.out.printf("Teste %s %n", 4.5);
        // System.out.println("Segunda Linha");
        
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
