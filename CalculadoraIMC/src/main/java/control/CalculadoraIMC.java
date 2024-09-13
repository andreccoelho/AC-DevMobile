package control;

import java.util.Objects;

public class CalculadoraIMC {

    // Método principal que calcula o IMC com base em diferentes faixas etárias e sexo.
    public String calcularImc(double peso, double altura, int idade, String sexo) {
        if (idade <= 20) { // Se a idade for menor ou igual a 20, chama o método para calcular IMC infantil.
            return calcularImcCrianca(idade, sexo, Imc(peso, altura));
        } else if (idade < 65) { // Se a idade for entre 21 e 64 anos, chama o método para calcular IMC de adulto.
            return calcularImcAdulto(Imc(peso, altura));
        } else { // Se a idade for 65 anos ou mais, chama o método para calcular IMC de idoso.
            return calcularImcIdoso(sexo, Imc(peso, altura));
        }
    }

    // Método que calcula o valor numérico do IMC com base no peso e altura.
    private static double Imc(double peso, double altura) {
        double imc = peso / (altura * altura); // Fórmula padrão para cálculo do IMC.
        return (imc * 100000.0) / 100000.0; 
    }

    // Método que classifica o IMC para adultos com base em categorias de peso.
    public String calcularImcAdulto(double imc) {
        if (imc < 16) {
            return "Baixo peso muito grave";
        } else if (imc >= 16 && imc < 17) {
            return "Baixo peso grave";
        } else if (imc >= 17 && imc < 18.5) {
            return "Baixo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }

    // Método que classifica o IMC para idosos com base no sexo e faixas de IMC.
    public String calcularImcIdoso(String sexo, double imc) {
        if (Objects.equals(sexo, "masculino")) { // Se o sexo for masculino.
            if (imc < 22) {
                return "Baixo peso";
            } else if (imc >= 22 && imc <= 27) {
                return "Peso normal";
            } else if (imc > 27 && imc <= 30) {
                return "Sobrepeso";
            } else if (imc > 30 && imc <= 35) {
                return "Obesidade grau I";
            } else if (imc > 35 && imc <= 39.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else if (Objects.equals(sexo, "feminino")) { // Se o sexo for feminino.
            if (imc < 21.9) {
                return "Baixo peso";
            } else if (imc >= 22 && imc <= 27) {
                return "Peso normal";
            } else if (imc > 27 && imc <= 32) {
                return "Sobrepeso";
            } else if (imc > 32 && imc <= 37) {
                return "Obesidade grau I";
            } else if (imc > 37 && imc <= 41.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            return "Sexo informado inválido."; // Retorna erro se o sexo não for válido.
        }
    }

    // Método que calcula o IMC para crianças, considerando a idade e sexo.
    public String calcularImcCrianca(int idade, String sexo, double imc) {
        if (Objects.equals(sexo, "masculino")) { // Se o sexo for masculino, calcula o IMC de acordo com a idade.
            return calcularImcCriancaHomem(idade, imc);
        } else if (Objects.equals(sexo, "feminino")) { // Se o sexo for feminino, calcula o IMC de acordo com a idade.
            return calcularImcCriancaMulher(idade, imc);
        } else {
            return "Sexo informado inválido."; // Retorna erro se o sexo não for válido.
        }
    }

    // Métodos que calculam o IMC de crianças do sexo feminino para diferentes idades.
    public String calcularImcCriancaMulher(int idade, double imc) {
        if (idade == 2) {
            return calcularImcCriancaMulher2Anos(imc);
        } else if (idade == 4) {
            return calcularImcCriancaMulher4Anos(imc);
        } else if (idade == 6) {
            return calcularImcCriancaMulher6Anos(imc);
        } else if (idade == 8) {
            return calcularImcCriancaMulher8Anos(imc);
        } else if (idade == 10) {
            return calcularImcCriancaMulher10Anos(imc);
        } else {
            return "Idade informada não disponível."; // Retorna erro para idades fora do intervalo.
        }
    }

    // Métodos que calculam o IMC de crianças do sexo masculino para diferentes idades.
    public String calcularImcCriancaHomem(int idade, double imc) {
        if (idade == 2) {
            return calcularImcCriancaHomem2Anos(imc);
        } else if (idade == 4) {
            return calcularImcCriancaHomem4Anos(imc);
        } else if (idade == 6) {
            return calcularImcCriancaHomem6Anos(imc);
        } else if (idade == 8) {
            return calcularImcCriancaHomem8Anos(imc);
        } else if (idade == 10) {
            return calcularImcCriancaHomem10Anos(imc);
        } else {
            return "Idade informada não disponível."; // Retorna erro para idades fora do intervalo.
        }
    }

    // Métodos específicos para calcular o IMC de meninos e meninas de diferentes idades com faixas de IMC.
    public String calcularImcCriancaHomem2Anos(double imc) {
        if (imc < 14.8) {
            return "Baixo peso";
        } else if (imc >= 14.8 && imc < 18.5) {
            return "Peso normal";
        } else if (imc >= 18.5 && imc <= 19.2) {
            return "Sobrepeso";
        } else if (imc > 19.2) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaHomem4Anos(double imc) {
        if (imc < 14) {
            return "Baixo peso";
        } else if (imc >= 14 && imc < 17.4) {
            return "Peso normal";
        } else if (imc >= 17.4 && imc <= 18) {
            return "Sobrepeso";
        } else if (imc > 18) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaHomem6Anos(double imc) {
        if (imc < 13.8) {
            return "Baixo peso";
        } else if (imc >= 13.8 && imc < 17.5) {
            return "Peso normal";
        } else if (imc >= 17.5 && imc <= 18.4) {
            return "Sobrepeso";
        } else if (imc > 18.4) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaHomem8Anos(double imc) {
        if (imc < 13.8) {
            return "Baixo peso";
        } else if (imc >= 13.8 && imc < 18.6) {
            return "Peso normal";
        } else if (imc >= 18.6 && imc <= 20.0) {
            return "Sobrepeso";
        } else if (imc > 20.0) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaHomem10Anos(double imc) {
        if (imc < 14.2) {
            return "Baixo peso";
        } else if (imc >= 14.2 && imc < 20.3) {
            return "Peso normal";
        } else if (imc >= 20.3 && imc <= 22) {
            return "Sobrepeso";
        } else if (imc > 22) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    // Métodos para calcular o IMC de meninas com base em diferentes idades.
    public String calcularImcCriancaMulher2Anos(double imc) {
        if (imc < 14.4) {
            return "Baixo peso";
        } else if (imc >= 14.4 && imc < 18) {
            return "Peso normal";
        } else if (imc >= 18 && imc <= 19.1) {
            return "Sobrepeso";
        } else if (imc > 19.1) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMulher4Anos(double imc) {
        if (imc < 13.8) {
            return "Baixo peso";
        } else if (imc >= 13.8 && imc < 16.8) {
            return "Peso normal";
        } else if (imc >= 16.8 && imc <= 18) {
            return "Sobrepeso";
        } else if (imc > 18) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMulher6Anos(double imc) {
        if (imc < 13.5) {
            return "Baixo peso";
        } else if (imc >= 13.5 && imc < 17.1) {
            return "Peso normal";
        } else if (imc >= 17.1 && imc <= 18.8) {
            return "Sobrepeso";
        } else if (imc > 18.8) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMulher8Anos(double imc) {
        if (imc < 13.6) {
            return "Baixo peso";
        } else if (imc >= 13.6 && imc < 18.2) {
            return "Peso normal";
        } else if (imc >= 18.2 && imc <= 20.6) {
            return "Sobrepeso";
        } else if (imc > 20.6) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMulher10Anos(double imc) {
        if (imc < 14) {
            return "Baixo peso";
        } else if (imc >= 14 && imc < 20) {
            return "Peso normal";
        } else if (imc >= 20 && imc <= 23) {
            return "Sobrepeso";
        } else if (imc > 23) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }
}
