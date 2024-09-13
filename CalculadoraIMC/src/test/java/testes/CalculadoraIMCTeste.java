package testes;

import control.CalculadoraIMC;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCTeste {

    CalculadoraIMC calcIMC;

    @Before
    public void setup() {
        System.out.println("Teste:");
        calcIMC = new CalculadoraIMC();
    }

    @After
    public void teardown() {
        System.out.println("Concluído.");
        calcIMC = null;
    }

    @Test
    public void testeAdultoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcIMC.calcularImc(40, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoPesoGraveLimiteInferior() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(51.9, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoPesoGraveLimiteSuperior() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(55, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.1, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteSuperior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.9, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(60, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(80.9, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.1, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoObesidadeGrauILimiteInferior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.2, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoObesidadeGrauILimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.3, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoObesidadeGrauIILimiteInferior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.4, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoObesidadeGrauIILimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.5, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeAdultoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(129.6, 1.80, 30, "masculino"

));
    }

    @Test
    public void testeIdosoHomemBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(70.6, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(71.3, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(87.48, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(87.6, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.2, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauILimiteInferior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.3, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauILimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.4, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIILimiteInferior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.8, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIILimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.276, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(130, 1.80, 70, "masculino"

));
    }

    @Test
    public void testeIdosoFemininoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(50, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.9, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(56.4, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(69.12, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(69.4, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81.92, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauILimiteInferior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(83, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauILimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(94.72, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIILimiteInferior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(95, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIILimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(107.264, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(108, 1.60, 70, "feminino"

));
    }

    @Test
    public void testeCriancaHomem2AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(11, 0.90, 2, "masculino"

));
    }

    @Test
    public void testeCriancaHomem2AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(11.988, 0.90, 2, "masculino"

));
    }

    @Test
    public void testeCriancaHomem2AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(14.9, 0.90, 2, "masculino"

));
    }

    @Test
    public void testeCriancaHomem2AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(14.985, 0.90, 2, "masculino"

));
    }

    @Test
    public void testeCriancaHomem2AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(15.552, 0.90, 2, "masculino"

)); // IMC = 19.2
    }

    @Test
    public void testeCriancaHomem2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(16, 0.90, 2, "masculino"

)); // IMC = 19.75
    }

    @Test
    public void testeCriancaHomem4AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(14, 1.05, 4, "masculino"

));
    }

    @Test
    public void testeCriancaHomem4AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(15.435, 1.05, 4, "masculino"

));
    }

    @Test
    public void testeCriancaHomem4AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(19.1, 1.05, 4, "masculino"

));
    }

    @Test
    public void testeCriancaHomem4AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.18350, 1.05, 4, "masculino"

));
    }

    @Test
    public void testeCriancaHomem4AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.845, 1.05, 4, "masculino"

));
    }

    @Test
    public void testeCriancaHomem4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(20, 1.05, 4, "masculino"

));
    }

    @Test
    public void testeCriancaHomem6AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(16.01, 1.11, 6, "masculino"

));
    }

    @Test
    public void testeCriancaHomem6AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(17.00298, 1.11, 6, "masculino"

));
    }

    @Test
    public void testeCriancaHomem6AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(21.48, 1.11, 6, "masculino"

));
    }

    @Test
    public void testeCriancaHomem6AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(21.56175, 1.11, 6, "masculino"

));
    }

    @Test
    public void testeCriancaHomem6AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(22.64, 1.11, 6, "masculino"

));
    }

    @Test
    public void testeCriancaHomem6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(23, 1.11, 6, "masculino"

));
    }

    @Test
    public void testeCriancaHomem8AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(20.5, 1.22, 8, "masculino"

));
    }

    @Test
    public void testeCriancaHomem8AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(20.57, 1.22, 8, "masculino"

));
    }

    @Test
    public void testeCriancaHomem8AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(27.66936, 1.22, 8, "masculino"

));
    }

    @Test
    public void testeCriancaHomem8AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(27.77, 1.22, 8, "masculino"

));
    }

    @Test
    public void testeCriancaHomem8AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(29.76, 1.22, 8, "masculino"

));
    }

    @Test
    public void testeCriancaHomem8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(30, 1.22, 8, "masculino"

));
    }

    @Test
    public void testeCriancaHomem10AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(28, 1.41, 10, "masculino"

));
    }

    @Test
    public void testeCriancaHomem10AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(28.23102, 1.41, 10, "masculino"

));
    }

    @Test
    public void testeCriancaHomem10AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(40.2, 1.41, 10, "masculino"

));
    }

    @Test
    public void testeCriancaHomem10AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(40.3584300, 1.41, 10, "masculino"

));
    }

    @Test
    public void testeCriancaHomem10AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(43.7, 1.41, 10, "masculino"

));
    }

    @Test
    public void testeCriancaHomem10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(45, 1.41, 10, "masculino"

));
    }

    @Test
    public void testeCriancaFeminino2AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(11.66, 0.90, 2, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino2AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(11.664, 0.90, 2, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino2AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(14.5, 0.90, 2, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino2AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(14.58, 0.90, 2, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino2AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(15.471, 0.90, 2, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(16, 0.90, 2, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino4AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(14, 1.05, 4, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino4AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(15.435, 1.05, 4, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino4AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(18.51, 1.05, 4, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino4AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(18.522, 1.05, 4, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino4AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.845, 1.05, 4, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(20, 1.05, 4, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino6AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(17.8405250, 1.15, 6, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino6AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(18.053, 1.15, 6, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino6AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(22.46, 1.15, 6, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino6AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(22.61475, 1.15, 6, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino6AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(24.85, 1.15, 6, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(25, 1.15, 6, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino8AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(20.1, 1.22, 8, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino8AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(20.24224, 1.22, 8, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino8AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(27.03, 1.22, 8, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino8AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(27.1, 1.22, 8, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino8AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(30.63, 1.22, 8, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(31, 1.22, 8, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino10AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(27, 1.41, 10, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino10AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(28.12, 1.41, 10, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino10AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(39.7, 1.41, 10, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino10AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(40.02, 1.41, 10, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino10AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(45.7263, 1.41, 10, "feminino"

));
    }

    @Test
    public void testeCriancaFeminino10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(46.5, 1.41, 10, "feminino"

));
    }
}