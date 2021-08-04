package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;
     @Getter private final double teorNutriente;

    @Getter @Setter private double correcaoAdicional;
}
