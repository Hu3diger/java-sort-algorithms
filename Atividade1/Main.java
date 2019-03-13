package Atividade1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        double salario;
       Funcionario funcionarios[] = new Funcionario[10];

        for(int i = 0; i < 10; i ++){
            System.out.println("Digite o nome do " +(i+1)+"º funcionario");
            nome = in.next();
            System.out.println("\"Digite o salario do " +(i+1)+"º funcionario\"");
            salario = in.nextDouble();

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(nome);
            funcionario.setSalario(salario);
            funcionarios[i] = funcionario;

        }

        organizaCrescente(funcionarios);
        organizaDecrescente(funcionarios);
        organizaAlfabetico(funcionarios);

    }
    public static void organizaCrescente(Funcionario[] funcionarios){
        Funcionario aux;

            for (int i = 0; i <= funcionarios.length; i++) {
                for(int j = 0;j<funcionarios.length-1;j++) {
                    if (funcionarios[j].getSalario() > funcionarios[j + 1].getSalario()) {

                        aux = funcionarios[j];

                        funcionarios[j] = funcionarios[j + 1];

                        funcionarios[j + 1] = aux;
                    }
                }
            }
        System.out.println("///////Crescente/////////");
        for (int i = 0; i< funcionarios.length ; i++) {
            System.out.println(funcionarios[i].toString());
        }

    }




    public static void organizaDecrescente(Funcionario[] funcionarios){
        Funcionario aux;

        for (int i = 0; i <= funcionarios.length; i++) {
            for(int j = 0;j<funcionarios.length-1;j++) {
                if (funcionarios[j].getSalario() < funcionarios[j + 1].getSalario()) {

                    aux = funcionarios[j];

                    funcionarios[j] = funcionarios[j + 1];

                    funcionarios[j + 1] = aux;
                }
            }
        }
        System.out.println("///////Decrescente//////");
        for (int i = 0; i< funcionarios.length ; i++) {

            System.out.println(funcionarios[i].toString());

        }
    }

    public static void organizaAlfabetico(Funcionario[] funcionarios){
        int j;
        boolean flag = true;
        Funcionario aux;

        while ( flag )
        {
            flag = false;
            for ( j = 0;  j < funcionarios.length - 1;  j++ )
            {
                if ( funcionarios[ j ].getNome().compareToIgnoreCase( funcionarios[ j+1 ].getNome() ) > 0 )
                {
                    aux = funcionarios[ j ];
                    funcionarios[ j ] = funcionarios[ j+1];
                    funcionarios[ j+1] = aux;
                    flag = true;
                }
            }
        }

        System.out.println("///////Alfabetico//////");
        for (int i = 0; i< funcionarios.length ; i++) {

            System.out.println(funcionarios[i].toString());

        }
    }
}

