//created by riva & rafi
package omg;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.MongoClient;
//import Controller.*;
//import Entity.*;
//import Model.*;
//import View.*;
//import java.util.ArrayList;
//import java.util.Scanner;

public class Transaksi {
//    //public static ArrayList<PegawaiEntity> pegawai = new ArrayList<>();
//    public static PegawaiEntity peg = new PegawaiEntity();
//    public static CustomersEntity cust = new CustomersEntity();
//    public static MenuEntity mn = new MenuEntity();
//    public static Scanner in = new Scanner(System.in);
//    public static String pil;
//
//    public static void main(String[] args) {
//        CustomersGUI display = new CustomersGUI();
//        //PegawaiGUI display = new PegawaiGUI();
//        
//        Transaksi g = new Transaksi();
//        
//        g.menu();
//        
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//        
//        DB database = mongoClient.getDB("warung");
//
//        // print existing databases
//        mongoClient.getDatabaseNames().forEach(System.out::println);
//
//        database.createCollection("customers", null);;
//        database.createCollection("pegawai", null);
//        database.createCollection("menu", null);
//        database.createCollection("detailtrx", null);
//        database.createCollection("transaksi", null);
//
//        // print all collections in customers database
//        database.getCollectionNames().forEach(System.out::println);
//        
//        //new object of BasicDBObjct
//        BasicDBObject document = new BasicDBObject();
//        BasicDBObject document1 = new BasicDBObject();
//        BasicDBObject document2 = new BasicDBObject();
//        BasicDBObject document3 = new BasicDBObject();
//        BasicDBObject document4 = new BasicDBObject();
//
//        // create data in costumers
//        DBCollection collection = database.getCollection("customers");
//        document.put("idPemesan", cust.getIdPemesan());
//        document.put("namaPemesan", cust.getNamaPemesan());
//        document.put("alamatPemesan", cust.getAlamatPemesan());
//        document.put("noTelpPemesan", cust.getNoTelpPemesan());
//        collection.insert(document);
//        
//        //create data in employee
//        DBCollection collection1 = database.getCollection("pegawai");
//        document1.put("idPegawai", peg.getIdPgw());
//        document1.put("namaPegawai", peg.getNamaPgw());
//        document1.put("userPegawai", peg.getUserPgw());
//        document1.put("passPegawai", peg.getPassPgw());
//        document1.put("alamatPegawai", peg.getAlamatPgw());
//        document1.put("noTelpPegawai", peg.getNoTelpPgw());
//        //pegawai.add(peg);
//        collection1.insert(document);
//        
//        //create data in menu
//        DBCollection collection2 = database.getCollection("menu");
//        document2.put("inputMakanan", mn.getNamaMakanan());
//        document2.put("inputMinuman", mn.getNamaMinuman());
//        collection2.insert(document2);
//        
//        //create data in detail-transaksi
//        DBCollection collection4 = database.getCollection("detailtrx");
//        document4.put("total", args)
//        
//        //create data in transaksi
//        DBCollection collection3 = database.getCollection("transaksi");
//        document3.put("namaPemesan", cust.getNamaPemesan());
//        document3.put("inputMakanan", mn.getNamaMakanan());
//        document3.put("qty", mn.getQty());
//        document3.put("inputMinuman", mn.getNamaMinuman());
//        document3.put("qty", mn.getQtyy());
//        document3.put("totalHarga", mn.getTotalHarga());
//        collection3.insert(document3);
//        
//    }
//    
////    void auth(){
////        System.out.println(" == REGISTRASI == ");
////        System.out.println(" Id     : ");
////        String id = in.nextLine();
////        peg.setIdPgw(id);
////        System.out.println(" Nama   : ");
////        String nama = in.nextLine();
////        peg.setNamaPgw(nama);
////        System.out.println(" User   : ");
////        String user = in.nextLine();
////        peg.setUserPgw(user);
////        System.out.println(" Pass   : ");
////        String pass = in.nextLine();
////        peg.setPassPgw(pass);
////        System.out.println(" Alamat : ");
////        String alamat = in.nextLine();
////        peg.setAlamatPgw(alamat);
////        System.out.println(" NoTelp : ");
////        String notelp = in.nextLine();
////        peg.setNoTelpPgw(notelp);
////        
////    }
//    
//    
//    void menu(){
//        //WarungITB data = new WarungITB();
//        System.out.println("___________________________________");
//        System.out.println("|                                 |");
//        System.out.println("| WAITEBE MAKANAN SERBA RP 15.000 |");
//        System.out.println("|_________________________________|");
//        System.out.println("| - - - -  M a k a n a n  - - - - |");
//        System.out.println("| [] Pepes Tongkol Semayi         |");
//        System.out.println("| [] Pepes Tongkol Merah          |");
//        System.out.println("| [] Pepes Tahu                   |");
//        System.out.println("| [] Ikan Bawal Bakar             |\n");
//        
//        System.out.println("| - - - -  M i n u m a n  - - - - |");
//        System.out.println("| [] Air Mineral        - Rp 3000 |");
//        System.out.println("| [] Es Teh             - Rp 3000 |");
//        System.out.println("| [] Es Jeruk           - Rp 3000 |");
//        System.out.println("|_________________________________|");
//        
//        
//        System.out.println("___________________________________");
//        System.out.println("[          INPUT PESANAN          ]");
//        System.out.print(" Nama Kasir       : ");
//        String namaK = in.nextLine();
//        peg.setNamaPgw(namaK);
//        System.out.print(" Nama Pemesan     : ");
//        String nama = in.nextLine();
//        cust.setNamaPemesan(nama);
//        System.out.print(" Alamat Pemesan   : ");
//        String alamat = in.nextLine();
//        cust.setAlamatPemesan(alamat);
//        System.out.print(" NoTelp Pemesan   : ");
//        String no = in.nextLine();
//        cust.setNoTelpPemesan(no);
//        System.out.println("\n");
//        System.out.println("___________________________________");
//        System.out.println("[            INPUT MENU            ]");
//        System.out.print(" Makanan          : ");
//        String makan = in.nextLine();
//        mn.setNamaMakanan(makan);
//        System.out.print(" Qty              : ");
//        String qtyMak = in.nextLine();
//        mn.setQty(qtyMak);
//        System.out.print(" Minuman          : ");
//        String minum = in.nextLine();
//        mn.setNamaMinuman(minum);
//        System.out.print(" Qty              : ");
//        String qtyMin = in.nextLine();
//        mn.setQtyy(qtyMin);
//        
//        //convert string ke double
//        double x = Double.valueOf(qtyMak);
//        double y = Double.valueOf(qtyMin);
//        
//        double hrg1 = 15000.00 * x;
//        double hrg2 = 3000.00 * y;
//        
//        double hrgx = hrg1 + hrg2;
//        String t = String.valueOf(hrgx);
//        mn.setTotalHarga(t);
//        
//        System.out.print(" Harga Total      : Rp " + mn.getTotalHarga() );
//        System.out.println("\n\n");
//        
//    }
}