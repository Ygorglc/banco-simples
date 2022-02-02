package br.com.bancosimples.test;

import br.com.bancosimples.model.ContaCorrente;
import br.com.bancosimples.model.ContaPoupanca;
import br.com.bancosimples.model.SaldoInsuficienteException;

public class TesteContas {

    //java.lang.String
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());


    }

}
