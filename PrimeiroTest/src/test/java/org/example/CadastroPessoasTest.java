package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;


public class CadastroPessoasTest {
    CadastroPessoas cadastroPessoas;

    @BeforeClass
    public void setup() {
        cadastroPessoas = new CadastroPessoas();
    }

    @Test
    @DisplayName("Deve criar o Cadastro de pessoas.")
    public void deveCriarCadastroDePessoas() {
        //cenario e execução

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }

    @Test
    @DisplayName("Deve adicionar uma pessoa.")
    public void deveAdicionarUmaPessoa() {

        //cenario
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Donizete");

        //execução
        cadastroPessoas.adicionar(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test
    @DisplayName("Não deve adicionar uma pessoa com nome vazio.")
    public void naoDeveAdicionarPessoaComNomeVazio() {
        //cenario
        Pessoa pessoa = new Pessoa();

        //execução
        org.junit.jupiter.api.Assertions
                .assertThrows(PessoaSemNotException.class,()-> cadastroPessoas.adicionar(pessoa));
    }

    @Test
    @DisplayName("Deve remover uma pessoas.")
    public void deveRemoverUmaPessoa() {
        //cenario
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Donizete");
        cadastroPessoas.adicionar(pessoa);

        //execução
        cadastroPessoas.remover(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();



    }

    @Test
    @DisplayName("Deve lançar erro ao tentar remover pessoa Inexistente.")
    public void deveLancarErroAoTentarRemoverPessoaInexistente() {

        //cenario
        Pessoa pessoa = new Pessoa();

        //execução
        org.junit.jupiter.api.Assertions
                .assertThrows(CadastroVazioException.class,()-> cadastroPessoas.remover(pessoa));

    }

}
