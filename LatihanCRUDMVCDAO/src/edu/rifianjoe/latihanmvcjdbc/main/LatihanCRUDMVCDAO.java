/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifianjoe.latihanmvcjdbc.main;

import edu.rifianjoe.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.rifianjoe.latihanmvcjdbc.entity.Pelanggan;
import edu.rifianjoe.latihanmvcjdbc.error.PelangganException;
import edu.rifianjoe.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;

/**
 * NIM : 10118013
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * @author Rifian
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        dao.deletePelanggan(1);
        
        
    }
    
}
