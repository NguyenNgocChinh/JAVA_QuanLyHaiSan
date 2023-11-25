package com.mycompany.tranvanhung_dh51703516.dto;

public class LoaiHaiSan {

    private int ma;
    private String ten;

    public LoaiHaiSan() {
    }

    public LoaiHaiSan(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ma + " - " + ten;
    }

}
