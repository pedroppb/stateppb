package stateppb;

public class OrdemServicoEstadoAberto extends OrdemServicoEstado{
    private OrdemServicoEstadoAberto() {};
    private static OrdemServicoEstadoAberto instance = new OrdemServicoEstadoAberto();
    public static OrdemServicoEstadoAberto getInstance() {
        return instance;
    }
    @Override
    public String getEstado() {
        return "aberto";
    }

    public boolean DirecionarTecnico(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEstadoDirecionado.getInstance());
        return true;
    }
    public boolean FinalizarChamado(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEstadoFinalizado.getInstance());
        return true;
    }
}
