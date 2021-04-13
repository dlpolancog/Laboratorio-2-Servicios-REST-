/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author dlpol
 */
public class Oferta {
    
    private long idOferta;
    private String loginUsuarioOfertante;
    private long referenciaMueble;
    private double oferta;

    public Oferta() {
    }

    public Oferta(long idOferta, String loginUsuarioOfertante, long referenciaMueble, double oferta) {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }

    public long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(long id) {
        this.idOferta = id;
    }

    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    public void setLoginUsuarioOfertante(String loginUser) {
        this.loginUsuarioOfertante = loginUser;
    }

    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(long idMueble) {
        this.referenciaMueble = idMueble;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double offer) {
        this.oferta = offer;
    }
}
