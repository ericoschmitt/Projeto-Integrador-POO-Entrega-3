package model;

import java.time.LocalDate;
//Atributos
public class Pesquisa {
    private String institutoPesquisa,localPesquisa,tipoPesquisa,formatoPesquisa;
    private LocalDate dataPesquisa;
    private int idPesquisa;
//Construtores
 public Pesquisa() {
       
 } 
//SETs e GETs

    public String getInstitutoPesquisa() {
        return institutoPesquisa;
    }

    public void setInstitutoPesquisa(String institutoPesquisa) {
        this.institutoPesquisa = institutoPesquisa;
    }

    public String getLocalPesquisa() {
        return localPesquisa;
    }

    public void setLocalPesquisa(String localPesquisa) {
        this.localPesquisa = localPesquisa;
    }

    public String getTipoPesquisa() {
        return tipoPesquisa;
    }

    public void setTipoPesquisa(String tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }

    public String getFormatoPesquisa() {
        return formatoPesquisa;
    }

    public void setFormatoPesquisa(String formatoPesquisa) {
        this.formatoPesquisa = formatoPesquisa;
    }

    public LocalDate getDataPesquisa() {
        return dataPesquisa;
    }

    public void setDataPesquisa(LocalDate dataPesquisa) {
        this.dataPesquisa = dataPesquisa;
    }

    public int getIdPesquisa() {
        return idPesquisa;
    }

    public void setIdPesquisa(int idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    
  
    
   
    
    
    
    
}
