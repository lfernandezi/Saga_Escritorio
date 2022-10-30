/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author LUIS
 */
public class Usuario {
    private String xcodigo;
    private String xemail;
    private String xpassword;

    public Usuario() {
    }

    public Usuario(String xcodigo, String xemail, String xpassword) {
        this.xcodigo = xcodigo;
        this.xemail = xemail;
        this.xpassword = xpassword;
    }

    public String getXcodigo() {
        return xcodigo;
    }

    public void setXcodigo(String xcodigo) {
        this.xcodigo = xcodigo;
    }

    public String getXemail() {
        return xemail;
    }

    public void setXemail(String xemail) {
        this.xemail = xemail;
    }

    public String getXpassword() {
        return xpassword;
    }

    public void setXpassword(String xpassword) {
        this.xpassword = xpassword;
    }
    
}
