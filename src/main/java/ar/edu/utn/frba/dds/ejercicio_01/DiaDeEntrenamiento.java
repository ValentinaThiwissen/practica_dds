package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "diaDeEntrenamiento")

public class DiaDeEntrenamiento {
  @GeneratedValue @Id
  private long id;

  @ManyToMany
  @JoinTable (name = "diaDeEntrenamiento_ejercicio", joinColumns = @JoinColumn(name = "diaDeEntrenamiento_id",
          referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "ejercicio_id", referencedColumnName = "id")
  )
  private List<Ejercicio> ejercicios;

  @Column(name = "duracionRutina")
  private Integer numero; // representa el orden en la duracion de la rutina.

  @OneToOne
  @JoinColumn(name="DiaDeEntrenamiento_id", referencedColumnName = "id")
  private DiaDeEntrenamiento siguienteDia;

  public DiaDeEntrenamiento() {
    this.ejercicios = new ArrayList<>();
  }
  public void agregarEjercicio(Ejercicio ejercicio) {
    this.ejercicios.add(ejercicio);
  }
}
