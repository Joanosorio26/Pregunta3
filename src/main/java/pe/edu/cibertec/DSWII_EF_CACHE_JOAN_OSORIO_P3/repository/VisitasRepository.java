package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model.Visitas;


import java.util.List;

@Repository
public interface VisitasRepository extends JpaRepository<Visitas, Integer> {

    // Consulta para obtener visitas por fecha
    @Query(value = "SELECT * FROM visitas WHERE fecha_visita = :fecha", nativeQuery = true)
    List<Visitas> obtenerVisitasPorFecha(@Param("fecha") int fecha);

    // Consulta para obtener total de visitantes en una fecha específica
    @Query(value = "SELECT SUM(numero_personas) FROM visitas WHERE fecha_visita = :fecha", nativeQuery = true)
    Integer obtenerTotalVisitantesPorFecha(@Param("fecha") int fecha);

    // Consulta para obtener información de la visita por ticket
    @Query(value = "SELECT * FROM visitas WHERE ticket = :ticket", nativeQuery = true)
    Visitas obtenerVisitaPorTicket(@Param("ticket") int ticket);
}