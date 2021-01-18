package pl.rmitula.springbootbasicauthentication.model;



public class ConsultaDocumentosResponse {

  private String motivorechazo;
  private String resultadooperacion;

  public String getMotivorechazo() {
    return motivorechazo;
  }

  public void setMotivorechazo(String motivorechazo) {
    this.motivorechazo = motivorechazo;
  }

  public String getResultadooperacion() {
    return resultadooperacion;
  }

  public void setResultadooperacion(String resultadooperacion) {
    this.resultadooperacion = resultadooperacion;
  }
}
