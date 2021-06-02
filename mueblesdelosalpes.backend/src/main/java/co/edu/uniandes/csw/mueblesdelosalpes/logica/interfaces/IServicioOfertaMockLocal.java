/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author dlpol
 */
@Local
public interface IServicioOfertaMockLocal {

    /**
     * Agrega una oferta al sistema
     * @param oferta Nueva oferta
     */
    public void agregarOferta(Oferta oferta);

    /**
     * Elimina una oferta del sistema
     * @param id Identificador único de la oferta a eliminar
     */
    public void eliminarOferta(long id);

    /**
     * Devuelve todas las ofertas del sistema
     * @return ofertas Lista de ofertas
     */
    public List<Oferta> darOfertas();
    
    /**
     * Busca la oferta por id
     * @param id Identificador único de la oferta
     */
    
    public Oferta buscarOferta(long id);


}
