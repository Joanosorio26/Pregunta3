package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "habitats")
public class Habitat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idhabitat;

    private String nombre;
    private String tipo;
    private int capacidad;


}