package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.NonNull;

public interface ICorrecaoNutrienteQuantidadeAplicar<T extends IFonteNutriente> {
    
    default double calculaQuantidadeAplicar(
            @NonNull double necessidade,
            @NonNull T fonteNutriente) {

        if (necessidade <= 0) {
            throw new IllegalArgumentException();
        }

        return necessidade / fonteNutriente.getTeorFonte();
    }
}
