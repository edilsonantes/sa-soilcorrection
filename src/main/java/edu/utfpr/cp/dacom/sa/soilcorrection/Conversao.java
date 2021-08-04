package edu.utfpr.cp.dacom.sa.soilcorrection;

public interface Conversao<T, R> {

    R converte(T valor);
}
