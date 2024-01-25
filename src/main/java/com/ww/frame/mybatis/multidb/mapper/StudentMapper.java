package com.ww.frame.mybatis.multidb.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ww.frame.mybatis.multidb.entity.Student;
import com.ww.frame.mybatis.multidb.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    void insert1(Student student);
}
