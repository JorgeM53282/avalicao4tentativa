package com.avalia.o4tentativa.avaliacao4tentativa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.avalia.o4tentativa.avaliacao4tentativa.Entity.Carro;
import com.avalia.o4tentativa.avaliacao4tentativa.form.CarroForm;

public interface CarroRepository extends JpaRepository<Carro, Long> {

	Optional<Carro> findByNome(String nome);

	Optional<Carro> findByChassi(String chassi);

	Optional<Carro> findByCor(String cor);

	Optional<Carro> findByValor(double valor);

	void save(CarroForm carroForm);

	@Query("SELECT C FROM Carro C WHERE valor=(SELECT MAX(valor) FROM Carro)")
	List<Carro> Caro(double valor);

	@Query("SELECT C FROM Carro C WHERE valor=(SELECT MIN(valor) FROM Carro)")
	List<Carro> Barato(double valor);

}
