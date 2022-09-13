package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Pesquisa;


public class PesquisaDao {
    
    private static PesquisaDao instance;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();
    private Connection con = ConnectionUtil.getConnection();
    
    /*
        Singleton Design Pattern
    */
    public static PesquisaDao getinstance() {
        if (instance == null) {
            instance = new PesquisaDao();   
            
        } 
        return instance;
    }
    public void salvar(Pesquisa pesquisa) throws Exception {
        try {
			String sql = "insert into Pesquisa (idPesquisa, institutoPesquisa, tipoPesquisa, dataPesquisa, formatoPesquisa, localPesquisa) values (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setint    (1, Pesquisa.getIdPesquisa());
			pstmt.setString (2, Pesquisa.getInstitutoPesquisa());
			pstmt.setString (3, Pesquisa.getTipoPesquisa());
			pstmt.setboolean(4, Pesquisa.getDataPesquisa());
                        pstmt.setboolean(5, Pesquisa.getFormatoPesquisa());
                        pstmt.setboolean(6, Pesquisa.getLocalPesquisa());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		
	}
        
		
	}
	
	public void atualizar(Pesquisa pesquisa) throws Exception {
		try {
			String sql = "update Pesquisa set idPesquisa = ?, institutoPesquisa = ?, tipoPesquisa = ?, dataPesquisa = ? formatoPesquisa = ? localPesquisa = ? where idPesquisa = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setint    (1, Pesquisa.getIdPesquisa());
			pstmt.setString (2, Pesquisa.getInstitutoPesquisa());
			pstmt.setString (3, Pesquisa.getTipoPesquisa());
			pstmt.setboolean(4, Pesquisa.getDataPesquisa());
                        pstmt.setboolean(5, Pesquisa.getFormatoPesquisa());
                        pstmt.setboolean(6, Pesquisa.getLocalPesquisa());
                        pstmt.setIdPesquisa(7, Pesquisa.getIdPesquisa());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
        }
		
		}
		
		
	
	
	public void excluir(int idPesquisa) {
            try {
			String sql = "delete from Pesquisa where IdPesquisa = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, IdPesquisa);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		
	}
		

}
		

	
	public List<Pesquisa> listar(){
            try {
			String sql = "select * from Pesquisa";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Pesquisa();
				c.setIdPesquisa(rs.getInt("id"));
				c.setinstitutoPesquisa(rs.getString("instituto"));
				c.settipoPesquisa     (rs.getString("tipoPesquisa ));
				c.setdataPesquisa     (rs.getString("dataPesquisa"));
                                c.setformatoPesquisa (rs.getString("formatoPesquisa"));
                                c.setlocalPesquisa    (rs.getString("localPesquisa"));
				listaPesquisa.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaClientes;
	}
               }
}
