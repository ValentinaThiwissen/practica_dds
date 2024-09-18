package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "deportista")

public class Deportista {
    @GeneratedValue @Id
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(255)")
    private String nombre;

    @Column(name = "nombre", columnDefinition = "VARCHAR(255)")
    private String apellido;

    @ElementCollection
    @CollectionTable(name = "deportista_contactos", joinColumns = @JoinColumn(name = "deportista_id"))
    @Column(name = "contacto")
    private List<String> contactos;

    @Convert(converter = Motivacion.class)
    @Column(name = "motivacionPrincipal")
    private Motivacion motivacionPrincipal;

    @Column(name = "pesoInicialEnKilos")
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
