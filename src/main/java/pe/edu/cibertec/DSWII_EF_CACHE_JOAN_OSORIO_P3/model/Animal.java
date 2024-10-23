package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idanimal;

    private String nombre;
    private String especie;
    private Integer edad;
    private String habitat;

}
