package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Candidato;



public class CandidatoDao {
    
    private static CandidatoDao instance;
    private List<Candidato> listaCandidatos = new ArrayList<>();
    private Connection con = ConnectionUtil.getConnection();
    
    /*
        Singleton Design Pattern
    */
    public static CandidatoDao getinstance() {
        if (instance == null) {
            instance = new CandidatoDao();
            
        } 
        return instance;
    }
    public void salvar(Candidato candidato) throws Exception {
        try {
			String sql = "insert into Candidato (idCandidato, nomeCandidato, partidoCandidato, fichaLimpa) values (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setint(1, Candidato.getIdCandidato());
			pstmt.setString(2, Candidato.getNomeCandidato());
			pstmt.setString(3, Candidato.getPartidoCandidato());
			pstmt.setboolean(4, Candidato.getFichaLimpa());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		
	}
	
	public void atualizar(Candidato candidato) throws Exception {
            
            try {
			String sql = "update Candidato set idCandidato = ?, nomeCandidato = ?, partidoCandidato = ?, fichaLimpa = ? where idCandidato = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setint    (1, Candidato.getIdCandidato());
		    	pstmt.setString (2, Candidato.getNomeCandidato());
			pstmt.setString (3, Candidato.getPartidoCandidato());
			pstmt.setboolean(4, Candidato.getFichaLimpa());
                       
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
        }
		
		}
		
	
	
	public void excluir(int idCandidato) {
          try {
			String sql = "delete from Candidato where idCandidato = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idCandidato);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
            
		


		

	
	public List<Candidato> listar(){
            List<Candidato> listaCandidatos = new ArrayList<>();
		try {
			String sql = "select * from Candidato";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Candidato();
				c.setIdCandidato(rs.getInt("id"));
				c.setNomeCandidato(rs.getString("Nome"));
				c.setPartidoCandidato(rs.getString("Partido"));
				c.setFichaLimpa(rs.getboolean(true));
				listaCandidatos.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaClientes;
	}

		
}
    
}
