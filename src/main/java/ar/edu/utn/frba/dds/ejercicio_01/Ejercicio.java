package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ejercicio")

public class Ejercicio {
    @GeneratedValue @Id
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(255)")
    private String nombre;

    @Column(name = "detalle", columnDefinition = "VARCHAR(255)")
    private String detalle;
}
