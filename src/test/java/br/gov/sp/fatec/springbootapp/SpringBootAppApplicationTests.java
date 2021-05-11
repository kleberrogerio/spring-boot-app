package br.gov.sp.fatec.springbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootAppApplicationTests {

    @Autowired
    private UsuarioRepository usuarioRepo;

	@Test
	void contextLoads() {
	}

    @Test
    void testaInsercao(){

    }

}
