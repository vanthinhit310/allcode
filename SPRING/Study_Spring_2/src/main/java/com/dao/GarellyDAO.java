package com.dao;

import com.model.Hinhanh;

import java.util.List;

public interface GarellyDAO {
    public List<Hinhanh> getAll();
    public boolean add_Pic(Hinhanh garelly);
    public Hinhanh getOne(String stt);
    public boolean delete_Pic(String stt);
}
