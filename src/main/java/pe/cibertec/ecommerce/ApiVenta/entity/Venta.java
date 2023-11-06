
package pe.cibertec.ecommerce.ApiVenta.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Ventas")

public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ventaId;
    @Embedded
    private Usuario usuario;
    private Date Fecha;
    private BigDecimal Cantidad;
    private String trackingNumber;
    @OneToMany(mappedBy = "venta",cascade = CascadeType.ALL)
    private Set<DetalleVenta> detalleVentas;
    
   public void addDetalleVenta(DetalleVenta detalleVenta){
       if(detalleVentas==null){
           detalleVentas=new HashSet<>();
           
       }
       detalleVentas.add(detalleVenta);
       detalleVenta.setVenta(this);
   }
    
}
