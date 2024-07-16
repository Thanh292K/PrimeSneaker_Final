/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prime.main_model;

/**
 *
 * @author tt
 */
public class Model_SneakerDetail {
    private int maSPCT;
    private String tenSP;
    private double giaSP;
    private int soLuong;
    private String danhMuc;
    private String hang;
    private String mauSac;
    private String chatLieu;
    private double kichCo;
    private String deGiay;
    private String trangThai;

    public Model_SneakerDetail() {
    }

    public Model_SneakerDetail(int maSPCT, String tenSP, double giaSP, int soLuong, String danhMuc, String hang, String mauSac, String chatLieu, double kichCo, String deGiay, String trangThai) {
        this.maSPCT = maSPCT;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
        this.hang = hang;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichCo = kichCo;
        this.deGiay = deGiay;
        this.trangThai = trangThai;
    }

    public int getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(int maSPCT) {
        this.maSPCT = maSPCT;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public double getKichCo() {
        return kichCo;
    }

    public void setKichCo(double kichCo) {
        this.kichCo = kichCo;
    }

    public String getDeGiay() {
        return deGiay;
    }

    public void setDeGiay(String deGiay) {
        this.deGiay = deGiay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Model_SneakerDetail{" + "maSPCT=" + maSPCT + ", tenSP=" + tenSP + ", giaSP=" + giaSP + ", soLuong=" + soLuong + ", danhMuc=" + danhMuc + ", hang=" + hang + ", mauSac=" + mauSac + ", chatLieu=" + chatLieu + ", kichCo=" + kichCo + ", deGiay=" + deGiay + ", trangThai=" + trangThai + '}';
    }
    
   
}
