package edu.utfpr.cp.dacom.sa.soilcorrection.correcoes.interfaces;

import java.util.Set;

import edu.utfpr.cp.dacom.sa.soilcorrection.fontes.IFonteNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;
import lombok.NonNull;

public interface ICorrecaoNutriente<T extends IFonteNutriente> {
    
    default double calculaCusto(
            double custoFonte,
            double qtdeAplicar) {

        if (custoFonte <= 0) {
            throw new IllegalArgumentException();
        }

        if (qtdeAplicar <= 0) {
            throw new IllegalArgumentException();
        }

        return custoFonte * qtdeAplicar / 1000;
    }

    default Set<NutrienteAdicional> getNutrientesAdicionais(
            double qtdeAplicar,
            @NonNull T fonteNutriente) {

        fonteNutriente
            .getNutrientesAdicionais()
            .forEach(
                item -> 
                        item.setCorrecaoAdicional(
                                item.getTeorNutriente() * qtdeAplicar)
            );

        return fonteNutriente.getNutrientesAdicionais();
    }

    default double calculaEficienciaNutriente(
            double qtdeNutrienteAdicionar,
            double eficienciaNutriente) {

        if (qtdeNutrienteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (eficienciaNutriente <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeNutrienteAdicionar / eficienciaNutriente;
    }
}
