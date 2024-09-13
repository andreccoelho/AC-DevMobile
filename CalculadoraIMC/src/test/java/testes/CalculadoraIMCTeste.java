package testes;

import control.CalculadoraIMC;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCTeste {

    // Declaração de variáveis
    CalculadoraIMC calcIMC;

    // setup: método que executa antes de cada teste
    @Before
    public void setup() {
        System.out.println("Iniciando teste...");
        calcIMC = new CalculadoraIMC();
    }

    // teardown: método que executa após cada teste
    @After
    public void teardown() {
        System.out.println("Teste finalizado.");
        calcIMC = null;
    }

    // ADULTOS TESTES (14 no total)

    // Baixo peso muito grave: IMC < 16 | (40, 1.80, 30, "h") = 12.3
    @Test
    public void testeCalcularImcAdultoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcIMC.calcularImc(40, 1.80, 30, "h"));
    }

    // Baixo peso grave 1: 16 <= IMC < 17 | (51.9, 1.80, 30, "h") = 16
    @Test
    public void testeCalcularImcAdultoPesoGrave1() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(51.9, 1.80, 30, "h"));
    }

    // Baixo peso grave 2: 16 <= IMC < 17 | (54,8, 1.80, 30, "h") = 16,9
    @Test
    public void testeCalcularImcAdultoPesoGrave2() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(55, 1.80, 30, "h"));
    }

    // Baixo peso1: 17 <= IMC < 18.5 | (55,1, 1.80, 30, "h") = 17
    @Test
    public void testeCalcularImcAdultoBaixoPesoDoNormal1() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.1, 1.80, 30, "h"));
    }

    // Baixo peso2: 17 <= IMC < 18.5 | (55.9, 1.80, 30, "h") = 18.5
    @Test
    public void testeCalcularImcAdultoBaixoPesoDoNormal2() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.9, 1.80, 30, "h"));
    }

    // Peso normal1: 18.5 <= IMC < 25 | (60, 1.80, 30, "h") = 18.5
    @Test
    public void testeCalcularImcAdultoPesoNormal1() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(60, 1.80, 30, "h"));
    }

    // Peso normal2: 18.5 <= IMC < 25 | (80.9, 1.80, 30, "h") = 24.9
    @Test
    public void testeCalcularImcAdultoPesoNormal2() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(80.9, 1.80, 30, "h"));
    }

    // Sobrepeso1: 25 <= IMC < 30 | (81, 1.80, 30, "h") = 25
    @Test
    public void testeCalcularImcAdultoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81, 1.80, 30, "h"));
    }

    // Sobrepeso2: 25 <= IMC < 30 | (97.1, 1.80, 30, "h") = 29.9
    @Test
    public void testeCalcularImcAdultoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.1, 1.80, 30, "h"));
    }

    // Obesidade grau I1: 30 <= IMC < 35 | (97.2, 1.80, 30, "h") = 30
    @Test
    public void testeCalcularImcAdultoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.2, 1.80, 30, "h"));
    }

    // Obesidade grau I2: 30 <= IMC < 35 | (113.3, 1.80, 30, "h") = 34.9
    @Test
    public void testeCalcularImcAdultoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.3, 1.80, 30, "h"));
    }

    // Obesidade grau II1: 35 <= IMC < 40 | (113.4, 1.80, 30, "h") = 35
    @Test
    public void testeCalcularImcAdultoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.4, 1.80, 30, "h"));
    }

    // Obesidade grau II2: 35 <= IMC < 40 | (129.5, 1.80, 30, "h") = 39.9
    @Test
    public void testeCalcularImcAdultoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.5, 1.80, 30, "h"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 40 | (129.6, 1.80, 30, "h") = 40
    @Test
    public void testeCalcularImcAdultoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(129.6, 1.80, 30, "h"));
    }

    // IdosoS TESTES (20 no total)

    // Idoso Homem

    // Baixo peso: IMC < 21.9 | (70.6, 1.80, 70, "h") = 21.8
    @Test
    public void testeCalcularImcIdosoHomemBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(70.6, 1.80, 70, "h"));
    }

    // Peso normal1: 22 <= IMC <= 27 | (71.3, 1.80, 70, "h") = 22
    @Test
    public void testeCalcularImcIdosoHomemPesoNormal1() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(71.3, 1.80, 70, "h"));
    }

    // Peso normal2: 22 <= IMC <= 27 | (87.48, 1.80, 70, "h") = 27
    @Test
    public void testeCalcularImcIdosoHomemPesoNormal2() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(87.48, 1.80, 70, "h"));
    }

    // Sobrepeso1: 27 < IMC <= 30 | (87.6, 1.80, 70, "h") = 27.1
    @Test
    public void testeCalcularImcIdosoHomemSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(87.6, 1.80, 70, "h"));
    }

    // Sobrepeso2: 27 < IMC <= 30 | (97,2, 1.80, 70, "h") = 30
    @Test
    public void testeCalcularImcIdosoHomemSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.2, 1.80, 70, "h"));
    }

    // Obesidade grau I1: 30 < IMC <= 35 | (97.3, 1.80, 70, "h") = 30.01
    @Test
    public void testeCalcularImcIdosoHomemObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.3, 1.80, 70, "h"));
    }

    // Obesidade grau I2: 30 < IMC <= 35 | (113.4, 1.80, 70, "h") = 34.9
    @Test
    public void testeCalcularImcIdosoHomemObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.4, 1.80, 70, "h"));
    }

    // Obesidade grau II1: 35 < IMC <= 39.9 | (113.8, 1.80, 70, "h") = 35.03
    @Test
    public void testeCalcularImcIdosoHomemObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.8, 1.80, 70, "h"));
    }

    // Obesidade grau II2: 35 < IMC <= 39.9 | (129.276, 1.80, 70, "h") = 39.9
    @Test
    public void testeCalcularImcIdosoHomemObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.276, 1.80, 70, "h"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 40 | (130, 1.80, 70, "h") = 40
    @Test
    public void testeCalcularImcIdosoHomemObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(130, 1.80, 70, "h"));
    }

    // Idoso FEMININO

    // Baixo peso: IMC < 21.9 | (50, 1.60, 70, "m") = 19.5
    @Test
    public void testeCalcularImcIdosoFemininoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(50, 1.60, 70, "m"));
    }

    // Baixo peso: IMC < 21.9 | (55.9, 1.60, 70, "m") = 21.8
    @Test
    public void testeCalcularImcIdosoFemininoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.9, 1.60, 70, "m"));
    }

    // Peso normal1: 22 <= IMC <= 27 | (56.4, 1.60, 70, "m") = 22
    @Test
    public void testeCalcularImcIdosoFemininoPesoNormal1() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(56.4, 1.60, 70, "m"));
    }

    // Peso normal2: 22 <= IMC <= 27 | (69.12, 1.60, 70, "m") = 27
    @Test
    public void testeCalcularImcIdosoFemininoPesoNormal2() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(69.12, 1.60, 70, "m"));
    }

    // Sobrepeso1: 27 < IMC <= 32 | (69.4, 1.60, 70, "m") = 27.1
    @Test
    public void testeCalcularImcIdosoFemininoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(69.4, 1.60, 70, "m"));
    }

    // Sobrepeso2: 27 < IMC <= 32 | (81.92, 1.60, 70, "m") = 32
    @Test
    public void testeCalcularImcIdosoFemininoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81.92, 1.60, 70, "m"));
    }

    // Obesidade grau I1: 32 < IMC <= 37 | (83, 1.60, 70, "m") = 32.1
    @Test
    public void testeCalcularImcIdosoFemininoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(83, 1.60, 70, "m"));
    }

    // Obesidade grau I2: 32 < IMC <= 37 | (94.72, 1.60, 70, "m") = 37
    @Test
    public void testeCalcularImcIdosoFemininoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(94.72, 1.60, 70, "m"));
    }
    // Obesidade grau II1: 37 < IMC <= 41.9 | (95, 1.60, 70, "m") = 37.1
    @Test
    public void testeCalcularImcIdosoFemininoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(95, 1.60, 70, "m"));
    }

    // Obesidade grau II2: 37 < IMC <= 41.9 | (107.264, 1.60, 70, "m") = 41.9
    @Test
    public void testeCalcularImcIdosoFemininoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(107.264, 1.60, 70, "m"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 42 | (107.6, 1.60, 70, "m") = 42
    @Test
    public void testeCalcularImcIdosoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(108, 1.60, 70, "m"));
    }

    // CRIANÇAS TESTES (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})

    // CRIANÇA Homem

    // 2 ANOS

    // Baixo peso: IMC < 14.8 | (11, 0.90, 2, "h") = 13.5
    @Test
    public void testeCalcularImcCriancaHomem2AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(11, 0.90, 2, "h"));
    }

    // Peso normal inferior: 14.8 <= IMC < 18.5 | (11.988, 0.90, 2, "h") = 14.8
    @Test
    public void testeCalcularImcCriancaHomem2AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(11.988, 0.90, 2, "h"));
    }

    // Peso normal superior: 14.8 <= IMC < 18.5 | (14.9, 0.90, 2, "h") = 18.4
    @Test
    public void testeCalcularImcCriancaHomem2AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(14.9, 0.90, 2, "h"));
    }

    // Sobrepeso inferior: 18.5 <= IMC <= 19.2 | (14.985, 0.90, 2, "h") = 18.5
    @Test
    public void testeCalcularImcCriancaHomem2AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(14.985, 0.90, 2, "h"));
    }

    // Sobrepeso superior: 18.5 <= IMC <= 19.2 | (15.552, 0.90, 2, "h") = 19.2
    @Test
    public void testeCalcularImcCriancaHomem2AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(15.552, 0.90, 2, "h")); // IMC = 19.2
    }

    // Obesidade: IMC > 19.2 | (16, 0.90, 2, "h") = 19.75
    @Test
    public void testeCalcularImcCriancaHomem2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(16, 0.90, 2, "h")); // IMC = 19.75
    }

    // 4 ANOS

    // Baixo peso: IMC < 14 | (14, 1.05, 4, "h") = 12.7
    @Test
    public void testeCalcularImcCriancaHomem4AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(14, 1.05, 4, "h"));
    }

    // Peso normal inferior: 14 <= IMC < 17.4 | (15.435, 1.05, 4, "h") = 14
    @Test
    public void testeCalcularImcCriancaHomem4AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(15.435, 1.05, 4, "h"));
    }

    // Peso normal superior: 14 <= IMC < 17.4 | (19.1, 1.05, 4, "h") = 17.39
    @Test
    public void testeCalcularImcCriancaHomem4AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(19.1, 1.05, 4, "h"));
    }

    // Sobrepeso inferior: 17.4 <= IMC <= 18 | (19.18350, 1.05, 4, "h") = 17.4
    @Test
    public void testeCalcularImcCriancaHomem4AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.18350, 1.05, 4, "h"));
    }

    // Sobrepeso superior: 17.4 <= IMC <= 18 | (19.845, 1.05, 4, "h") = 18
    @Test
    public void testeCalcularImcCriancaHomem4AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.845, 1.05, 4, "h"));
    }

    // Obesidade: IMC > 18 | (20, 1.05, 4, "h") = 18.14
    @Test
    public void testeCalcularImcCriancaHomem4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(20, 1.05, 4, "h"));
    }

    // 6 ANOS

    // Baixo peso: IMC < 13.8 | (16.01, 1.11, 6, "h") = 13
    @Test
    public void testeCalcularImcCriancaHomem6AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(16.01, 1.11, 6, "h"));
    }

    // Peso normal inferior: 13.8 <= IMC < 17.5 | (17.00298, 1.11, 6, "h") = 13.8
    @Test
    public void testeCalcularImcCriancaHomem6AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(17.00298, 1.11, 6, "h"));
    }

    // Peso normal superior: 13.8 <= IMC < 17.5 | (21.48, 1.11, 6, "h") = 17.49
    @Test
    public void testeCalcularImcCriancaHomem6AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(21.48, 1.11, 6, "h"));
    }

    // Sobrepeso inferior: 17.5 <= IMC <= 18.4 | (21.56175, 1.11, 6, "h") = 17.5
    @Test
    public void testeCalcularImcCriancaHomem6AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(21.56175, 1.11, 6, "h"));
    }

    // Sobrepeso superior: 17.5 <= IMC <= 18.4 | (22.64, 1.11, 6, "h") = 18.4
    @Test
    public void testeCalcularImcCriancaHomem6AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(22.64, 1.11, 6, "h"));
    }

    // Obesidade: IMC > 18.4 | (23, 1.11, 6, "h") = 18.6
    @Test
    public void testeCalcularImcCriancaHomem6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(23, 1.11, 6, "h"));
    }

    // CRIANÇA Homem

