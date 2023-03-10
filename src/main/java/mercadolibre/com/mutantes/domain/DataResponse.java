package mercadolibre.com.mutantes.domain;

import lombok.*;

@Builder(toBuilder = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataResponse {
    String response;
}
