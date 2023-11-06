
package pe.cibertec.ecommerce.ApiVenta.dto;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.ecommerce.ApiVenta.entity.DetalleVenta;
import pe.cibertec.ecommerce.ApiVenta.entity.Venta;

@Getter
@Setter
public class Purchase {
     private Venta venta;
    private Set<DetalleVenta> detalleVentas; 
    
}
