package com.generation.lojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojaDeGames.Model.Categoria;



public interface CategoriaRepository  extends JpaRepository<Categoria,Long>{

	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);//@param busca com like

}
