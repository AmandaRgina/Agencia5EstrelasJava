package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Destino;

public class DestinoDao implements CRUD {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Destino destino) {
		 sql = "INSERT INTO destinos VALUES (null, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, destino.getLugar());
			 preparedStatement.setFloat(2, destino.getValor());
		
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
	
	public static void delete(int destinoId) {
		sql = "DELETE FROM destinos WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, destinoId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on cliente");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on cliente. " + e.getMessage());
		}
	}
	
	public static List<Destino> find(String pesquisa){
		
		sql = String.format("SELECT * FROM destinos WHERE lugar like '%s%%' ", pesquisa);
		List<Destino> destinos = new ArrayList<Destino>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Destino destino = new Destino();
				
				destino.setId(resultSet.getInt("id"));
				destino.setLugar(resultSet.getString("lugar"));
				destino.setValor(resultSet.getString("valor"));
			
				
				destinos.add(destino);
				
			}
			
			System.out.println("--correct find clientes");
			return destinos;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find clientes. " + e.getMessage());
			return null;
		}
		
		
	}
	
	public static Destino findByPk(int destinoId) {
		sql = String.format("SELECT * FROM destinos WHERE id = %d ", destinoId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Destino destino = new Destino();
			
			while (resultSet.next()) {
				destino.setId(resultSet.getInt("id"));
				destino.setLugar(resultSet.getString("lugar"));
				destino.setValor(resultSet.getString("valor"));
			}
			
			System.out.println("--correct find by pk clientes");
			return destino;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk clientes. " + e.getMessage());
			return null;
		}
	}
	
	public static void update(Destino destino) {
		sql = "UPDATE destinos SET lugar=?, valor=?  WHERE id=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, destino.getLugar());
			 preparedStatement.setFloat(2, destino.getValor());
			 preparedStatement.setInt(3, destino.getId());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
}
