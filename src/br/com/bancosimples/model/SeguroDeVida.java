package br.com.bancosimples.model;


public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }

}
