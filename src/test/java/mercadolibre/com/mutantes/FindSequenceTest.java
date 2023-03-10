package mercadolibre.com.mutantes;

import mercadolibre.com.mutantes.usescases.DnaValidateUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

public class FindSequenceTest {
    private DnaValidateUseCase  dnaValidateUseCase = new DnaValidateUseCase();

    /**
     * valida encontar una secuencia
     */
    @Test
    public void findVerticalOneTest(){
        String[] dna =  {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTT"};
        int verticales = dnaValidateUseCase.findVertical(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(1,verticales);
    }
    /**
     * valida encontar dos secuencia
     */
    @Test
    public void findVerticalTowTest(){
        String[] dna =  {"ATGCGA","AAGTGC","ATATGT","AGAAGG","CCCCTA","TCACTT"};
        int verticales = dnaValidateUseCase.findVertical(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(2,verticales);
    }
    /**
     * valida no encontar  secuencias
     */
    @Test
    public void findVerticalZeroTest(){
        String[] dna =  {"ATGCGA","TAGTGC","ATATGT","AGAATG","CCCCTA","TCACTT"};
        int verticales = dnaValidateUseCase.findVertical(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(0,verticales);
    }

    @Test
    public void findHorizontalOneTest(){
        String[] dna =  {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTT"};
        int horizontal = dnaValidateUseCase.findHorizontal(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(1,horizontal);
    }

    @Test
    public void findHorizontalTowTest(){
        String[] dna =  {"ATGCGA","AAGTGC","ATTTTT","AGAAGG","CCCCTA","TCACTT"};
        int horizontal = dnaValidateUseCase.findHorizontal(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(2,horizontal);
    }

    @Test
    public void findHorizontalZeroTest(){
        String[] dna =  {"ATGCGA","TAGTGC","ATATGT","AGAATG","CCGCTA","TCACTT"};
        int horizontal = dnaValidateUseCase.findHorizontal(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(0,horizontal);
    }

    @Test
    public void findObliqueTest(){
        String[] dna =  {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTT"};
        int oblique = dnaValidateUseCase.findOblique(dnaValidateUseCase.convertArrayString2Matrix(dna));
        Assertions.assertEquals(1,oblique);
    }


}
