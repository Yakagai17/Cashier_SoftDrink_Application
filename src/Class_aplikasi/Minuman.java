/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_aplikasi;

/**
 *
 * @author Aganinggar
 */
public class Minuman extends Barang{
private String jenis_minuman;
private double harga_minuman;

    public Minuman(String jenis_minuman, int harga_minuman, String nama, String kode) {
        super(nama, kode);
        this.jenis_minuman = jenis_minuman;
        this.harga_minuman = harga_minuman;
    }

    public String getJenis_minuman() {
        return jenis_minuman;
    }

    public void setJenis_minuman(String jenis_minuman) {
        this.jenis_minuman = jenis_minuman;
    }

    public double getHarga_minuman() {
        return harga_minuman;
    }

    public void setHarga_minuman(double harga_minuman) {
        this.harga_minuman = harga_minuman;
    }

}
