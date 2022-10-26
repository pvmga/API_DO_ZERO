package br.com.api.api_do_zero.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.api_do_zero.modelo.PessoaModelo;
import br.com.api.api_do_zero.modelo.RespostaModelo;
import br.com.api.api_do_zero.repositorio.PessoaRespotorio;

@Service
public class PessoaServico {
    
    @Autowired
    private PessoaRespotorio pr;

    @Autowired
    private RespostaModelo rm;

    public Iterable<PessoaModelo> listar() {
        return pr.findAll();
    }

     // Método para cadastrar ou alterar produtos
    public ResponseEntity<?> cadastarAlterarPessoa(PessoaModelo pm, String acao) {     
        if (acao.equals("cadastrar")) {
            return new ResponseEntity<PessoaModelo>(pr.save(pm), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<PessoaModelo>(pr.save(pm), HttpStatus.OK);
        }
    }

    // Método para remover produtos
    public ResponseEntity<RespostaModelo> removerPessoa(long codigo){
        pr.deleteById(codigo);
        
        rm.setMensagem("Pessoa removida com sucesso!");
        return new ResponseEntity<RespostaModelo>(rm, HttpStatus.OK);
    }
}
