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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wardrobe {
	public static class InvalidComboException extends RuntimeException {
        public InvalidComboException(String message) {
            super(message);
        }
    }

	public ArrayList<Integer> elementCombos = new ArrayList<>(Arrays.asList(250, 250, 250));
	public ArrayList<Integer> elementSizes = new ArrayList<>(Arrays.asList(50, 75, 100, 120));

	public ArrayList<Integer> getCombos() {
		return elementCombos;
	}

	public void addCombo(int num) {
		if (num != 250) {
			throw new InvalidComboException("Combo must be 250");
		}
		elementCombos.add(num);
	}
}
