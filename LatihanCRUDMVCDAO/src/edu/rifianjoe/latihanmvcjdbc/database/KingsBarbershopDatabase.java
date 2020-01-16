/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifianjoe.latihanmvcjdbc.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.rifianjoe.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.rifianjoe.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 * NIM : 10118013
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * @author Rifian
 */
public class KingsBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao  pelangganDao; 
    
    public static Connection getConnection() throws SQLException{
        if (connection==null){
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
        }
        
        
        
        return connection;
        
        
        
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
    
}

