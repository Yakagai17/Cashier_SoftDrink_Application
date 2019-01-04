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
public class Bahan_Minuman extends Barang{
private String ref_kode_minuman;
private String merk_bahan;
private int stok;

    public Bahan_Minuman(String ref_kode_minuman, String merk_bahan, int stok, String nama, String kode) {
        super(nama, kode);
        this.ref_kode_minuman = ref_kode_minuman;
        this.merk_bahan = merk_bahan;
        this.stok = stok;
    }

    public String getRef_kode_minuman() {
        return ref_kode_minuman;
    }

    public void setRef_kode_minuman(String ref_kode_minuman) {
        this.ref_kode_minuman = ref_kode_minuman;
    }

    public String getMerk_bahan() {
        return merk_bahan;
    }

    public void setMerk_bahan(String merk_bahan) {
        this.merk_bahan = merk_bahan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


}