// 8 ANOS

    // Baixo peso: IMC < 13.8 | (20.5, 1.22, 8, "h") = 13.75
    @Test
    public void testeCalcularImcCriancaHomem8AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(20.5, 1.22, 8, "h"));
    }

    // Peso normal inferior: 13.8 <= IMC < 18.6 | (20.57, 1.22, 8, "h") = 13.8
    @Test
    public void testeCalcularImcCriancaHomem8AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(20.57, 1.22, 8, "h"));
    }

    // Peso normal superior: 13.8 <= IMC < 18.6 | (27.66936, 1.22, 8, "h") = 18.59
    @Test
    public void testeCalcularImcCriancaHomem8AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(27.66936, 1.22, 8, "h"));
    }

    // Sobrepeso inferior: 18.6 <= IMC <= 20.0 | (27.77, 1.22, 8, "h") = 18.6
    @Test
    public void testeCalcularImcCriancaHomem8AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(27.77, 1.22, 8, "h"));
    }

    // Sobrepeso superior: 18.6 <= IMC <= 20.0 | (29.76, 1.22, 8, "h") = 20.0
    @Test
    public void testeCalcularImcCriancaHomem8AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(29.76, 1.22, 8, "h"));
    }

    // Obesidade: IMC > 20.0 | (30, 1.22, 8, "h") = 20.13
    @Test
    public void testeCalcularImcCriancaHomem8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(30, 1.22, 8, "h"));
    }

