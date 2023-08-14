package flor.peluqueriacanina.persistencia;

import flor.peluqueriacanina.logica.Duenio;
import flor.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController(); 

    public void guardar(Duenio duenio, Mascota masco) {
        //crear en la bd duenio
        duenioJpa.create(duenio);
        //crear en la bd masco
        mascoJpa.create(masco);
    }
}
