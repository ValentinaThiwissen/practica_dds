package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Decorado {

  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
