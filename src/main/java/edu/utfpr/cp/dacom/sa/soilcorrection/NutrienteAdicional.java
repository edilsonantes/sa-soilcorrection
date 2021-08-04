package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.Setter;

public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;
     @Getter private final double teorNutriente;

    @Getter @Setter private double correcaoAdicional;

    public NutrienteAdicional(
        final NomeNutrienteAdicional nome, 
        double teorNutriente) {

        this.nome = nome;
        this.teorNutriente = teorNutriente;
    }
}
