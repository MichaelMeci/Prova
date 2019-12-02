package classes;

import java.sql.Connection;			// classe per stabilire la connessione
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;


import java.sql.Statement;
import java.sql.ResultSet;

public class ConnessioneDB {

	private Connection conn;
	private String jdbcUrl;
	private String userid;				// attributi per connessione
	private String password;
	
	Statement stmt;
	ResultSet rset;						// attributi per interrogazione
	String query;
	
	
	
	public ConnessioneDB() {
		this.userid = "mattia_ricotta";
		this.jdbcUrl = "jdbc:oracle:thin:@192.168.69.3:1521:orcl";
		this.password = "mattia4321";
	}
	
	
	public void getDBConnection() throws SQLException{
		
		OracleDataSource ds = new OracleDataSource();
		ds.setURL(this.jdbcUrl);
		this.conn = ds.getConnection(this.userid,this.password);
		System.out.println("Connessione riuscita!!");
		stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
	}
	
	public void getAllActors() throws SQLException {
		
		this.query = "SELECT nome, cognome, nazionalità FROM Attori";
		System.out.println("\nSto eseguendo la seguente query: " + this.query);
		
		rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			System.out.println(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3) + " " + rset.getRow());
		}
		
	}
//	
//	
//	public void updateDurataFilm(long idFilm, Integer durata) throws SQLException {
//		System.out.println("\n\n Prima di aver effettuato la modifica, il record si presenta così:");
//		rset = stmt.executeQuery("select * from film where ID_FILM = " + idFilm);
//		while(rset.next()) {
//		System.out.println(rset.getString(1) + " --- " + rset.getString(2) + " --- " + rset.getString(3) + " --- " + rset.getString(4) + " --- " + rset.getString(5) + " --- " + rset.getString(6) + " --- " + rset.getString(7));
//		}
//		
//		if (durata!=null && durata > 0 && idFilm > 0)
//		this.query = "UPDATE film SET durata = " + durata + " WHERE ID_FILM = " + idFilm;
//		stmt.execute(this.query);
//		System.out.println("la modifica dovrebbe essere andata a buon fine!!");	
//		
//		System.out.println("\n\n Dopo aver effettuato la modifica, il record si presenta così:");
//		rset = stmt.executeQuery("select * from film where ID_FILM = " + idFilm);
//		while(rset.next()) {
//		System.out.println(rset.getString(1) + " --- " + rset.getString(2) + " --- " + rset.getString(3) + " --- " + rset.getString(4) + " --- " + rset.getString(5) + " --- " + rset.getString(6) + " --- " + rset.getString(7));
//		}
//	}
	
	
	
}
