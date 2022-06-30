/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SDconecta.controller;

/**
 *
 * @author Crisanto
 */
public class ControllerEdit {
    public void saveEdit(int i, String name, String state, String crm,
            String cellphoneNumber,String email) {
        ControllerMedico.customers.get(i).setName(name);
        ControllerMedico.customers.get(i).setState(state);
        ControllerMedico.customers.get(i).setCrm(crm);
        ControllerMedico.customers.get(i).setCellphoneNumber(cellphoneNumber);
        ControllerMedico.customers.get(i).setEmail(email);


    }

}

