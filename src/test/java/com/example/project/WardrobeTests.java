/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WardrobeTests {
	Wardrobe w;

	@BeforeEach
	void setUp() {
		w = new Wardrobe();
	}

	@Test
	void returnTypeIsArray() {
		assertTrue(w.getCombos() instanceof ArrayList);
	}

	@Test
	void exactFitsWall() {
		for (int i : w.elementCombos) {
			assertEquals(250, i);
		}
	}

	@Test
	void addingMinusOneIsAnError() {
		assertThrows(Wardrobe.InvalidComboException.class,
		() -> {
			w.addCombo(-1);
		},
		"Wardrobe.InvalidComboException was expected"
		);
	}
}