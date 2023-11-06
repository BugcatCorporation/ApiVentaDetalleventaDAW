
package pe.cibertec.ecommerce.ApiVenta.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Usuario {
    
    private Long usuarioId;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    
}
