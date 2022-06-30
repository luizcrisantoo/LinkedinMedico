/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SDconecta.controller;
import java.util.ArrayList;
import java.util.LinkedList;
import br.com.SDconecta.model.Medico;
/**
 *
 * @author Crisanto
 */
public class ControllerCustomerList {

    public int searchForNameDelete(String name, LinkedList<Medico> customers) {
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
    public ArrayList<Integer> searchForName(String name, LinkedList<Medico> customers) {
        ArrayList<Integer> nomes = new ArrayList<Integer>();
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                nomes.add(i);
            }
        }
        return nomes;
    }
    public int searchForCRM(String crm, LinkedList<Medico> customers) {
        for (int i = 0; i < customers.size(); i++) {
            if (crm.equals(customers.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
}
