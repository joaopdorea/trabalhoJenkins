package test;
import org.junit.Assert;
import org.junit.Test;


import control.Calculadora;

public class CalculadoraTeste {

    @Test
    public void testeSomar(){
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.somar(2.0, 3.0), 0.1);
    }

    @Test
    public void testeSubtrair(){
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.subtrair(8.0, 3.0), 0.1);
    }

    @Test
    public void testeMultiplicar(){
        Calculadora calc = new Calculadora();
        Assert.assertEquals(15.0, calc.multiplicar(5.0, 3.0), 0.1);
    }

    @Test
    public void testeDividir(){
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.dividir(15.0, 3.0), 0.1);
    }
}