// 10 ANOS

    // Baixo peso: IMC < 14.2 | (28, 1.41, 10, "h") = 14.1
    @Test
    public void testeCalcularImcCriancaHomem10AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(28, 1.41, 10, "h"));
    }

    // Peso normal inferior: 14.2 <= IMC < 20.3 | (28.23102, 1.41, 10, "h") = 14.2
    @Test
    public void testeCalcularImcCriancaHomem10AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(28.23102, 1.41, 10, "h"));
    }

    // Peso normal superior: 14.2 <= IMC < 20.3 | (40.2, 1.41, 10, "h") = 20.29
    @Test
    public void testeCalcularImcCriancaHomem10AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(40.2, 1.41, 10, "h"));
    }

    // Sobrepeso inferior: 20.3 <= IMC <= 22 | (40.3584300, 1.41, 10, "h") = 20.3
    @Test
    public void testeCalcularImcCriancaHomem10AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(40.3584300, 1.41, 10, "h"));
    }

    // Sobrepeso superior: 20.3 <= IMC <= 22 | (43.7, 1.41, 10, "h") = 22.0
    @Test
    public void testeCalcularImcCriancaHomem10AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(43.7, 1.41, 10, "h"));
    }

    // Obesidade: IMC > 22 | (45, 1.41, 10, "h") = 22.61
    @Test
    public void testeCalcularImcCriancaHomem10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(45, 1.41, 10, "h"));
    }

    // CRIANÇA FEMININO

