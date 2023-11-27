
package pe.cibertec.ecommerce.ApiVenta.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable
public class Producto {
    private Long productoId;
    private String nombreproducto;
    private BigDecimal precio;
    private BigDecimal cantidad;
    
}
