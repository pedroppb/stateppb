package stateppb;

public class OrdemServicoEstadoFinalizado extends OrdemServicoEstado{
    private OrdemServicoEstadoFinalizado() {};
    private static OrdemServicoEstadoFinalizado instance = new OrdemServicoEstadoFinalizado();
    public static OrdemServicoEstadoFinalizado getInstance() {
        return instance;
    }
    @Override
    public String getEstado() {
        return "Finalizado";
    }
}