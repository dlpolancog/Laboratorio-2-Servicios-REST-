/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.ArrayList;
import javax.ejb.Remote;

/**
 *
 * @author dlpol
 */
@Remote
public interface IServicioOfertaMockRemote {

    /**
     * Devuelve historial de ofertas registradas.
     *
     * @return listado de ofertas registradas.
     */
    public ArrayList<Oferta> getOfertas();

    /**
     * Agrega una nueva oferta de un mueble
     *
     * @param oferta Referencia a una nuevva oferta
     */
    public void agregarOfertas(Oferta oferta);

}
