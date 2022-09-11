package model;
public class CandidatoxPesquisa {
//Atributos
    private Candidato candidato;
    private Pesquisa pesquisa;
    private int votosCandidato;
    private float percentualVotosCandidato;
//Construtores
public CandidatoxPesquisa() {
      
    }
//SETs e GETs

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }

    public int getVotosCandidato() {
        return votosCandidato;
    }

    public void setVotosCandidato(int votosCandidato) {
        this.votosCandidato = votosCandidato;
    }

    public float getPercentualVotosCandidato() {
        return percentualVotosCandidato;
    }

    public void setPercentualVotosCandidato(float percentualVotosCandidato) {
        this.percentualVotosCandidato = percentualVotosCandidato;
    }

    
   
    
    
    
    
}
