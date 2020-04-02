package com.github.mayconmoraesdm.entidades;

import com.github.mayconmoraesdm.persistencia.Persiste;

import java.sql.SQLException;

public abstract class Entidade implements Persiste {

    public abstract Contato busca(String nome) throws SQLException;
}
