package com.eagle.common;

import org.apache.ibatis.session.RowBounds;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qinlinsen
 * @param <T>
 */
public class AbstractCommonService<T> implements ICommonService<T> {
    @Resource
    ICommonDao dao;

    public int deleteByPrimaryKey(Object key) {
        return dao.deleteByPrimaryKey(key);
    }

    public int delete(T record) {
        return dao.deleteByPrimaryKey(record);
    }

    public int insert(T record) {
        return dao.deleteByPrimaryKey(record);
    }

    public int insertSelective(T record) {
        return dao.insertSelective(record);
    }

    public boolean existsWithPrimaryKey(Object key) {
        return dao.existsWithPrimaryKey(key);
    }

    public List<T> selectAll() {
        return dao.selectAll();
    }

    public T selectByPrimaryKey(Object key) {
        return (T) dao.selectByPrimaryKey(key);
    }

    public int selectCount(T record) {
        return dao.selectCount(record);
    }

    public List<T> select(T record) {
        return dao.select(record);
    }

    public T selectOne(T record) {
        return (T) dao.selectOne(record);
    }

    public int updateByPrimaryKey(T record) {
        return dao.updateByPrimaryKey(record);
    }

    public int updateByPrimaryKeySelective(T record) {
        return dao.updateByPrimaryKey(record);
    }

    public int deleteByExample(Object example) {
        return dao.deleteByPrimaryKey(example);
    }

    public List<T> selectByExample(Object example) {
        return dao.selectByExample(example);
    }

    public int selectCountByExample(Object example) {
        return dao.selectCountByExample(example);
    }

    public T selectOneByExample(Object example) {
        return (T) dao.selectOneByExample(example);
    }

    public int updateByExample(T record, Object example) {
        return dao.updateByExample(record, example);
    }

    public int updateByExampleSelective(T record, Object example) {
        return dao.updateByExampleSelective(record, example);
    }

    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return dao.selectByExampleAndRowBounds(example,rowBounds);
    }

    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        return dao.selectByRowBounds(record,  rowBounds);
    }
}
