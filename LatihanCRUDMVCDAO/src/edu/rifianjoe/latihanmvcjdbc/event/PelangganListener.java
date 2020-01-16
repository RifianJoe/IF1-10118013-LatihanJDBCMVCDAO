/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifianjoe.latihanmvcjdbc.event;

import edu.rifianjoe.latihanmvcjdbc.entity.Pelanggan;
import edu.rifianjoe.latihanmvcjdbc.model.PelangganModel;

/**
 * NIM : 10118013
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * @author Rifian
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
}
