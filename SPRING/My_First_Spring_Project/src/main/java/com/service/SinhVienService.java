package com.service;

import com.model.SinhVien;

import java.util.List;

public interface SinhVienService {
    public List<SinhVien> getAll();
    public SinhVien getOne(String masv);
    public boolean add_Sv(SinhVien sinhVien);
    public boolean update_SV(SinhVien sinhVien);
    public boolean delete_SV(String ma_sv);
    public List<SinhVien> khoang_DS(int begin , int end);
}
