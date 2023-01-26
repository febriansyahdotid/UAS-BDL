/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.*;
import Model.*;
import View.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MTJP Project
 */
public class CustomersController {
    public CustomersModel custmod = new CustomersModel();
    
    public CustomersController(){
        
    }
    
    public ArrayList<CustomersEntity> view(){
        return custmod.getDataCust();
    }
    
    public void insert(String id, String namaCust, String alamatCust, String noTelpCust){
        CustomersEntity cust = new CustomersEntity();
        cust.setIdPemesan(id);
        cust.setNamaPemesan(namaCust);
        cust.setAlamatPemesan(alamatCust);
        cust.setNoTelpPemesan(noTelpCust);
        custmod.insert(cust);
    }
    
    public void update(int index, String id, String namaCust, String alamatCust, String noTelpCust){
        CustomersEntity cust = new CustomersEntity();
        cust.setIdPemesan(id);
        cust.setNamaPemesan(namaCust);
        cust.setAlamatPemesan(alamatCust);
        cust.setNoTelpPemesan(noTelpCust);
        custmod.update(index, cust);
    }
    
    public void delete(int index){
         custmod.delete(index);
    }
    
//    public DefaultTableModel listcustomers(){
//        DefaultTableModel dtmdaftarcustomers = new DefaultTableModel();
//        Object[] kolom = {"No ID", "Nama Pemesan", "Alamat Pemesan", "No Telepon"};
//        dtmdaftarcustomers.setColumnIdentifiers(kolom);
//        
//        int size = allobjcontroller.customer.view().size();
//        for (int i=0; i<size; i++){
//            Object [] data = new Object[5];
//            data[0] = allobjcontroller.customer.view().get(i).getIdPemesan();
//            data[1] = allobjcontroller.customer.view().get(i).getNamaPemesan();
//            data[2] = allobjcontroller.customer.view().get(i).getAlamatPemesan();
//            data[3] = allobjcontroller.customer.view().get(i).getNoTelpPemesan();
//            
//            dtmdaftarcustomers.addRow(data);
//        }
//        return dtmdaftarcustomers;
//    }
    
    public int cekCustomers(String idPsn){
        int keterangan = -1;
        if(custmod.getDataCust().size()>0){
            for(int i=0; i<custmod.getDataCust().size(); i++){
                if(idPsn.equals(custmod.getDataCust().get(i).getIdPemesan())){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }
    public CustomersEntity showDaftarCustomers(int index){
        return custmod.getDataCust().get(index);
    }
}
