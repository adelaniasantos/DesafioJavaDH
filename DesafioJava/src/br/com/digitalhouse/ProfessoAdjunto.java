package br.com.digitalhouse;

public class ProfessoAdjunto extends Professor{
    private int qtdeHorasMonitoria;

    public ProfessoAdjunto(String nome, String sobrenome,  int codProfessor, int tempoDeCasa, int qtdeHorasMonitoria) {
        super(nome, sobrenome, codProfessor, tempoDeCasa);
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }

    public int getQtdeHorasMonitoria() {
        return qtdeHorasMonitoria;
    }

    public void setQtdeHorasMonitoria(int qtdeHorasMonitoria) {
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }
}
