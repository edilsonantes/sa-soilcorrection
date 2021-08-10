package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.NonNull;

public interface Conversao<T, R> {

    R converte(@NonNull T valor);
}
