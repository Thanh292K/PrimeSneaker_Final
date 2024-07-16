/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prime.main_model;


public class Model_Sneaker {
    private int id_Sneaker;
    private String ten_SP;
    private String danhMuc;
    private int soLuong;
    private String trangThai;

    public Model_Sneaker(int id_Sneaker, String ten_SP, String danhMuc, int soLuong, String trangThai) {
        this.id_Sneaker = id_Sneaker;
        this.ten_SP = ten_SP;
        this.danhMuc = danhMuc;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public Model_Sneaker() {
    }

    public Model_Sneaker(String ten_SP) {
        this.ten_SP = ten_SP;
    }
    
    public int getId_Sneaker() {
        return id_Sneaker;
    }

    public void setId_Sneaker(int id_Sneaker) {
        this.id_Sneaker = id_Sneaker;
    }

    public String getTen_SP() {
        return ten_SP;
    }

    public void setTen_SP(String ten_SP) {
        this.ten_SP = ten_SP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        if (trangThai == null){
            return "Hết hàng";
        }
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    @Override
    public String toString() {
        return "Model_Sneaker{" + "id_Sneaker=" + id_Sneaker + ", ten_SP=" + ten_SP + ", danhMuc=" + danhMuc + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
    
}
