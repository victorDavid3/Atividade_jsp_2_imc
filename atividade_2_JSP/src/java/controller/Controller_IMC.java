/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Model_IMC;

/**
 *
 * @author victo
 */
public class Controller_IMC {
    
    Model_IMC d = new Model_IMC();
    
   //cálculo 
    public float calculo(float peso, float altura){   
    float imc = 0;
   
    
   imc = (peso/(altura*altura));
    
   d.setIMC(imc); 
   
   
     return imc;
    }
    
   //comparação de IMC 
    public String comparacaodeIMC(float imcC){
   
   String resposta = ""; 
   
   if(imcC<16){
       resposta = "Magreza grave";
   } else if(imcC<17){
       resposta = "Magreza moderada";
   }else if(imcC<18.5){
       resposta = "Magreza leve";
   } else if(imcC<25){
       resposta = "Saudável";
   }else if(imcC<30){
       resposta = "Sobrepeso";
   }else if(imcC<35){
       resposta = "Obesidade Grau I";
   }else if(imcC<40){
       resposta = "Obesidade Grau II (severa)";
   }else{
       resposta = "Obesidade Grau III (mórbida)";
   }
   
    d.setResp(resposta);
    
        return resposta;
    
    }
    
}
