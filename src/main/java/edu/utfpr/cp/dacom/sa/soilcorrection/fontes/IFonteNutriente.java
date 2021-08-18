package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;

import java.util.Set;

public interface IFonteNutriente {
    
    double getTeorFonte();
    Set<NutrienteAdicional> getNutrientesAdicionais();
}
