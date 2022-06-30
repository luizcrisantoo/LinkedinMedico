/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SDconecta.controller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import br.com.SDconecta.utils.Encryption;
import br.com.SDconecta.model.ModelLogin;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
public class ControllerLogin {

    Encryption encryption = new Encryption();

    public String getUserController(ModelLogin pModelLogin) {
        String user = "";

        return user;
    }

    public String getPasswordController(ModelLogin pModelLogin) {
        String password = "";

        return password;
    }

    public boolean loginCheckController(ModelLogin pModelLogin) throws FileNotFoundException, IOException {

        String user;
        String textoPuro;

        try (BufferedReader br = new BufferedReader(new FileReader("login.txt"))) {
            user = br.readLine();

            File file = new File("senha.txt");
            int len = (int) file.length();
            byte[] sendBuf = new byte[len];
            FileInputStream inFile = null;
            try {
                inFile = new FileInputStream(file);
                inFile.read(sendBuf, 0, len);
            } catch (FileNotFoundException fnfex) {
            } catch (IOException ioex) {
            }

            ObjectInputStream inputStream = null;

            // Decriptografa a Mensagem usando a Chave Privada
            inputStream = new ObjectInputStream(new FileInputStream(encryption.PATH_CHAVE_PRIVADA));
            final PrivateKey chavePrivada = (PrivateKey) inputStream.readObject();
            textoPuro = encryption.decriptografa(sendBuf, chavePrivada);

            return user.equals(pModelLogin.getUser()) && pModelLogin.getPassword().equals(textoPuro);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo de login/senha: " + e);
            return false;
        }
    }
}