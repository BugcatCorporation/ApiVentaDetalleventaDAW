
package pe.cibertec.ecommerce.ApiVenta.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable
public class Producto {
    private Long productId;
    private String productName;
    private BigDecimal unitPrice;
    private BigDecimal quantity;
    
}
