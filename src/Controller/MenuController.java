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

public class MenuController {
    public MenuModel menuM = new MenuModel();
    
    public MenuController(){
        
    }
    
    public ArrayList<MenuEntity> view(){
        return menuM.getDataMenu;
    }
    
    public void insert(String id, String makan, String harga, String qty1, String minum, String hargaa, String qty2, String total){
        MenuEntity menu = new MenuEntity();
        menu.setIdMenu(id);
        menu.setNamaMakanan(makan);
        menu.setHargaMakanan(harga);
        menu.setQty(qty1);
        menu.setNamaMinuman(minum);
        menu.setHargaMinuman(hargaa);
        menu.setQtyy(qty2);
        menu.setTotalHarga(total);
        menuM.insert(menu);
    }
    
    public void update(int index, String id, String makan, String harga, String qty1, String minum, String hargaa, String qty2, String total){
        MenuEntity menu = new MenuEntity();
        menu.setIdMenu(id);
        menu.setNamaMakanan(makan);
        menu.setHargaMakanan(harga);
        menu.setQty(qty1);
        menu.setNamaMinuman(minum);
        menu.setHargaMinuman(hargaa);
        menu.setQtyy(qty2);
        menu.setTotalHarga(total);
        menuM.update(index, menu);
    }
    
    public void delete(int index){
        menuM.delete(index);
    }
    
    public DefaultTableModel listmenu(){
        DefaultTableModel dtmlistmenu = new DefaultTableModel();
        Object[] kolom ={"ID Menu", "Nama Makanan", "Harga Makanan", "Qty Makanan", "Nama Minuman", "Harga Minuman", "Qty Minuman", "Total Harga"};
        dtmlistmenu.setColumnIdentifiers(kolom);
        
        int size = allobjcontroller.menu.view().size();
        for (int i=0; i<size; i++){
            Object [] menu = new Object[10];
            menu[0] = allobjcontroller.menu.view().get(i).getIdMenu();
            menu[1] = allobjcontroller.menu.view().get(i).getNamaMakanan();
            menu[2] = allobjcontroller.menu.view().get(i).getHargaMakanan();
            menu[3] = allobjcontroller.menu.view().get(i).getQty();
            menu[4] = allobjcontroller.menu.view().get(i).getNamaMinuman();
            menu[5] = allobjcontroller.menu.view().get(i).getHargaMinuman();
            menu[6] = allobjcontroller.menu.view().get(i).getQtyy();
            menu[7] = allobjcontroller.menu.view().get(i).getTotalHarga();
            dtmlistmenu.addRow(menu);
        }
        return dtmlistmenu;
    }
    
//    public int cekMenu(String idMenu){
//        int keterangan = -1;
//        if(menuM.getDataMenu().size()>0){
//            for(int i=0;i<menuM.getDataMenu().size();i++){
//             if(idMenu.equals(menuM.getDataMenu().get(i).getIdMenu())){
//                 keterangan = i;
//                 break;
//             }else{
//                 keterangan = -1;
//             }
//            }
//        }
//        return keterangan;
//    }
    
    public MenuEntity showDaftarMenu(int index){
        return menuM.getDataMenu().get(index);
    }
}
