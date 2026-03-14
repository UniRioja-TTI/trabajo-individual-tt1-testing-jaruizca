package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class ContactoSim implements InterfazContactoSim {
    private final Random random;

    public ContactoSim() {
        random = new Random();
    }

    /**
     * Crea un nuevo objeto ContactoSim con una seed específica.
     * @param randomSeed  seed que genera la creación de tokens aleatorios.
     */
    public ContactoSim(int randomSeed) {
        random = new Random(randomSeed);
    }

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        if (sol.getNums().values().stream().anyMatch(n->n<0)) return -1;
        if (sol.getNums().keySet().stream().anyMatch(n->n<0)) return -1;
        return Math.abs(random.nextInt());
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return new DatosSimulation();
    }

    @Override
    public List<Entidad> getEntities() {
        return Stream.of("a","b","c","d","f").map(n -> {
            Entidad e = new Entidad();
            e.setName(n);
            e.setId(n.charAt(0));
            return e;
        }).toList();
    }

    @Override
    public boolean isValidEntityId() {
        return true;
    }
}
