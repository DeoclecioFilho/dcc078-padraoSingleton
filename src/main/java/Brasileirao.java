public class Brasileirao {

    private Brasileirao() {};
    private static Brasileirao instance = new Brasileirao();
    public static Brasileirao getInstance() {
        return instance;
    }

    private String Time;
    private Integer Classificacao;
    private Integer Pontuacao;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

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

    public static void setInstance(Brasileirao instance) {
        Brasileirao.instance = instance;
    }
}
