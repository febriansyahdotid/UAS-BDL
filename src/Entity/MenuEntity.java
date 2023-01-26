/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import omg.Transaksi;
/**
 *
 * @author april
 */
public class MenuEntity {
    String idMenu;
    String namaMakanan, hargaMakanan;
    String namaMinuman, hargaMinuman;
    String qty, qtyy, totalHarga;
    
    public MenuEntity(){
        
    }
    
    public MenuEntity(String idMenu, String namaMakanan, String hargaMakanan, String namaMinuman, String hargaMinuman, String qty, String qtyy, String totalHarga){
        this.idMenu = idMenu;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.namaMinuman = namaMinuman;
        this.hargaMakanan = hargaMakanan;
        this.qty = qty;
        this.qtyy = qtyy;
        this.totalHarga = totalHarga;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }
    
    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public String getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(String hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
    
    public String getQtyy() {
        return qty;
    }

    public void setQtyy(String qtyy) {
        this.qtyy = qtyy;
    }
    
}
