package com.example.demo;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {
	@Test
	public void testMono() {
		
		Mono<String> mstring = Mono.just("Abc xyz")
									.log();
		
		mstring.subscribe((System.out::println),(e)->System.out.println(e.getMessage()));
	}
	
	@Test
	public void testFlux() {
		
		Flux<String> fstring = Flux.just("Abc"," xyz")
									.concatWithValues("pqr")
									.log();
		
		fstring.subscribe((System.out::println),(e)->System.out.println(e.getMessage()));
	}

}
