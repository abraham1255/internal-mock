package pl.rmitula.springbootbasicauthentication.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rmitula.springbootbasicauthentication.model.ConsultaDocumentosRequest;
import pl.rmitula.springbootbasicauthentication.model.ConsultaDocumentosResponse;

@RestController
public class HelloController {

    @Value("${sleep.notificar-estado-cuenta}")
    private int sleepNotificarEstadoCuenta;

    @Value("${sleep.notificar-envio-movimientos}")
    private int sleepEnvioMovimientos;


    @PostMapping("/public")
    public String HelloPublic() {

        return "Hello Public!";
    }

    @PostMapping(
            path = "/private",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ConsultaDocumentosResponse HelloPrivate(ConsultaDocumentosRequest consultaDocumentosRequest) throws InterruptedException {
        Thread.sleep(sleepNotificarEstadoCuenta);

        System.out.println("IMPRIMIENDO CURP");
        System.out.println(consultaDocumentosRequest.getCurp());
        System.out.println("IMPRIMIENDO CORREO");
        System.out.println(consultaDocumentosRequest.getCorreo());
        System.out.println("IMPRIMIENDO TIPONOTIFICACION");
        System.out.println(consultaDocumentosRequest.getTiponotificacion());
            ConsultaDocumentosResponse consultaDocumentosResponse = new ConsultaDocumentosResponse();

            consultaDocumentosResponse.setResultadooperacion("01");
            consultaDocumentosResponse.setMotivorechazo(null);
        return consultaDocumentosResponse;
    }

    @PostMapping(
            path = "/privateMovimientos",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ConsultaDocumentosResponse HelloPrivateMovimientos(ConsultaDocumentosRequest consultaDocumentosRequest) throws InterruptedException {
        Thread.sleep(sleepEnvioMovimientos);

        System.out.println("IMPRIMIENDO CURP");
        System.out.println(consultaDocumentosRequest.getCurp());
        System.out.println("IMPRIMIENDO CORREO");
        System.out.println(consultaDocumentosRequest.getCorreo());
        ConsultaDocumentosResponse consultaDocumentosResponse = new ConsultaDocumentosResponse();

        consultaDocumentosResponse.setResultadooperacion("01");
        consultaDocumentosResponse.setMotivorechazo(null);

        return consultaDocumentosResponse;
    }

    @GetMapping("/admin")
    public String HelloAdmin() {

        return "Hello Admin!";
    }
}
