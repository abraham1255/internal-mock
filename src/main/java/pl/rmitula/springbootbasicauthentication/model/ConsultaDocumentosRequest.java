package pl.rmitula.springbootbasicauthentication.model;


public class ConsultaDocumentosRequest {

  private String curp;
  private String tiponotificacion;
  private String correo;

  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public String getTiponotificacion() {
    return tiponotificacion;
  }

  public void setTiponotificacion(String tiponotificacion) {
    this.tiponotificacion = tiponotificacion;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }
}
