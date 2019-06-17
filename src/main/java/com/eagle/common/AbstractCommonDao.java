package com.eagle.common;

import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qinlinsen
 * @param <T>
 */
public class AbstractCommonDao<T> implements ICommonDao<T> {
    @Resource
    Mapper<T> mapper;

    public int deleteByPrimaryKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int delete(T record) {
        return mapper.deleteByPrimaryKey(record);
    }

    public int insert(T record) {
        return mapper.deleteByPrimaryKey(record);
    }

    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    public boolean existsWithPrimaryKey(Object key) {
        return mapper.existsWithPrimaryKey(key);
    }

    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public T selectByPrimaryKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int selectCount(T record) {
        return mapper.selectCount(record);
    }

    public List<T> select(T record) {
        return mapper.select(record);
    }

    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Object example) {
        return mapper.deleteByPrimaryKey(example);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }

    public T selectOneByExample(Object example) {
        return mapper.selectOneByExample(example);
    }

    public int updateByExample(T record, Object example) {
        return mapper.updateByExample(record, example);
    }

    public int updateByExampleSelective(T record, Object example) {
        return mapper.updateByExampleSelective(record, example);
    }

    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return mapper.selectByExampleAndRowBounds(example,rowBounds);
    }

    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        return mapper.selectByRowBounds(record,  rowBounds);
    }
}
