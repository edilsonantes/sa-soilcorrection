package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;

public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;
     @Getter private final double teorNutriente;

    @Getter private double correcaoAdicional;

    public NutrienteAdicional(
        final NomeNutrienteAdicional nome, 
        double teorNutriente) {

        this.nome = nome;
        this.teorNutriente = teorNutriente;
    }

    public void setCorrecaoAdicional(double correcaoAdicional) {
        this.correcaoAdicional = correcaoAdicional;
    }
}
