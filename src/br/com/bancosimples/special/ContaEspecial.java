package br.com.bancosimples.special;

import br.com.bancosimples.model.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

}