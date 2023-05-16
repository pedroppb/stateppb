package stateppb;

public abstract class OrdemServicoEstado {
    public abstract String getEstado();
    public boolean Abrir(OrdemServico ordemServico) {
        return false;
    }
    public boolean DirecionarTecnico(OrdemServico ordemServico) {
        return false;
    }
    public boolean Atender(OrdemServico ordemServico) {
        return false;
    }
    public boolean FinalizarAtendimento(OrdemServico ordemServico) {
        return false;
    }
    public boolean FinalizarChamado(OrdemServico ordemServico) {
        return false;
    }

}
