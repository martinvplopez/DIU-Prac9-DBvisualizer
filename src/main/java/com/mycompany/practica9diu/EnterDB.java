package com.mycompany.practica9diu;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
/**
 *
 * @author marti
 */


public class EnterDB {
    
    private final String serverName,databaseName,user,pass;
    String[] types = {"TABLE"}; 
    private Connection con;
    private DatabaseMetaData md;

    public EnterDB(String serverName, String databaseName, String user, String pass){
        this.serverName=serverName;
        this.databaseName=databaseName;
        this.user=user;
        this.pass=pass;
    }
    
    public void connectDB() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://"+serverName+"/"+databaseName+"?useSSL=true",user,pass);
        md = con.getMetaData();
    }
    public ArrayList<String> getTables() throws SQLException{
        ArrayList<String> tables = new ArrayList<>(); 
        ResultSet rs = md.getTables(null, null, "%", types);
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));    
        }       
        return tables;
    }
    
    public ArrayList<String> getFields(String[]tablasSeleccionadas) throws SQLException{
        ArrayList<String> campos = new ArrayList<>();
        
        for (String tabla : tablasSeleccionadas) {
            ResultSet rs2 = md.getColumns(null, null, tabla, null);
            while (rs2.next()) {
                StringBuilder campo = new StringBuilder(tabla);
                campo.append(".").append(rs2.getString("COLUMN_NAME"));
                campos.add(campo.toString());
            }
        }
        return campos;
    }
    
}
