package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;



import co.edu.uniandes.csw.mueblesdelosalpes.dto.Mueble;
import java.util.List;
import javax.ejb.Remote;


/**
 * Contrato funcional de los servicios que se le prestan al catálogo
 * @author Juan Sebastián Urrego
 */
@Remote
public interface IServicioOfertaMockLocal
{

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    public void agregarMueble(Mueble mueble);

    /**
     * Elimina un mueble del sistema
     * @param id Identificador único del mueble a eliminar
     */
    public void eliminarMueble(long id);

    /**
     * Devuelve todos los muebles del sistema
     * @return muebles Lista de muebles
     */
    public List<Mueble> darMuebles();

    /**
     * Remueve un ejemplar del mueble (no el mueble)
     * @param id Identificador único del mueble
     */
    public void removerEjemplarMueble(long id);
    
}
