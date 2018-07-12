package com.dao.impl;

import com.dao.SinhVienDAO;
import com.model.SinhVien;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class SinhVienDAOImpl implements SinhVienDAO {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<SinhVien> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from SinhVien").list();
    }

    @Override
    public SinhVien getOne(String masv) {
        return (SinhVien) sessionFactory.getCurrentSession().get(SinhVien.class,masv);
    }

    @Override
    public boolean add_Sv(SinhVien sinhVien) {
        try {
            sessionFactory.getCurrentSession().save(sinhVien);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean update_SV(SinhVien sinhVien) {
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(sinhVien);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean delete_SV(String ma_sv) {
        try {
            sessionFactory.getCurrentSession().delete(getOne(ma_sv));
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }
}
