package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.service;

import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model.Visitas;

import java.util.Date;
import java.util.List;

public interface IVisitasService {

    List<Visitas> obtenerVisitasPorFecha(int fecha);

    Integer obtenerTotalVisitantesPorFecha(int fecha);

    Visitas obtenerVisitaPorTicket(int ticket);

    Visitas registrarVisita(Visitas visita);
}