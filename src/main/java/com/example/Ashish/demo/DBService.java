package com.example.Ashish.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
//    @Autowired
//    DB data;
    //Or instead of using autowired
    private DB data;
    public DBService(DB data)
    {
        this.data=data;
    }

    String getData(){
        return data.getData();
    }

}
