package estudos.screenmatch.exessao;

public class ErroConversaoExection extends RuntimeException {
    private String msg;

    public ErroConversaoExection(String msg) {
        this.msg = msg;



    }

    public String getMessage() {
        return this.msg;
    }
}
