
package pe.cibertec.ecommerce.ApiVenta.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiVenta.dao.VentaRepository;
import pe.cibertec.ecommerce.ApiVenta.dto.Purchase;
import pe.cibertec.ecommerce.ApiVenta.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiVenta.entity.Venta;

@Service
public class VentaServiceImpl implements VentaService {
    
    @Autowired
    private VentaRepository ventaRepository;
    
    @Override
    @Transactional
    public PurchaseResponse placeVenta(Purchase purchase) {
        Venta venta = purchase.getVenta();
        venta.setTrackingNumber(getTrackingNumber());
        purchase.getDetalleVentas().forEach(i->{venta.addDetalleVenta(i);});        
        ventaRepository.save(venta);
        return new PurchaseResponse(venta.getTrackingNumber());
    }

    private String getTrackingNumber() {
        return UUID.randomUUID().toString();
    }
    
}
