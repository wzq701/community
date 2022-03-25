package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author MisakaMikoto
 * @create 2022-03-22-13:25
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
