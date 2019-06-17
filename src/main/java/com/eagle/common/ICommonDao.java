package com.eagle.common;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author qinlinsen
 */
public interface ICommonDao<T> {
    int deleteByPrimaryKey(Object key);

    int delete(T record);

    int insert(T record);

    int insertSelective(T record);

    boolean existsWithPrimaryKey(Object key);

    List<T> selectAll();

    T selectByPrimaryKey(Object key);

    int selectCount(T record);

    List<T> select(T record);

    T selectOne(T record);

    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);

    int deleteByExample(Object example);

    List<T> selectByExample(Object example);

    int selectCountByExample(Object example);

    T selectOneByExample(Object example);

    int updateByExample(T record, Object example);

    int updateByExampleSelective(T record, Object example);

    List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds);

    List<T> selectByRowBounds(T record, RowBounds rowBounds);
}