// 2 ANOS

    // Baixo peso: IMC < 14.4 | (11.66, 0.90, 2, "m") = 14.39
    @Test
    public void testeCalcularImcCriancaFeminino2AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(11.66, 0.90, 2, "m"));
    }

    // Peso normal inferior: 14.4 <= IMC < 18 | (11.664, 0.90, 2, "m") = 14.4
    @Test
    public void testeCalcularImcCriancaFeminino2AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(11.664, 0.90, 2, "m"));
    }

    // Peso normal superior: 14.4 <= IMC < 18 | (14.5, 0.90, 2, "m") = 17.99
    @Test
    public void testeCalcularImcCriancaFeminino2AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(14.5, 0.90, 2, "m"));
    }

    // Sobrepeso inferior: 18 <= IMC <= 19.1 | (14.58, 0.90, 2, "m") = 18
    @Test
    public void testeCalcularImcCriancaFeminino2AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(14.58, 0.90, 2, "m"));
    }

    // Sobrepeso superior: 18 <= IMC <= 19.1 | (15.471, 0.90, 2, "m") = 19.1
    @Test
    public void testeCalcularImcCriancaFeminino2AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(15.471, 0.90, 2, "m"));
    }

    // Obesidade: IMC > 19.1 | (16, 0.90, 2, "m") = 19.75
    @Test
    public void testeCalcularImcCriancaFeminino2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(16, 0.90, 2, "m"));
    }

// 4 ANOS

    // Baixo peso: IMC < 13.8 | (14, 1.05, 4, "m") = 12.7
    @Test
    public void testeCalcularImcCriancaFeminino4AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(14, 1.05, 4, "m"));
    }

    // Peso normal inferior: 13.8 <= IMC < 16.8 | (15.435, 1.05, 4, "m") = 13.8
    @Test
    public void testeCalcularImcCriancaFeminino4AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(15.435, 1.05, 4, "m"));
    }

    // Peso normal superior: 13.8 <= IMC < 16.8 | (18.51, 1.05, 4, "m") = 16.79
    @Test
    public void testeCalcularImcCriancaFeminino4AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(18.51, 1.05, 4, "m"));
    }

    // Sobrepeso inferior: 16.8 <= IMC <= 18 | (18.522, 1.05, 4, "m") = 16.8
    @Test
    public void testeCalcularImcCriancaFeminino4AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(18.522, 1.05, 4, "m"));
    }

    // Sobrepeso superior: 16.8 <= IMC <= 18 | (19.845, 1.05, 4, "m") = 18
    @Test
    public void testeCalcularImcCriancaFeminino4AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.845, 1.05, 4, "m"));
    }

    // Obesidade: IMC > 18 | (20, 1.05, 4, "m") = 18.14
    @Test
    public void testeCalcularImcCriancaFeminino4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(20, 1.05, 4, "m"));
    }

    // CRIANÇA FEMININO

