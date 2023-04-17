package com.entornos.AlvaroRomero.MisArrays.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.entornos.AlvaroRomero.MisArrays.MisArrays;

class MisTest {
	int arra [] = new int [] {25,25,25,25};

	@Test
	void testMedia() {
		double res1 = MisArrays.calcularMedia(arra);
		double resultadoEsperado1 = 25;
		
		assertEquals(resultadoEsperado1, res1);
	}

}
