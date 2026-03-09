package servicios;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class EnviarEmails implements InterfazEnviarEmails {
    private Logger logger;

    public EnviarEmails(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean enviarEmail(Destinatario dest, String email) {
        logger.info("Enviando a " + dest + " el correo: " + email);
        return true;
    }
}
