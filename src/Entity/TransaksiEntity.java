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
public class TransaksiEntity {
    String idTrx;
    String total;
    boolean status;
    
    public TransaksiEntity(){
        
    }
    
    public TransaksiEntity(String idTrx, String total, boolean status){
        this.idTrx = idTrx;
        this.total = total;
        this.status = status;
    }

    public String getIdTrx() {
        return idTrx;
    }

    public void setIdTrx(String idTrx) {
        this.idTrx = idTrx;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
