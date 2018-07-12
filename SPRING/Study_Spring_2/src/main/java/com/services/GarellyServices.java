package com.services;

import com.model.Hinhanh;

import java.util.List;

public interface GarellyServices {
    public List<Hinhanh> getAll();
    public Hinhanh getOne(String stt);
    public boolean add_Pic(Hinhanh garelly);
    public boolean delete_Pic(String stt);
}
