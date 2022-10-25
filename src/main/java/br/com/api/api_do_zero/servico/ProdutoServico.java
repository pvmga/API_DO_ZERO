package br.com.api.api_do_zero.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.api_do_zero.modelo.ProdutoModelo;
import br.com.api.api_do_zero.modelo.RespostaModelo;
import br.com.api.api_do_zero.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
    @Autowired
    private ProdutoRepositorio pr;

    @Autowired
    private RespostaModelo rm;

    // Método para cadastrar ou alterar produtos
    public ResponseEntity<?> cadastrarAlterar(ProdutoModelo pm, String acao) {
        if (acao.equals("cadastrar")) {
            return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.OK);
        }
    }
    
    
}
