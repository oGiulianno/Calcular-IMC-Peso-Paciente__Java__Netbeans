/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Giu
 */
public class Paciente {
    
    //Atributos
    private String nome;
    private float peso = 0;
    private float altura = 0;
    
    //Metodos

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) throws Exception {
        if ( peso <= 0 ) throw new Exception("Peso não pode ser < 0");
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) throws Exception {
        if ( altura <= 0 ) throw new Exception("Altura não pode ser < 0");
        this.altura = altura;
    }
    
    //Calculos
    public float calcularIMC() {
    float valor = (float) (peso / Math.pow(altura,2));
    return valor;
    }
        
}
    
    
    

