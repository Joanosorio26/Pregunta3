package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.model.Visitas;
import pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3.service.IVisitasService;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/visitas")
public class VisitasController {

    private final IVisitasService visitasService;

    // Obtener visitas por fecha
    @GetMapping("/fecha/{fecha}")
    public ResponseEntity<List<Visitas>> obtenerVisitasPorFecha(@PathVariable int fecha) {
        List<Visitas> visitas = visitasService.obtenerVisitasPorFecha(fecha);
        return new ResponseEntity<>(visitas, HttpStatus.OK);
    }

    // Obtener total de visitantes por fecha
    @GetMapping("/total/{fecha}")
    public ResponseEntity<Integer> obtenerTotalVisitantesPorFecha(@PathVariable int fecha) {
        Integer total = visitasService.obtenerTotalVisitantesPorFecha(fecha);
        return new ResponseEntity<>(total, HttpStatus.OK);
    }

    // Obtener visita por ticket
    @GetMapping("/ticket/{ticket}")
    public ResponseEntity<Visitas> obtenerVisitaPorTicket(@PathVariable int ticket) {
        Visitas visita = visitasService.obtenerVisitaPorTicket(ticket);
        return new ResponseEntity<>(visita, HttpStatus.OK);
    }

    // Registrar nueva visita
    @PostMapping
    public ResponseEntity<Visitas> registrarVisita(@RequestBody Visitas visita) {
        Visitas nuevaVisita = visitasService.registrarVisita(visita);
        return new ResponseEntity<>(nuevaVisita, HttpStatus.CREATED);
    }
}
