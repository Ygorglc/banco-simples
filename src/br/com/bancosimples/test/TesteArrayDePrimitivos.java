package br.com.bancosimples.test;

import br.com.bancosimples.model.Cliente;
import br.com.bancosimples.model.ContaCorrente;
import br.com.bancosimples.model.ContaPoupanca;


public class TesteArrayDePrimitivos {

    //Array []
    public static void main(String[] args) {

        int[] idades = new int[5];//inicializa o array com 0

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }

}
