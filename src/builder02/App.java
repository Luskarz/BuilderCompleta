/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import modelo.Paciente;

/**
 *
 * @author wolley
 */
public class App {
    
    public static void main(String[] args) {
        
        Paciente paciente = PacienteBuilder.novoPacienteBuilder()
                .comNome("Jose da Silva")
                .nascidoEm("12/02/1970")
                .doSexo('M')
                .comCPF("333.333.333-33")
                .comRG("25025125-x")
                .comtipoSanguineo("O-")
                .comPeso(62.50)
                .comAltura(1.70)
                .comCep("08717-520")
                .comLogradouro("Rua Jose manoel Antonio")
                .comNumero(563)
                .comCidade("Mogi das Cruzes")
                .comUf("SP")
                .constroi();
        
        System.out.println(paciente);
        
    }
    
}