// 6 ANOS

    // Baixo peso: IMC < 13.5 | (17.8405250, 1.15, 6, "m") = 13.49
    @Test
    public void testeCalcularImcCriancaFeminino6AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(17.8405250, 1.15, 6, "m"));
    }

    // Peso normal inferior: 13.5 <= IMC < 17.1 | (18.053, 1.15, 6, "m") = 13.5
    @Test
    public void testeCalcularImcCriancaFeminino6AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(18.053, 1.15, 6, "m"));
    }

    // Peso normal superior: 13.5 <= IMC < 17.1 | (22.46, 1.15, 6, "m") = 17.09
    @Test
    public void testeCalcularImcCriancaFeminino6AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(22.46, 1.15, 6, "m"));
    }

    // Sobrepeso inferior: 17.1 <= IMC <= 18.8 | (22.61475, 1.15, 6, "m") = 17.1
    @Test
    public void testeCalcularImcCriancaFeminino6AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(22.61475, 1.15, 6, "m"));
    }

    // Sobrepeso superior: 17.1 <= IMC <= 18.8 | (24.85, 1.15, 6, "m") = 18.8
    @Test
    public void testeCalcularImcCriancaFeminino6AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(24.85, 1.15, 6, "m"));
    }

    // Obesidade: IMC > 18.8 | (25, 1.15, 6, "m") = 18.9
    @Test
    public void testeCalcularImcCriancaFeminino6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(25, 1.15, 6, "m"));
    }

// 8 ANOS

    // Baixo peso: IMC < 13.6 | (20.1, 1.22, 8, "m") = 13.59
    @Test
    public void testeCalcularImcCriancaFeminino8AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(20.1, 1.22, 8, "m"));
    }

    // Peso normal inferior: 13.6 <= IMC < 18.2 | (20.24224, 1.22, 8, "m") = 13.6
    @Test
    public void testeCalcularImcCriancaFeminino8AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(20.24224, 1.22, 8, "m"));
    }

    // Peso normal superior: 13.6 <= IMC < 18.2 | (27.03, 1.22, 8, "m") = 18.19
    @Test
    public void testeCalcularImcCriancaFeminino8AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(27.03, 1.22, 8, "m"));
    }

    // Sobrepeso inferior: 18.2 <= IMC <= 20.6 | (27.1, 1.22, 8, "m") = 18.2
    @Test
    public void testeCalcularImcCriancaFeminino8AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(27.1, 1.22, 8, "m"));
    }

    // Sobrepeso superior: 18.2 <= IMC <= 20.6 | (30.63, 1.22, 8, "m") = 20.6
    @Test
    public void testeCalcularImcCriancaFeminino8AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(30.63, 1.22, 8, "m"));
    }

    // Obesidade: IMC > 20.6 | (31, 1.22, 8, "m") = 20.84
    @Test
    public void testeCalcularImcCriancaFeminino8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(31, 1.22, 8, "m"));
    }

// 10 ANOS

    // Baixo peso: IMC < 14 | (27, 1.41, 10, "m") = 13.99
    @Test
    public void testeCalcularImcCriancaFeminino10AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(27, 1.41, 10, "m"));
    }

    // Peso normal inferior: 14 <= IMC < 20 | (28.12, 1.41, 10, "m") = 14
    @Test
    public void testeCalcularImcCriancaFeminino10AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(28.12, 1.41, 10, "m"));
    }

    // Peso normal superior: 14 <= IMC < 20 | (39.7, 1.41, 10, "m") = 19.99
    @Test
    public void testeCalcularImcCriancaFeminino10AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(39.7, 1.41, 10, "m"));
    }

    // Sobrepeso inferior: 20 <= IMC <= 23 | (40.02, 1.41, 10, "m") = 20
    @Test
    public void testeCalcularImcCriancaFeminino10AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(40.02, 1.41, 10, "m"));
    }

    // Sobrepeso superior: 20 <= IMC <= 23 | (45.7263, 1.41, 10, "m") = 23
    @Test
    public void testeCalcularImcCriancaFeminino10AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(45.7263, 1.41, 10, "m"));
    }

    // Obesidade: IMC > 23 | (46.5, 1.41, 10, "m") = 23.43
    @Test
    public void testeCalcularImcCriancaFeminino10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(46.5, 1.41, 10, "m"));
    }
}
