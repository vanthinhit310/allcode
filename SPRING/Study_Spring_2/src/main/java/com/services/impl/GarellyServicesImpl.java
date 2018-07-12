package com.services.impl;

import com.dao.GarellyDAO;
import com.model.Hinhanh;
import com.services.GarellyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarellyServicesImpl implements GarellyServices {
    @Autowired
    GarellyDAO garellyDAO;
    @Override
    public List<Hinhanh> getAll() {
        return garellyDAO.getAll();
    }

    @Override
    public Hinhanh getOne(String stt) {
        return garellyDAO.getOne(stt);
    }

    @Override
    public boolean add_Pic(Hinhanh garelly) {
        return garellyDAO.add_Pic(garelly);
    }

    @Override
    public boolean delete_Pic(String stt) {
        return garellyDAO.delete_Pic(stt);
    }
}
