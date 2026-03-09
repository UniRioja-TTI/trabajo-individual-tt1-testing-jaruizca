package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoSim implements InterfazContactoSim {

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public List<Entidad> getEntities() {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public boolean isValidEntityId() {
        throw new UnsupportedOperationException("Método no implementado");
    }
}
