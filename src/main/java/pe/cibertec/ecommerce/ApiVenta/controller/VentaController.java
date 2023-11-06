
package pe.cibertec.ecommerce.ApiVenta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiVenta.dto.Purchase;
import pe.cibertec.ecommerce.ApiVenta.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiVenta.service.VentaService;

@RestController
@RequestMapping("api/v1/venta")

public class VentaController {
    
    @Autowired
    private VentaService ventaService;
    @PostMapping("/placeVenta")
    public ResponseEntity<PurchaseResponse> placeOrder(@RequestBody Purchase purchase){
        return new ResponseEntity<>(ventaService.placeVenta(purchase),HttpStatus.CREATED);
    }
}
