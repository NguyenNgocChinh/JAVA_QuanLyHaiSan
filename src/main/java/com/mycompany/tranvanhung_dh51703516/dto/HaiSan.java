package com.mycompany.tranvanhung_dh51703516.dto;

import com.mycompany.tranvanhung_dh51703516.dao.LoaiHaiSanDAO;

public class HaiSan {

    private int ma;
    private String ten;
    private String xuatxu;
    private String donvitinh;
    private int tuoisong;
    private int maloai;

    public HaiSan() {
    }

    public HaiSan(int ma, String ten, String xuatxu, String donvitinh, int tuoisong, int maloai) {
        this.ma = ma;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.donvitinh = donvitinh;
        this.tuoisong = tuoisong;
        this.maloai = maloai;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public void setTuoisong(int tuoisong) {
        this.tuoisong = tuoisong;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public int getTuoisong() {
        return tuoisong;
    }

    public int getMaloai() {
        return maloai;
    }

    public String getTenLoai() {
        return LoaiHaiSanDAO.getLoaiHaiSan(maloai).getTen();
    }
}
