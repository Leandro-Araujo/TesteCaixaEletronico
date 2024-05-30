package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CaixaEletronicoTest {
    @Test
    void deveSomaContas(){
        Banco banco = new Banco(1000, 2000);
        CaixaEletronico caixaEletronico = new CaixaEletronico(banco);

        Assertions.assertEquals(3000, caixaEletronico.someContas());
    }

    @Test
    public void deveSomarContasMetodosMockados(){
        //Banco banco = new Banco(1000, 2000);
        Banco banco = Mockito.spy(Banco.class);
        Mockito.when(banco.getSaldoContaCorrente()).thenReturn(500.0);
        Mockito.when(banco.getSaldoPoupanca()).thenReturn(1000.0);
        CaixaEletronico caixaEletronico = new CaixaEletronico(banco);
        Assertions.assertEquals(1500, caixaEletronico.someContas());
    }

    @Test
    public void deveSomarContasApenas1MetodoMockado(){
        Banco banco = Mockito.spy(Banco.class);
        Mockito.when(banco.getSaldoContaCorrente()).thenReturn(500.0);

        CaixaEletronico caixaEletronico = new CaixaEletronico(banco);
        Assertions.assertEquals(2500, caixaEletronico.someContas());
    }
}
