package com.dao.impl;

import com.dao.GarellyDAO;
import com.model.Hinhanh;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Repository
@Transactional
public class GarellyImpl implements GarellyDAO {

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Hinhanh> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Hinhanh").list();
    }
    @Override
    public Hinhanh getOne(String stt) {
        return (Hinhanh) sessionFactory.getCurrentSession().get(Hinhanh.class,stt);
    }

    @Override
    public boolean add_Pic(Hinhanh garelly) {
        try {
            sessionFactory.getCurrentSession().save(garelly);
            return true;

        }catch (HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean delete_Pic(String stt) {
        try{
            sessionFactory.getCurrentSession().delete(getOne(stt));
            return true;
        }catch (HibernateException e) {
            return false;
        }
    }
}
