package stateppb;

public class OrdemServicoEstadoEmAtendimento extends OrdemServicoEstado{
    private OrdemServicoEstadoEmAtendimento() {};
    private static OrdemServicoEstadoEmAtendimento instance = new OrdemServicoEstadoEmAtendimento();
    public static OrdemServicoEstadoEmAtendimento getInstance() {
        return instance;
    }
    @Override
    public String getEstado() {
        return "Em Atendimento";
    }

    public boolean FinalizarAtendimento(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEstadoAtendido.getInstance());
        return true;
    }
}