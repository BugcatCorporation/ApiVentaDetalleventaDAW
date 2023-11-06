
package pe.cibertec.ecommerce.ApiVenta.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiVenta.entity.Venta;


public interface VentaRepository  extends JpaRepository<Venta, Long> {
    
}
