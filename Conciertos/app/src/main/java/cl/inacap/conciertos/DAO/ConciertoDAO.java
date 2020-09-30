package cl.inacap.conciertos.DAO;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.conciertos.DTO.Concieto;

public class ConciertoDAO {
    private static List<Concieto> Conciertos= new ArrayList<>();

    public void Agregarconcierto(Concieto Con){
        Conciertos.add(Con);
    }

    public List<Concieto> mostrarConcierto(){
        return Conciertos;
    }
}
