package stateppb;

public class OrdemServico {
    private String codigo;
    private OrdemServicoEstado estado;

    public OrdemServico(){
        this.estado = OrdemServicoEstadoAberto.getInstance();
    }
    public OrdemServicoEstado getEstado() {
        return estado;
    }
    public void setEstado(OrdemServicoEstado estado) {
        this.estado = estado;
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String nome) {
        this.codigo = codigo;
    }


    public boolean Abrir() {
        return estado.Abrir(this);
    }
    public boolean DirecionarTecnico() {
        return  estado.DirecionarTecnico(this);
    }
    public boolean Atender() {
        return  estado.Atender(this);
    }
    public boolean FinalizarAtendimento() {
        return  estado.FinalizarAtendimento(this);
    }
    public boolean FinalizarChamado() {
        return  estado.FinalizarChamado(this);
    }


}
