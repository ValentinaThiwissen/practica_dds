package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ladron extends Personaje{
  private Integer nivelSiniestro;
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
