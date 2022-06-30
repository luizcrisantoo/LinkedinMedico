package br.com.SDconecta.model;
public class ModelLogin {
    private String user;
    private String password;
    
    public ModelLogin (String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
