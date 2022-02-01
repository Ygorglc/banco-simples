package br.com.bancosimples.model;

public class SaldoInsulficienteException extends Exception{

    public SaldoInsulficienteException(String msg) {
        super(msg);
    }

}