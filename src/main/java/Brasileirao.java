public class Brasileirao {

    private Brasileirao() {};
    private static Brasileirao instance = new Brasileirao();
    public static Brasileirao getInstance() {
        return instance;
    }

    private String TimesCadastrados;
    private Integer Classificacao;
    private Integer Pontuacao;

    public Integer getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        Classificacao = classificacao;
    }

    public Integer getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        Pontuacao = pontuacao;
    }

    public String getTimesCadastrados() {
        return TimesCadastrados;
    }

    public void setTimesCadastrados(String timesCadastrados) {
        TimesCadastrados = timesCadastrados;
    }
}
