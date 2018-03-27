/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author Ajie
 */
public class aksimotor {
    public static void main(String[] args){
       Motor revo = new Motor();
       Motor klx = new Motor();
       Motor ninja = new Motor();
       
       revo.tahun_pembuatan= 2007;
       revo.warna="hitam";
       revo.shock="yss";
       revo.merk_ban="fdr";
       revo.kapasitas_tangki=3.1;
       
       klx.tahun_pembuatan= 2008;
       klx.warna="merah";
       klx.shock="ohlins";
       klx.merk_ban="irc";
       klx.kapasitas_tangki= 7.7;
       
       ninja.tahun_pembuatan= 1983;
       ninja.warna="hijau";
       ninja.shock="ride it";
       ninja.merk_ban="zeneos";
       ninja.kapasitas_tangki= 17;
       
       revo.mengisi_bensin();
       klx.mengisi_bensin();
       ninja.mengisi_bensin();
    }
}
