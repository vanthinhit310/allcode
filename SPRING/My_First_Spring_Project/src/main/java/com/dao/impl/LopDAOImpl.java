package com.dao.impl;

import com.dao.LopDAO;
import com.model.Lop;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class LopDAOImpl implements LopDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Lop> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Lop").list();
    }

    @Override
    public Lop getOne(String ma_lop) {
        return (Lop) sessionFactory.getCurrentSession().get(Lop.class, ma_lop);
    }

    @Override
    public boolean add_Lop(Lop lop) {
        try {
            sessionFactory.getCurrentSession().save(lop);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean update_Lop(Lop lop) {
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(lop);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }
    @Override
    public boolean delete_Lop(String ma_lop1) {
        try {
            sessionFactory.getCurrentSession().delete(getOne(ma_lop1));
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }
}
