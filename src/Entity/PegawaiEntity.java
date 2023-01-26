/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author MTJP Project
 */
public class PegawaiEntity {
    String idPgw;
    String namaPgw;
    String userPgw;
    String passPgw;
    String alamatPgw;
    String noTelpPgw;
    
    public PegawaiEntity(){
        
    }
    
    public PegawaiEntity(String idPgw, String namaPgw, String userPgw, String passPgw, String alamatPgw, String noTelpPgw){
        this.idPgw = idPgw;
        this.namaPgw = namaPgw;
        this.userPgw = userPgw;
        this.passPgw = passPgw;
        this.alamatPgw = alamatPgw;
        this.noTelpPgw = noTelpPgw;
    }

    public String getIdPgw() {
        return idPgw;
    }

    public void setIdPgw(String idPgw) {
        this.idPgw = idPgw;
    }

    public String getNamaPgw() {
        return namaPgw;
    }

    public void setNamaPgw(String namaPgw) {
        this.namaPgw = namaPgw;
    }

    public String getUserPgw() {
        return userPgw;
    }

    public void setUserPgw(String userPgw) {
        this.userPgw = userPgw;
    }

    public String getPassPgw() {
        return passPgw;
    }

    public void setPassPgw(String passPgw) {
        this.passPgw = passPgw;
    }

    public String getAlamatPgw() {
        return alamatPgw;
    }

    public void setAlamatPgw(String alamatPgw) {
        this.alamatPgw = alamatPgw;
    }

    public String getNoTelpPgw() {
        return noTelpPgw;
    }

    public void setNoTelpPgw(String noTelpPgw) {
        this.noTelpPgw = noTelpPgw;
    }
    
}
