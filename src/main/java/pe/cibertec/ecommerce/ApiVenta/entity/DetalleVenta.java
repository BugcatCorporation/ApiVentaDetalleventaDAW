
package pe.cibertec.ecommerce.ApiVenta.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter


public class DetalleVenta {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleVentaId;
    @Embedded
    private Producto producto;
    private BigDecimal descuento;
    private BigDecimal subTotal;
    @ManyToOne
    @JoinColumn(name = "ventaId")
    private Venta venta;

    
    
}
