package com.dao;

import com.model.Lop;

import java.util.List;

public interface LopDAO {
    public List<Lop> getAll();
    public Lop getOne(String ma_lop);
    public boolean add_Lop(Lop lop);
    public boolean update_Lop(Lop lop);
    public boolean delete_Lop(String ma_lop1);
}
