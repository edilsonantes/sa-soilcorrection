package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import java.util.Set;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Getter @RequiredArgsConstructor
public enum FontePotassio implements IFonteNutriente {
    CLORETO_POTASSIO(0.58, Set.of()),
    SULFATO_POTASSIO(0.52, Set.of(NutrienteAdicional.builder().nome(NomeNutrienteAdicional.ENXOFRE).teorNutriente(0.17).build())),
    SULFATO_POTASSIO_MAGNESIO(0.22, Set.of(NutrienteAdicional.builder().nome(NomeNutrienteAdicional.ENXOFRE).teorNutriente(0.22).build(),
            NutrienteAdicional.builder().nome(NomeNutrienteAdicional.MAGNESIO).teorNutriente(0.18).build()));
    
    private final double teorFonte;
    @NonNull private final Set<NutrienteAdicional> nutrientesAdicionais;

    @Override
    public Set<NutrienteAdicional> getNutrientesAdicionais() {
        return this.nutrientesAdicionais;
    }
}
