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

/**
 *
 * @author dlpol
 */
@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal, IServicioOfertaMockRemote{
    private ArrayList<Oferta> ofertas = new ArrayList<Oferta>();

    @Override
    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    @Override
    public void agregarOfertas(Oferta oferta) {
        ofertas.add(oferta);
    }
    
}
