/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifianjoe.latihanmvcjdbc.service;

import edu.rifianjoe.latihanmvcjdbc.entity.Pelanggan;
import edu.rifianjoe.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 * NIM : 10118013
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * @author Rifian
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;

    public void deletePelanggan(int id);
    
}
