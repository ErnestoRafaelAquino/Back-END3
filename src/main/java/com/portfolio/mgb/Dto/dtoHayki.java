/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Ernesto Aquino
 */

public class dtoHayki {
    @NotBlank
    private String nombreH;
    @NotBlank
    private String porcentajeH;
    @NotBlank
    private String imgH;
    
    //constructor

    public dtoHayki() {
    }

    public dtoHayki(String nombreH, String porcentajeH, String imgH) {
        this.nombreH = nombreH;
        this.porcentajeH = porcentajeH;
        this.imgH = imgH;
    }
    
    //GettER and Setter

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getPorcentajeH() {
        return porcentajeH;
    }

    public void setPorcentajeH(String porcentajeH) {
        this.porcentajeH = porcentajeH;
    }

    public String getImgH() {
        return imgH;
    }

    public void setImgH(String imgH) {
        this.imgH = imgH;
    }

    
}
