package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Set;
import lombok.NonNull;

public interface ICorrecaoNutriente<T extends IFonteNutriente> {
    
    default double calculaCusto(
            @NonNull double custoFonte,
            @NonNull double qtdeAplicar) {

        if (custoFonte <= 0) {
            throw new IllegalArgumentException();
        }

        if (qtdeAplicar <= 0) {
            throw new IllegalArgumentException();
        }

        return custoFonte * qtdeAplicar / 1000;
    }

    default Set<NutrienteAdicional> getNutrientesAdicionais(
            @NonNull double qtdeAplicar,
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
            @NonNull double qtdeNutrienteAdicionar,
            @NonNull double eficienciaNutriente) {

        if (qtdeNutrienteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (eficienciaNutriente <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeNutrienteAdicionar / eficienciaNutriente;
    }
}
