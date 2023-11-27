package pe.cibertec.ecommerce.ApiVenta.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class VentaController {
    
    @Autowired
    private VentaService ventaService;

    @PostMapping("/placeVenta")
    public ResponseEntity<PurchaseResponse> placeOrder(@RequestBody Purchase purchase) {
        try {
            log.info("Recibiendo solicitud para realizar una venta: {}", purchase);
            PurchaseResponse response = ventaService.placeVenta(purchase);
            log.info("Venta realizada exitosamente con número de seguimiento: {}", response.getTrackingNumber());
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error al procesar la solicitud de venta", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
