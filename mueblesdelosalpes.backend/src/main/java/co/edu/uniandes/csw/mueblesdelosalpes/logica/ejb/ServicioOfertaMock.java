/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.*;
import java.util.ArrayList;
import javax.ejb.Stateless;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.persistencia.mock.ServicioPersistenciaMock;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dlpol
 */
@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal, IServicioOfertaMockRemote{
    
    
    private ArrayList<Oferta> ofertas = new ArrayList<Oferta>();
    private IServicioPersistenciaMockLocal persistencia;
    
    public ServicioOfertaMock()
    {
        persistencia=new ServicioPersistenciaMock();
        //Inicializa el arreglo de los muebles
  
    }
    
    public void agregarOferta(Oferta oferta)
    {
        try
        {
            persistencia.create(oferta);
        }
        catch (OperacionInvalidaException ex)
        {
            Logger.getLogger(ServicioCatalogoMock.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    @Override
    public void eliminarOferta(long id)
    {
        Oferta o=(Oferta) persistencia.findById(Oferta.class, id);
        try
        {
            persistencia.delete(o);
        }
        catch (OperacionInvalidaException ex)
        {
            Logger.getLogger(ServicioCatalogoMock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Oferta buscarOferta(long id)
    {
        Oferta o=(Oferta) persistencia.findById(Oferta.class, id);
        return o;
    }
    
    public List<Oferta> darOfertas()
    {
        return persistencia.findAll(Oferta.class);
    }
    
}
