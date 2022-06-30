/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SDconecta.model;

public class Medico {
    private int id;
    private String name;
    private String crm;
    private String email;
    private String state;
    private String cellphoneNumber;
public Medico(int id, String name, String state,String cellphoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.crm = crm;
        this.cellphoneNumber = cellphoneNumber;
        this.email = email;
    }
    
    public Medico(){}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @return the cellphoneNumber
     */
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String cep) {
        this.crm = crm;
    }

    /**
     * @param cellphoneNumber the cellphoneNumber to set
     */
    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
