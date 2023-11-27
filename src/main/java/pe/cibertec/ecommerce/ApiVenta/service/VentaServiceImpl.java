package pe.cibertec.ecommerce.ApiVenta.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiVenta.dao.VentaRepository;
import pe.cibertec.ecommerce.ApiVenta.dto.Purchase;
import pe.cibertec.ecommerce.ApiVenta.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiVenta.entity.Venta;

@Service
@Slf4j
public class VentaServiceImpl implements VentaService {
    
    @Autowired
    private VentaRepository ventaRepository;
    
    @Override
    @Transactional
    public PurchaseResponse placeVenta(Purchase purchase) {
        log.info("Procesando solicitud para realizar una venta: {}", purchase);

        Venta venta = purchase.getVenta();
        venta.setTrackingNumber(getTrackingNumber());
        purchase.getDetalleVentas().forEach(i -> venta.addDetalleVenta(i));
        
        log.info("Guardando información de la venta en la base de datos.");
        ventaRepository.save(venta);

        log.info("Venta realizada exitosamente con número de seguimiento: {}", venta.getTrackingNumber());
        return new PurchaseResponse(venta.getTrackingNumber());
    }

    private String getTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
