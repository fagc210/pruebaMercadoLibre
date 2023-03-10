package mercadolibre.com.mutantes;

import mercadolibre.com.mutantes.usescases.DnaValidateUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DnaValidateUseCaseTest {
    private DnaValidateUseCase dnaValidateUseCase = new DnaValidateUseCase();

    @Test
    public void isMutantTest(){
        String[] dna =  {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTT"};
        boolean resp = dnaValidateUseCase.isMutant(dna);
        Assertions.assertTrue(resp);
    }
    @Test
    public void isNotMutantTest(){
        System.out.println("isNoMutantTest");
        String[] dna =  {"ATGCGA","CCGTGC","TTATGT","AGAAGG","CCTCTA","TCACTT"};
        boolean resp = dnaValidateUseCase.isMutant(dna);
        Assertions.assertFalse(resp);
    }
    @Test
    public void validateInputDataTrueTest(){
        String[] dna =  {"ATGCGA","CCGTGC","TTATGT","AGAAGG","CCTCTA","TCACTT"};
        boolean resp= dnaValidateUseCase.validateInputData(dna);
        Assertions.assertTrue(resp);
    }
    /**
     * validacion de longitud de minimo 4
     */
    @Test
    public void validateMimColumsFalseTest(){
        String[] dna =  {"ATGCGA","CCGTGC","TTATGT","AGAAGG","CCTCTA"};
        boolean resp= dnaValidateUseCase.validateInputData(dna);
        Assertions.assertFalse(resp);;
    }

    /**
     * validacion longitud en filas
     */
    @Test
    public void validateRowsFalseTest(){
        String[] dna =  {"ATGCGA","CCGTGC","TTATGT","AGAAGG","CCTCTA","TCACT"};
        boolean resp= dnaValidateUseCase.validateInputData(dna);
        Assertions.assertFalse(resp);;
    }

    /**
     * validacion de tipo de letras
     */
    @Test
    public void validateInputDataFalseTest(){
        String[] dna =  {"ATGCGA","CCGTGC","TTATGT","AGAAGG","CCTCTA","TCACTP"};
        boolean resp= dnaValidateUseCase.validateInputData(dna);
        Assertions.assertFalse(resp);;
    }


}
