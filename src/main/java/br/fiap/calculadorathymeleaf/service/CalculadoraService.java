package br.fiap.calculadorathymeleaf.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public double calcular(int n1, int n2, String operacao){
        return switch (operacao){
            case "somar" -> n1 + n2;
            case "subtrair" -> n1 - n2;
            case "multiplicar" -> n1 * n2;
            case "dividir" -> dividir(n1,n2);
            default -> throw new IllegalArgumentException("Operação Inválida");
        };
    }

    private double dividir(int n1, int n2) {
        if (n2 == 0){
            throw new IllegalArgumentException("Nunca dividirás por zero");
        }
        return (double) n1 / n2;
    }
}
