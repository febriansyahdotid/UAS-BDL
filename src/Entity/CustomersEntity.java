/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author april
 */
public class CustomersEntity {
    String idPemesan;
    String namaPemesan;
    String alamatPemesan;
    String noTelpPemesan;
    
    public CustomersEntity(){
        
    }
    
    public CustomersEntity(String idPemesan, String namaPemesan, String alamatPemesan, String noTelpPemesan){
        this.idPemesan = idPemesan;
        this.namaPemesan = namaPemesan;
        this.alamatPemesan = alamatPemesan;
        this.noTelpPemesan = noTelpPemesan;
    }

    public String getIdPemesan() {
        return idPemesan;
    }

    public void setIdPemesan(String idPemesan) {
        this.idPemesan = idPemesan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getAlamatPemesan() {
        return alamatPemesan;
    }

    public void setAlamatPemesan(String alamatPemesan) {
        this.alamatPemesan = alamatPemesan;
    }

    public String getNoTelpPemesan() {
        return noTelpPemesan;
    }

    public void setNoTelpPemesan(String noTelpPemesan) {
        this.noTelpPemesan = noTelpPemesan;
    }
    
}
