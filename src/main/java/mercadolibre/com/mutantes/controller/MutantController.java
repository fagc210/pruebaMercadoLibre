package mercadolibre.com.mutantes.controller;

import mercadolibre.com.mutantes.domain.DataResponse;
import mercadolibre.com.mutantes.domain.Dna;
import mercadolibre.com.mutantes.usescases.DnaValidateUseCase;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.http.HttpResponse;

@RestController
public class MutantController {
    private DnaValidateUseCase dnaValidateUseCase = new DnaValidateUseCase();

    @PostMapping("/mutant")
    public ResponseEntity<DataResponse> DnaValidate(@RequestBody Dna dna){

        if(dnaValidateUseCase.validateInputData(dna.getDna())){
            boolean isMutant = dnaValidateUseCase.isMutant(dna.getDna());
            if(isMutant){
                return new ResponseEntity<DataResponse>(HttpStatus.OK);
            }else{
                return new ResponseEntity<DataResponse>(HttpStatus.FORBIDDEN);
            }
        }else{
            return new ResponseEntity<DataResponse>(HttpStatus.FORBIDDEN);
        }



    }
}
