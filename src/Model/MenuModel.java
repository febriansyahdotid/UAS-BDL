/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.*;
import java.util.ArrayList;

public class MenuModel implements InterfacesModel{
    private ArrayList<MenuEntity> DataMenu;
    public ArrayList<MenuEntity> getDataMenu;
    
    public MenuModel(){
        DataMenu = new ArrayList<>();
    }
    
    public ArrayList<MenuEntity> getDataMenu(){
        return DataMenu;
    }
    
    @Override
    public void view(){
        
    }
    
    @Override
    public void insert(Object x){
        DataMenu.add((MenuEntity) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataMenu.set(index, (MenuEntity) x);
        
    }
    
    @Override
    public void delete(int index){
        DataMenu.remove(index);
    }
    
    public void get_where(int index){
        DataMenu.get(index);
    }
}
