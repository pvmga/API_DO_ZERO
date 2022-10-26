package br.com.api.api_do_zero.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.api_do_zero.modelo.PessoaModelo;
import br.com.api.api_do_zero.modelo.RespostaModelo;
import br.com.api.api_do_zero.servico.PessoaServico;

@RestController
@CrossOrigin(origins = "*")
public class PessoaControle {
    
    @Autowired
    private PessoaServico ps;

    @GetMapping("/listarPessoas")
    public Iterable<PessoaModelo> listar() {
        return ps.listar();
    }

    @PostMapping("/cadastrarPessoa")
    public ResponseEntity<?> cadastrarPessoa(@RequestBody PessoaModelo pm) {
        return ps.cadastarAlterarPessoa(pm, "alterar");
    }

    @PutMapping("/alterarPessoa")
    public ResponseEntity<?> alterar(@RequestBody PessoaModelo pm) {
        return ps.cadastarAlterarPessoa(pm, "alterar");

    }

    @DeleteMapping("/deletarPessoa/{codigo}")
    public ResponseEntity<RespostaModelo> deletarPessoa(@PathVariable long codigo) {
        return ps.removerPessoa(codigo);
    }

}
