/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Entity.*;

/**
 *
 * @author MTJP Project
 */
public class TransaksiModel implements InterfacesModel {
    private ArrayList<TransaksiEntity> DataTrx;
    
    public TransaksiModel(){
        DataTrx = new ArrayList<>();
    }
    
    public ArrayList<TransaksiEntity> getDataTrx(){
        return DataTrx;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataTrx.add((TransaksiEntity) x);
    }
    
    public void update(int index, Object x){
        DataTrx.set(index, (TransaksiEntity) x);
    }
    
    public void delete(int index){
        DataTrx.remove(index);
    }
    
    public void get_where(int index){
        DataTrx.get(index);
    }
}
