package com.game.services;

import com.game.beans.ModelTicTacToe;

public interface Utilites {
	
	ModelTicTacToe modelTicTacToe = new ModelTicTacToe();
	public static void player() {
		if (modelTicTacToe.getStartString().equalsIgnoreCase("X")) {
			modelTicTacToe.setStartString("O");
		} else {
			modelTicTacToe.setStartString("X");
		}
	}

}
