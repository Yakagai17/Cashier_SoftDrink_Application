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
public class Pelayan {
private String nama_pelayan;
private String tgl_lahir;
private String alamat;
private String jenis_kelamin;
private String no_hp;
private String no_ktp;
private String id_pelayan;
private String password;

    public Pelayan(String nama_pelayan, String tgl_lahir, String alamat, String jenis_kelamin, String no_hp, String no_ktp, String id_pelayan, String password) {
        this.nama_pelayan = nama_pelayan;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.jenis_kelamin = jenis_kelamin;
        this.no_hp = no_hp;
        this.no_ktp = no_ktp;
        this.id_pelayan = id_pelayan;
        this.password = password;
    }

    public String getNama_pelayan() {
        return nama_pelayan;
    }

    public void setNama_pelayan(String nama_pelayan) {
        this.nama_pelayan = nama_pelayan;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getId_pelayan() {
        return id_pelayan;
    }

    public void setId_pelayan(String id_pelayan) {
        this.id_pelayan = id_pelayan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
