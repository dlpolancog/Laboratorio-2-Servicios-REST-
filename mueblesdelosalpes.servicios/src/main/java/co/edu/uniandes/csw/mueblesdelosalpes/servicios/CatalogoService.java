/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Mueble;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioCarritoMockRemote;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioCatalogoMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/Catalogo")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CatalogoService {
 
    /**
     * Referencia al Ejb del catalogo encargada de realizar las operaciones del mismo.
     */
    @EJB
    private IServicioCatalogoMockLocal catalogoEjb;
    
    @EJB
    private IServicioCarritoMockRemote servicioRemoteEjb;
   
 
    /**
     * Servicio que ofrece una lista JSON con el catálogo de Muebles de los alpes (Los muebles disponibles para la venta).
     * @return la lista JSON con los muebles de MDLA.
  
     */
    @GET
    @Path("muebles/")
    public List<Mueble> getTodosLosMuebles() {
        return servicioRemoteEjb.getInventario();
 
    }
    
    @GET
    @Path("total-inventario/")
    public double getPrecioTotalInventario() {
        return servicioRemoteEjb.getPrecioTotalInventario();
 
    }
    
    @POST
    @Path("agregar-mueble/")
    public Mueble agregarCatalogo(Mueble mb) {
        servicioRemoteEjb.agregarItem(mb);
        return mb;
    }
    
    @GET
    @Path("buscar-mueble/{id}")
    public Mueble buscarMueble(@PathParam("id") long mb) {
        return catalogoEjb.buscarMueble(mb);
    }
    
 
}
