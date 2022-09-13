package Principal;
import java.sql.Connection;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import Controller.CandidatoController;
import Controller.PesquisaController;
import Controller.CandidatoxPesquisaController;

import model.Candidato;
import model.Pesquisa;
import model.CandidatoxPesquisa;


public class Principal {
    public static void main(String[] args) {
        
         
        testeCandidatoxPesquisa();
        testePesquisa();  
	testeCandidato();
    }
                public static void testeCandidato(){
                Candidato c1 = new Candidato();
		c1.setIdCandidato(1);
                c1.setNomeCandidato("JOAO PAULO");
		c1.setPartidoCandidato("Novo");
		c1.setFichaLimpa(true);
		
		Candidato c2 = new Candidato();
		c2.setIdCandidato(2);
		c2.setNomeCandidato("PEDRO PAULO");
		c2.setPartidoCandidato("Podemos");
		c2.setFichaLimpa(true);
                
                Candidato c3 = new Candidato();
		c3.setIdCandidato(3);
		c3.setNomeCandidato("JOAO PAULO");
		c3.setPartidoCandidato("PSOL");
		c3.setFichaLimpa(false);
		
                CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
                        controller.salvar(c3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Candidato c : controller.listar()) {
			System.out.println(c.toString());
		}
                

}
                
                public static void testePesquisa(){
                    	Pesquisa p1 = new Pesquisa();
			p1.setIdPesquisa(1);
                    	p1.setFormatoPesquisa("Entrevistas face a face ");
                  	p1.setInstitutoPesquisa("Data Folha");
                    	p1.setLocalPesquisa("Parque Ibirapuera ");
                    
			Pesquisa p2 = new Pesquisa();
			p2.setIdPesquisa(2);
                    	p2.setFormatoPesquisa("Ligações Telefônicas ");
                    	p2.setInstitutoPesquisa("Vozes da cabeça");
                    	p2.setLocalPesquisa("Avenida Paulista ");
                    
                    	Pesquisa p3 = new Pesquisa();
			p3.setIdPesquisa(3);
                    	p3.setFormatoPesquisa("On-line ");
                    	p3.setInstitutoPesquisa("Modal ");
                    	p3.setLocalPesquisa("E-mail");
                    
                    PesquisaController controller = new PesquisaController();
		try {
			controller.salvar(p1);
			controller.salvar(p2);
                        controller.salvar(p3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Pesquisa c : controller.listar()) {
			System.out.println(c.toString());
		}
                }
                
                public static void testeCandidatoxPesquisa(){
                
                    CandidatoxPesquisa CXP1 = new CandidatoxPesquisa();
                    CXP1.setVotosCandidato(50);
                    CXP1.setPercentualVotosCandidato(25f);
                 
                    
                    CandidatoxPesquisa CXP2 = new CandidatoxPesquisa();
                    CXP2.setVotosCandidato(30);
                    CXP2.setPercentualVotosCandidato(31f);
                    
                    CandidatoxPesquisa CXP3 = new CandidatoxPesquisa();
                    CXP3.setVotosCandidato(20);
                    CXP3.setPercentualVotosCandidato(18f);
                    
                    CandidatoxPesquisaController controller = new CandidatoxPesquisaController();
		try {
			controller.salvar(CXP1);
			controller.salvar(CXP2);
                        controller.salvar(CXP3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (CandidatoxPesquisa c : controller.listar()) {
			System.out.println(c.toString());
		}
                }
          }
    

