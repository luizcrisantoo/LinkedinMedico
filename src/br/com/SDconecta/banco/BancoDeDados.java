/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SDconecta.banco;
import java.util.List;
import java.util.ArrayList;
import br.com.SDconecta.model.Medico;
/**
 *
 * @author Crisanto
 */


    public class BancoDeDados {

	private static List<Medico> medicos;
	
	static {
            medicos = new ArrayList<Medico>();
	}
			
	public static List<Medico> getMedicos(){
            return medicos;
	}
	
}

