package stateppb;

public class OrdemServicoEstadoAtendido extends OrdemServicoEstado{
    private OrdemServicoEstadoAtendido() {};
    private static OrdemServicoEstadoAtendido instance = new OrdemServicoEstadoAtendido();
    public static OrdemServicoEstadoAtendido getInstance() {
        return instance;
    }
    @Override
    public String getEstado() {
        return "Atendido";
    }

    public boolean Abrir(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEstadoAberto.getInstance());
        return true;
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