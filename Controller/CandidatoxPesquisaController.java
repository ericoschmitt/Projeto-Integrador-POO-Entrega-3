package Controller;
import java.util.List;

import dao.CandidatoxPesquisaDao;
import model.CandidatoxPesquisa;
public class CandidatoxPesquisaController {
    
    public void salvar() throws Exception {
        
        }
		
	
	
	public void atualizar(CandidatoxPesquisa CandidatoxPesquisa) throws Exception {
		
		}
		

	
	public void excluir(int idCandidatoxPesquisa) throws Exception {
		
		}
		
	
	public List<CandidatoxPesquisa> listar(){
		return CandidatoxPesquisaDao.getinstance().listar();
	}

    public void salvar(CandidatoxPesquisa CXP1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
