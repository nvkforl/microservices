package com.jpa.tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"local","dev"})
class JpaLearningApplicationTests {

	@Test
	void contextLoads() {
	}
}
