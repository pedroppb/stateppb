package stateppb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrdemServicoTest {
    OrdemServico os1;

    @BeforeEach
    public void setUp() {
        os1 = new OrdemServico();
    }

    // Aluno matriculado
    @Test
    void AbertoNaoDeveAbrir() {
        os1.setEstado(OrdemServicoEstadoAberto.getInstance());
        assertFalse(os1.Abrir());
    }
    @Test
    void AbertoDeveDirecionarTecnico() {
        os1.setEstado(OrdemServicoEstadoAberto.getInstance());
        assertTrue(os1.DirecionarTecnico());
        assertEquals(OrdemServicoEstadoDirecionado.getInstance(), os1.getEstado());
    }
    @Test
    void AbertoNaoDeveAtender() {
        os1.setEstado(OrdemServicoEstadoAberto.getInstance());
        assertFalse(os1.Atender());
    }
    @Test
    void AbertoNaoDeveFinalizarAtendimento() {
        os1.setEstado(OrdemServicoEstadoAberto.getInstance());
        assertFalse(os1.FinalizarAtendimento());
    }
    @Test
    void AbertoDeveFinalizarChamado() {
        os1.setEstado(OrdemServicoEstadoAberto.getInstance());
        assertTrue(os1.FinalizarChamado());
        assertEquals(OrdemServicoEstadoFinalizado.getInstance(), os1.getEstado());
    }
    @Test
    void DirecionadoDeveAbrir() {
        os1.setEstado(OrdemServicoEstadoDirecionado.getInstance());
        assertTrue(os1.Abrir());
        assertEquals(OrdemServicoEstadoAberto.getInstance(), os1.getEstado());
    }
    @Test
    void DirecionadoNaoDeveDirecionarTecnico() {
        os1.setEstado(OrdemServicoEstadoDirecionado.getInstance());
        assertFalse(os1.DirecionarTecnico());
    }
    @Test
    void DirecionadoDeveAtender() {
        os1.setEstado(OrdemServicoEstadoDirecionado.getInstance());
        assertTrue(os1.Atender());
        assertEquals(OrdemServicoEstadoEmAtendimento.getInstance(), os1.getEstado());
    }
    @Test
    void DirecionadoNaoDeveFinalizarAtendimento() {
        os1.setEstado(OrdemServicoEstadoDirecionado.getInstance());
        assertFalse(os1.FinalizarAtendimento());
    }
    @Test
    void DirecionadoNaoDeveFinalizarChamado() {
        os1.setEstado(OrdemServicoEstadoDirecionado.getInstance());
        assertFalse(os1.FinalizarChamado());
    }
    @Test
    void EmAtendimentoNaoDeveAbrir() {
        os1.setEstado(OrdemServicoEstadoEmAtendimento.getInstance());
        assertFalse(os1.Abrir());
    }
    @Test
    void EmAtendimentoNaoDeveDirecionarTecnico() {
        os1.setEstado(OrdemServicoEstadoEmAtendimento.getInstance());
        assertFalse(os1.DirecionarTecnico());
    }
    @Test
    void EmAtendimentoNaoDeveAtender() {
        os1.setEstado(OrdemServicoEstadoEmAtendimento.getInstance());
        assertFalse(os1.Atender());
    }
    @Test
    void EmAtendimentoDeveFinalizarAtendimento() {
        os1.setEstado(OrdemServicoEstadoEmAtendimento.getInstance());
        assertTrue(os1.FinalizarAtendimento());
        assertEquals(OrdemServicoEstadoAtendido.getInstance(), os1.getEstado());
    }
    @Test
    void EmAtendimentoNaoDeveFinalizarChamado() {
        os1.setEstado(OrdemServicoEstadoEmAtendimento.getInstance());
        assertFalse(os1.FinalizarChamado());
    }
    @Test
    void AtendidoDeveAbrir() {
        os1.setEstado(OrdemServicoEstadoAtendido.getInstance());
        assertTrue(os1.Abrir());
        assertEquals(OrdemServicoEstadoAberto.getInstance(), os1.getEstado());
    }
    @Test
    void AtendidoDeveDirecionarTecnico() {
        os1.setEstado(OrdemServicoEstadoAtendido.getInstance());
        assertTrue(os1.DirecionarTecnico());
        assertEquals(OrdemServicoEstadoDirecionado.getInstance(), os1.getEstado());
    }
    @Test
    void AtendidoNaoDeveAtender() {
        os1.setEstado(OrdemServicoEstadoAtendido.getInstance());
        assertFalse(os1.Atender());
    }
    @Test
    void AtendidoNaoDeveFinalizarAtendimento() {
        os1.setEstado(OrdemServicoEstadoAtendido.getInstance());
        assertFalse(os1.FinalizarAtendimento());
    }
    @Test
    void AtendidoDeveFinalizarChamado() {
        os1.setEstado(OrdemServicoEstadoAtendido.getInstance());
        assertTrue(os1.FinalizarChamado());
        assertEquals(OrdemServicoEstadoFinalizado.getInstance(), os1.getEstado());
    }
    @Test
    void FinalizadoNaoDeveAbrir() {
        os1.setEstado(OrdemServicoEstadoFinalizado.getInstance());
        assertFalse(os1.Abrir());
    }
    @Test
    void FinalizadoNaoDeveDirecionarTecnico() {
        os1.setEstado(OrdemServicoEstadoFinalizado.getInstance());
        assertFalse(os1.DirecionarTecnico());
    }
    @Test
    void FinalizadoNaoDeveAtender() {
        os1.setEstado(OrdemServicoEstadoFinalizado.getInstance());
        assertFalse(os1.Atender());
    }
    @Test
    void FinalizadoNaoDeveFinalizarAtendimento() {
        os1.setEstado(OrdemServicoEstadoFinalizado.getInstance());
        assertFalse(os1.FinalizarAtendimento());
    }
    @Test
    void FinalizadoNaoDeveFinalizarChamado() {
        os1.setEstado(OrdemServicoEstadoFinalizado.getInstance());
        assertFalse(os1.FinalizarChamado());
    }
}
