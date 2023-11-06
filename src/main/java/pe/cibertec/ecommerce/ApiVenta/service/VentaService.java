package pe.cibertec.ecommerce.ApiVenta.service;
import pe.cibertec.ecommerce.ApiVenta.dto.Purchase;
import pe.cibertec.ecommerce.ApiVenta.dto.PurchaseResponse;

public interface VentaService {
    public PurchaseResponse placeVenta(Purchase purchase);    
}
