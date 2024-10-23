package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Setter
@Getter
@Table(name = "visitas")
public class Visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticket;

    private String nombre_visitante;
    private Date fecha_visita;
    private String recorrido;
    private Integer numero_personas;
}
