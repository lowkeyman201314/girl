package com.example.service;

import com.example.domain.Girl;
import com.example.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 文件描述:
 * Created with IntelliJ IDEA.
 * 创建者: sean
 * 创建时间: 2017/8/27 2:40
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("S");
        girlA.setAge(19);
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setCupSize("A");
        girlB.setAge(28);
        girlRepository.save(girlB);
    }
}
