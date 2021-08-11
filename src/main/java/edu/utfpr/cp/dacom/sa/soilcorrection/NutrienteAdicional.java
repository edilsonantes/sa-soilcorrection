package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.Builder;

@Getter @Setter @Builder
public class NutrienteAdicional {

    @NonNull private final NomeNutrienteAdicional nome;
    private final double teorNutriente;

    private double correcaoAdicional;
}
