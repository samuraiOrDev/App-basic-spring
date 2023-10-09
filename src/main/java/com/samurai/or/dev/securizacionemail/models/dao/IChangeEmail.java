package com.samurai.or.dev.securizacionemail.models.dao;

import java.util.List;

import com.samurai.or.dev.securizacionemail.models.entities.ChangeEmail;

public interface IChangeEmail {

    public List<ChangeEmail> findAll();

    public void save(ChangeEmail changeEmail);
}
