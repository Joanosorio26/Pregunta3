package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alimentacion")
public class Alimentacion {

    @Id  // Definimos tipo_comida como clave primaria
    @Column(name = "tipo_comida") // Mapeo de la columna
    private String tipo_comida;

    private Double cantidad;
    private String frecuencia;

    @ManyToOne  // Cambiamos a ManyToOne para reflejar correctamente la relación
    @JoinColumn(name = "animal_id")  // La clave foránea en la tabla alimentacion
    private Animal animal;
}
