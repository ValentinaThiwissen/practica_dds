package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rutina")

public class Rutina {
    @GeneratedValue @Id
    private long id;

    @OneToOne
    @JoinColumn(name = "deportista_id", referencedColumnName = "id")
    private Deportista deportista;

    @ManyToMany
    @JoinTable (name = "rutina_diaDeEntrenamiento", joinColumns = @JoinColumn(name = "rutina_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "diaDeEntrenamiento_id", referencedColumnName = "id")
    )
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;

    @OneToOne
    @JoinColumn(name="rutina_id", referencedColumnName = "id")
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
