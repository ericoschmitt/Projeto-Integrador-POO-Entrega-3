package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.CandidatoxPesquisa;

public class CandidatoxPesquisaDao {
    private static CandidatoxPesquisaDao instance;
    private List<CandidatoxPesquisa> listaCandidatoxPesquisa = new ArrayList<>();
    private Connection con = ConnectionUtil.getConnection();
    
    /*
        Singleton Design Pattern
    */
    public static CandidatoxPesquisaDao getinstance() {
        if (instance == null) {
            instance = new CandidatoxPesquisaDao();
            
        } 
        return instance;
    }
    public void salvar(CandidatoxPesquisa CandidatoxPesquisa) throws Exception {
		try {
			String sql = "insert into CandidatoxPesquisa (votosCandidato, percentualVotosCandidato) values (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setint     (1, CandidatoxPesquisa.getVotosCandidato());
			pstmt.setfloat   (2, CandidatoxPesquisa.getPercentualVotosCandidato());
			
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		
	}
    }
	
	public void atualizar(CandidatoxPesquisa CandidatoxPesquisa) throws Exception {
            try {
			String sql = "insert into CandidatoxPesquisa votosCandidato = ? percentualVotosCandidato =? where votosCandidato = ? ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setint     (1, CandidatoxPesquisa.getVotosCandidato());
			pstmt.setfloat   (2, CandidatoxPesquisa.getPercentualVotosCandidato());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
        }
        }
		
		}
		
	
	
	public void excluir(int votosCandidato) {
try {
			String sql = "delete from CandidatoxPesquisa where idCandidato = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idCandidato);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
            
            
		

}
		

	
	public List<CandidatoxPesquisa> listar(){
try {
			String sql = "select * from CandidatoxPesquisa";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Candidato();
				c.setvotosCandidato(rs.getInt("votosCandidato"));
				c.setpercentualVotosCandidato(rs.getString("percentualVotosCandidato"))
				listaCandidatos.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
            return listaCandidatoxPesquisa;

        

		
}
    
}
