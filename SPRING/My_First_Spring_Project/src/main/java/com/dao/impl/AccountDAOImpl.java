package com.dao.impl;

import com.dao.AccountDAO;
import com.model.Account;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Account> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Account").list();
    }

    @Override
    public Account getOne(String ma) {
        return (Account) sessionFactory.getCurrentSession().get(Account.class, ma);
    }

    @Override
    public boolean addTaikhoan(Account account) {
        try {
            sessionFactory.getCurrentSession().save(account);
            return true;
        } catch (HibernateException ex) {
            return false;

        }
    }

    @Override
    public boolean delete_Taikhoan(String maTK) {
        try {
            sessionFactory.getCurrentSession().delete(getOne(maTK));
            return true;
        } catch (HibernateException e) {
            return false;

        }
    }
}
