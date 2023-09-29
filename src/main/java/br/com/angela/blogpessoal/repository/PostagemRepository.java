package br.com.angela.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.angela.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}
