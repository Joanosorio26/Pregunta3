package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model.Visitas;
import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.repository.VisitasRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.service.IVisitasService;


import java.util.List;
@RequiredArgsConstructor
@Service
public class VisitasService  implements IVisitasService {

    private final VisitasRepository visitasRepository;

    @Cacheable(value = "visitasPorFecha", key = "#fecha")
    @Override
    public List<Visitas> obtenerVisitasPorFecha(int fecha) {
        return visitasRepository.obtenerVisitasPorFecha(fecha);
    }

    @Cacheable(value = "totalVisitantesPorFecha", key = "#fecha")
    @Override
    public Integer obtenerTotalVisitantesPorFecha(int fecha) {
        return visitasRepository.obtenerTotalVisitantesPorFecha(fecha);
    }

    @Cacheable(value = "visitaPorTicket", key = "#ticket")
    @Override
    public Visitas obtenerVisitaPorTicket(int ticket) {
        return visitasRepository.obtenerVisitaPorTicket(ticket);
    }

    @CacheEvict(value = {"visitasPorFecha", "totalVisitantesPorFecha", "visitaPorTicket"}, allEntries = true)
    public Visitas registrarVisita(Visitas visita) {
        return visitasRepository.save(visita);
    }
}
