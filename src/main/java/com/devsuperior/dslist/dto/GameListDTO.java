package com.devsuperior.dslist.dto;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

    private long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO (GameList entity){
    BeanUtils.copyProperties(entity, this);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
