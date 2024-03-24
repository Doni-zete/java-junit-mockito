//package org.example;
//
//import org.assertj.core.api.Assertions;
//import org.junit.Before;
//import org.junit.Test;
//
//
//public class PrimeiroTeste {
//
//    Calculadora calculadora;
//    int numero1 = 10, numero2 = 5;
//
//    @Before
//    public void setup() {
//        calculadora = new Calculadora();
//    }
//
//
//    @Test
//    public void deveSomar2Numeros() {
//        // para realize um teste cenario
//
//
//        //execução
//        int resultado = calculadora.somar(numero1, numero2);
//
//        //verificações
//        Assertions.assertThat(resultado).isEqualTo(15);
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void naoDeveSomarNumerosNegativos() {
//        //scenario
//        int numero1 = -10, numero2 = 5;
//
//        //execução
//        calculadora.somar(numero1, numero2);
//    }
//
//    @Test
//    public void deveSubtrair2Numeros() {
//        //cenario
//
//        //execução
//        int resultant = calculadora.subtrair(numero1, numero2);
//
//        //verificações
//        Assertions.assertThat(resultant).isEqualTo(5);
//    }
//
//    @Test
//    public void deveMultiplicar2Numeros() {
//
//        //scenario
//
//        //executor
//        int resultant = calculadora.multiplicar(numero1, numero2);
//
//        //verification
//        Assertions.assertThat(resultant).isEqualTo(50);
//
//    }
//
//    @Test()
//    public void deveDividir2Numeros() {
//        //cenario
//
//        //execução
//        float resultado = calculadora.dividir(numero1, numero2);
//
//        //verificação
//        Assertions.assertThat(resultado).isEqualTo(2);
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void naoDeveDividirPorZero() {
//        //cenario
//        int numero1 = 10, numero2 = 0;
//        //execução
//        calculadora.dividir(numero1, numero2);
//
//        //verificação
//
//    }
//}
//
//
//class Calculadora {
//    int somar(int numero1, int numero2) {
//        if (numero1 < 0 || numero2 < 0) {
//            throw new RuntimeException("Não é permitido somar numeros negativos");
//        }
//        return numero1 + numero2;
//    }
//
//    int subtrair(int numero1, int numero2) {
//        return numero1 - numero2;
//    }
//
//    int multiplicar(int numero1, int numero2) {
//        return numero1 * numero2;
//    }
//
//    float dividir(int numero1, int numero2) {
////        if (numero2 == 0) {
////            throw new RuntimeException("Não é permitido divisão por 0");
////        }
//        return numero1 / numero2;
//    }
//
//}