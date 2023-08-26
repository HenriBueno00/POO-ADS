package org.me.Curso;
public class Curso {
    private String nomecurso, periodo;
    private int duracao;
    
    public Curso (String nomecurso, String periodo, int duracao){
        this.nomecurso = nomecurso;
        this.periodo = periodo;
        this.duracao = duracao;
          
    }
    /**
     * @return the nomecurso
     */
    public String getNomecurso() {
        return nomecurso;
    }
    /**
     * @param nomecurso the nomecurso to set
     */
    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }
    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }
    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
