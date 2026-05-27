package pagos;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/procesar-pago")
public class ServicioMedioPagoAPI {
	
	//curl -v http://localhost:8080/ServicioMedioPagoMock/api/procesar-pago
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON})
	public boolean procesarPago(String numeroTarjeta) {
            return "1111222233334444".equals(numeroTarjeta);
	}	
}
