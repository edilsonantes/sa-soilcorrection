package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Getter @Setter @RequiredArgsConstructor
public class NutrienteAdicional {

    @NonNull private final NomeNutrienteAdicional nome;
    private final double teorNutriente;

    private double correcaoAdicional;
}
