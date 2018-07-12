package com.service.impl;

import com.dao.SinhVienDAO;
import com.model.SinhVien;
import com.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServices implements SinhVienService {
    @Autowired
    SinhVienDAO sinhVienDAO;

    @Override
    public List<SinhVien> getAll() {
        return sinhVienDAO.getAll();
    }

    @Override
    public SinhVien getOne(String masv) {
        return sinhVienDAO.getOne(masv);
    }

    @Override
    public boolean add_Sv(SinhVien sinhVien) {
        return false;
    }

    @Override
    public boolean update_SV(SinhVien sinhVien) {
        return false;
    }

    @Override
    public boolean delete_SV(String ma_sv) {
        return false;
    }

    @Override
    public List<SinhVien> khoang_DS(int begin, int end) {
        return getAll().subList(begin, end);
    }
}
