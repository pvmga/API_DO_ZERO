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

    private int estoqueMin;

    public int getEstoqueMin() {
        return estoqueMin;
    }
    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    // Método listar
    public Iterable<ProdutoModelo> listar() {
        return pr.findAll();
    }
    
    // Método para cadastrar ou alterar produtos
    public ResponseEntity<?> cadastrarAlterar(ProdutoModelo pm, String acao) {

        if (pm.getDescricao().equals("")) {
            rm.setMensagem("O nome do produto é obrigatório");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);

        } else if (pm.getEstoque().equals("")) {
            setEstoqueMin(1);
            rm.setMensagem("Não pode ser vazio. Ideal que seja maior ou igual a " + getEstoqueMin());
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);

        } else if (acao.equals("cadastrar")) {
            return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.OK);
        }
    }

    // Método remover produtos
    public ResponseEntity<RespostaModelo> remover(Long codigo) {
        pr.deleteById(codigo);

        rm.setMensagem("O produto foi removido com sucesso");
        return new ResponseEntity<RespostaModelo>(rm, HttpStatus.OK);
    }
    
}
