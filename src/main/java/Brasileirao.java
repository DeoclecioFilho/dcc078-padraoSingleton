public class Brasileirao {

    private Brasileirao() {};
    private static Brasileirao instance = new Brasileirao();
    public static Brasileirao getInstance() {
        return instance;
    }

    private String TimesCadastrados;


    public String getTimesCadastrados() {
        return TimesCadastrados;
    }

    public void setTimesCadastrados(String timesCadastrados) {
        TimesCadastrados = timesCadastrados;
    }
}
