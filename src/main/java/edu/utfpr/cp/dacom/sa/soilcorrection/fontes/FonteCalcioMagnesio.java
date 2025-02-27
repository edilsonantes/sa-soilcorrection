package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import java.util.Set;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;


@Getter @RequiredArgsConstructor
public enum FonteCalcioMagnesio
        implements IFonteNutriente {

    CALCARIO_DOLOMITICO(30.4, Set.of()),
    CALCARIO_CALCITICO(56.0, Set.of()),
    CALCARIO_CONCHA(54.0, Set.of()),
    GESSO_AGRICOLA(29.0, Set.of(NutrienteAdicional.builder().nome(NomeNutrienteAdicional.ENXOFRE).teorNutriente(0.15).build())),
    HIDROXIDO_CALCIO(75.7, Set.of()),
    CALCARIO_MAGNESIANO(35.0, Set.of());

    private final double teorFonte;
    @NonNull private final Set<NutrienteAdicional> nutrienteAdicionais;



    @Override
    public Set<NutrienteAdicional> getNutrientesAdicionais() {
        return this.nutrienteAdicionais;
    }

}
