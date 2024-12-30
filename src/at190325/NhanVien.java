/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at190325;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String msv;
    private String hoten;
    private Long sdt;
    private int hsl;
    private int luong;
    public NhanVien() {
    }

    public NhanVien(String msv, String hoten, Long sdt, int hsl, int luong) {
        this.msv = msv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.hsl = hsl;
        this.luong = luong;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Long getSdt() {
        return sdt;
    }

    public void setSdt(Long sdt) {
        this.sdt = sdt;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }


    public int Luongthuclinh(){
        return hsl*luong;
    }
}
