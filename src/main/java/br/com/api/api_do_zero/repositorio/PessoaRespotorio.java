package br.com.api.api_do_zero.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.api_do_zero.modelo.PessoaModelo;

@Repository
public interface PessoaRespotorio extends CrudRepository<PessoaModelo, Long> {
    
}
