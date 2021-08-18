package edu.utfpr.cp.dacom.sa.soilcorrection.correcoes;

import lombok.NonNull;

public class EquilibrioCorrecaoCTC {

    public double calculaSCmol(
            @NonNull double potassio,
            @NonNull double calcio,
            @NonNull double magnesio) {
        
        return potassio + calcio + magnesio;
    }

    public double calculaCTCCmol(
            @NonNull double potassio,
            @NonNull double calcio,
            @NonNull double magnesio,
            @NonNull double hidrogenioAluminio) {
    
        return calculaSCmol(potassio, calcio, magnesio) + hidrogenioAluminio;
    }

    public double calculaVPercentual(@NonNull double Scmol, @NonNull double CTCcmol) {
        
        if (Scmol > 0 && CTCcmol > 0) {
            return Scmol / CTCcmol * 100;
            
        } else {
            return 0.0;
        }
    }

    public double calculaMOPercentual(@NonNull double mo) {
        if (mo > 0) {
            return mo / 10;
            
        } else {
            return 0.0;
        }
    }

    public double calculaCarbono(@NonNull double moPercentual) {
        
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
            
        } else {
            return 0.0;
        }
    }

}
