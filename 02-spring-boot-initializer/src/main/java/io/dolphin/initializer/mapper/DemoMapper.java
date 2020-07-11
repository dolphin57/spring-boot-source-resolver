package io.dolphin.initializer.mapper;


import io.dolphin.initializer.bean.Demo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}