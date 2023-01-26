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

public class PegawaiController {
    public PegawaiModel pegM = new PegawaiModel();
    
    public PegawaiController(){
        
    }
    
    public ArrayList<PegawaiEntity> view(){
        return pegM.getDataPgw();
    }
    
    public void insert(String idP, String namaP, String userP, String passP, String alamatP, String noTelpP){
        PegawaiEntity pgw = new PegawaiEntity();
        pgw.setIdPgw(idP);
        pgw.setNamaPgw(namaP);
        pgw.setUserPgw(userP);
        pgw.setPassPgw(passP);
        pgw.setAlamatPgw(alamatP);
        pgw.setNoTelpPgw(noTelpP);
        pegM.insert(pgw);
    }
    
    public void update(int index, String idP, String namaP, String userP, String passP, String alamatP, String noTelpP){
        PegawaiEntity pgw = new PegawaiEntity();
        pgw.setIdPgw(idP);
        pgw.setNamaPgw(namaP);
        pgw.setUserPgw(userP);
        pgw.setPassPgw(passP);
        pgw.setAlamatPgw(alamatP);
        pgw.setNoTelpPgw(noTelpP);
        pegM.update(index, pgw);
    }
    
    public void delete(int index){
        pegM.delete(index);
    }
    
    public DefaultTableModel listpegawai(){
        DefaultTableModel dtmdaftarpegawai = new DefaultTableModel();
        Object[] kolom = {"No ID", "Nama Pegawai", "Username", "Password", "Alamat", "Nomor Telepon"};
        dtmdaftarpegawai.setColumnIdentifiers(kolom);
        
        int size = allobjcontroller.pegawai.view().size();
        for(int i=0; i<size; i++){
            Object [] data = new Object[5];
            data[0] = allobjcontroller.pegawai.view().get(i).getIdPgw();
            data[1] = allobjcontroller.pegawai.view().get(i).getNamaPgw();
            data[2] = allobjcontroller.pegawai.view().get(i).getUserPgw();
            data[3] = allobjcontroller.pegawai.view().get(i).getPassPgw();
            data[4] = allobjcontroller.pegawai.view().get(i).getAlamatPgw();
            data[4] = allobjcontroller.pegawai.view().get(i).getNoTelpPgw();
            
            dtmdaftarpegawai.addRow(data);
        }
        return dtmdaftarpegawai;
    }
    
    public int cekPegawai(String idPgw){
        int keterangan = -1;
        if(pegM.getDataPgw().size()>0){
            for(int i=0; i<pegM.getDataPgw().size(); i++){
                if(idPgw.equals(pegM.getDataPgw().get(i).getIdPgw())){
                    keterangan = i;
                    break;
                } else {
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }
    public PegawaiEntity showDaftarPegawai(int index){
        return pegM.getDataPgw().get(index);
    }
}
