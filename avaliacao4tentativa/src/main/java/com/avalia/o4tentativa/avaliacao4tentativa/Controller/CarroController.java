package com.avalia.o4tentativa.avaliacao4tentativa.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.avalia.o4tentativa.avaliacao4tentativa.DTO.CarroDto;
import com.avalia.o4tentativa.avaliacao4tentativa.Entity.Carro;
import com.avalia.o4tentativa.avaliacao4tentativa.repository.CarroRepository;

@RestController
public class CarroController {

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping("/Listar")
	public List<Carro> lista() {
		return carroRepository.findAll();
	}

	@PostMapping("/criar")
	@Transactional
	public ResponseEntity<CarroDto> cadastrar(@RequestParam String chassi, @RequestParam String nome,
			@RequestParam String cor, @RequestParam double valor, UriComponentsBuilder builder) {

		Carro carro = new Carro(chassi, nome, cor, valor);
		carroRepository.save(carro);

		URI uri = builder.path("/carros/{id}").buildAndExpand(carro.getId()).toUri();

		return ResponseEntity.created(uri).body(new CarroDto(carro));
	}

	@GetMapping(params = "nome")
	public ResponseEntity<CarroDto> buscaNome(@RequestParam String nome) {
		Optional<Carro> carro = carroRepository.findByNome(nome);
		if (carro.isPresent()) {
			return ResponseEntity.ok(new CarroDto(carro.get()));
		}
		return ResponseEntity.notFound().build();

	}

	@GetMapping(params = "chassi")
	public ResponseEntity<CarroDto> buscaChassi(@RequestParam String chassi) {
		Optional<Carro> carro = carroRepository.findByChassi(chassi);
		if (carro.isPresent()) {
			return ResponseEntity.ok(new CarroDto(carro.get()));
		}
		return ResponseEntity.notFound().build();

	}

	@GetMapping(params = "cor")
	public ResponseEntity<CarroDto> buscaCor(@RequestParam String cor) {
		Optional<Carro> carro = carroRepository.findByCor(cor);
		if (carro.isPresent()) {
			return ResponseEntity.ok(new CarroDto(carro.get()));
		}
		return ResponseEntity.notFound().build();

	}

	@GetMapping(params = "valor")
	public ResponseEntity<CarroDto> buscaValor(@RequestParam double valor) {
		Optional<Carro> carro = carroRepository.findByValor(valor);
		if (carro.isPresent()) {
			return ResponseEntity.ok(new CarroDto(carro.get()));
		}
		return ResponseEntity.notFound().build();

	}

	@GetMapping(params = "caro")
	public List<Carro> caro(@RequestParam double valor) {
		return carroRepository.Caro(valor);
	}

	@GetMapping(params = "barato")
	public List<Carro> barato(@RequestParam double valor) {
		return carroRepository.Barato(valor);
	}

}
