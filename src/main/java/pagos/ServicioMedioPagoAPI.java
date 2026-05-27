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
	
        //curl -X POST -v http://localhost:8180/ServicioMedioPagoMock/api/procesar-pago -H "Content-Type: application/json" -d '{"numeroTarjeta":"1111222233334444"}'
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON})
	public boolean procesarPago(PagoRequest request) {
            return "1111222233334444".equals(request.numeroTarjeta);
	}	
}
