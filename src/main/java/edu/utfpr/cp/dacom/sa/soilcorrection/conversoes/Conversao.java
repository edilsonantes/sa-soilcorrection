package edu.utfpr.cp.dacom.sa.soilcorrection.conversoes;

import lombok.NonNull;

public interface Conversao<T, R> {

    R converte(@NonNull T valor);
}
