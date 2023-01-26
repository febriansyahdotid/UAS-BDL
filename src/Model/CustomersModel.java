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
public class CustomersModel implements InterfacesModel {
    private ArrayList<CustomersEntity> DataCust;
    
    public CustomersModel(){
        DataCust = new ArrayList<>();
    }
    
    public ArrayList<CustomersEntity> getDataCust(){
        return DataCust;
    }
    
    @Override
    public void view(){
        
    }
    
    @Override
    public void insert(Object x){
        DataCust.add((CustomersEntity) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataCust.set(index, (CustomersEntity) x);
    }
    
    @Override
    public void delete(int index){
        DataCust.remove(index);
    }
    
    public void get_where(int index){
        DataCust.get(index);
    }
}
