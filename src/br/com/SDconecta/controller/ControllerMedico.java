/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SDconecta.controller;
import java.util.LinkedList;
import br.com.SDconecta.model.Medico;
/**
 *
 * @author Crisanto
 */
public class ControllerMedico {
    public static LinkedList<Medico> customers = new LinkedList();

    public void saveCustomer(String name, String state, String cellphoneNumber,
            String email) {
        Medico modelRegister = new Medico(customers.size(), name, state, cellphoneNumber, email);
        customers.add(modelRegister);
    }

    public int getId() {
        return customers.size();
    }
}

