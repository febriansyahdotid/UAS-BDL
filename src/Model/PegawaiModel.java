/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MTJP Project
 */
import java.util.ArrayList;
import Entity.*;

public class PegawaiModel implements InterfacesModel{
    private ArrayList<PegawaiEntity> DataPgw;
    
    public PegawaiModel(){
        DataPgw = new ArrayList<>();
    }
    
    public ArrayList<PegawaiEntity> getDataPgw(){
        return DataPgw;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataPgw.add((PegawaiEntity) x);
    }
    
    public void update(int index, Object x){
        DataPgw.set(index, (PegawaiEntity) x);
    }
    
    public void delete(int index){
        DataPgw.remove(index);
    }
    
    public void get_where(int index){
        DataPgw.get(index);
    }
}
