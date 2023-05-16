package stateppb;

public class OrdemServicoEstadoDirecionado extends OrdemServicoEstado{
    private OrdemServicoEstadoDirecionado() {};
    private static OrdemServicoEstadoDirecionado instance = new OrdemServicoEstadoDirecionado();
    public static OrdemServicoEstadoDirecionado getInstance() {
        return instance;
    }
    @Override
    public String getEstado() {
        return "Direcionado";
    }

    public boolean Abrir(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEstadoAberto.getInstance());
        return true;
    }
    public boolean Atender(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEstadoEmAtendimento.getInstance());
        return true;
    }
}
