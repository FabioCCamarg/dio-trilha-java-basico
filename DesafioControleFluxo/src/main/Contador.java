package main;

import exceptions.ParametrosInvalidosException;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Parametro 1:");
        int params1 = sc.nextInt();
        System.out.println("Digite o Parametro 2:");
        int params2 = sc.nextInt();

        try {

            contar(params1, params2);

        } catch (ParametrosInvalidosException e) {

            System.out.println(e.getMessage());
        }

    }

    static void contar(int params1, int params2) throws ParametrosInvalidosException {
        System.out.println("INICIANDO...");
        if (params1 < params2) {

            int interacao = params2 - params1;
            System.out.println("Quantidade de interacao: " + interacao);
            for (int i = params1; i <= params2; i++) {
                if (i == params2) {
                    System.out.print(i + " .");
                } else {
                    System.out.print(i + ", ");
                }

            }

        }else throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
    }

}
