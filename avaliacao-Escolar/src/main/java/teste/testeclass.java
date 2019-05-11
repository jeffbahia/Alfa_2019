/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import br.com.gilmar.Avaliacao;
import br.com.gilmar.ValoresInvalidosException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jeferson
 */
public class testeclass {

    private Avaliacao avaliacao;
    @Before
    public  void Setup(){
        avaliacao = new Avaliacao();
    }
    
    @Test
    /**
    public void TestNotaMenorZero(){
        try{
            String resultado = avaliacao.avalia(-7.0, 6.0, 5);
        }catch(Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException );
        }
    
}*/
    
        
    public void TestNotaMaiordez(){
        try{
            String resultado = avaliacao.avalia(4.0, 5.0, 15, 96);
            System.out.print(resultado);
            Assert.assertTrue(resultado.equals("Prova Extra."));
        }catch(Exception e){    
           // Assert.assertTrue(e instanceof ValoresInvalidosException );
           e.printStackTrace();
  
        }
    
}
}
