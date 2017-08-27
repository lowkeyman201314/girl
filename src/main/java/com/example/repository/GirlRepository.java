package com.example.repository;

import com.example.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 文件描述:
 * Created with IntelliJ IDEA.
 * 创建者: sean
 * 创建时间: 2017/8/27 1:57
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //根据年龄查询
    public List<Girl> findByAge(Integer age);
}
