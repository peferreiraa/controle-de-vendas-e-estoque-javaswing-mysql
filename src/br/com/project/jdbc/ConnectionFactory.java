/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author whoami
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas", "user", "root");
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }
}
