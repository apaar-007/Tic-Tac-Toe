package com.game.services;

import com.game.beans.ModelTicTacToe;

public class Utilities {
 static ModelTicTacToe modelTicTacToe = new ModelTicTacToe();
	public static void player() {
		// TODO Auto-generated method stub
		if (modelTicTacToe.getStartString().equalsIgnoreCase("X")) {
			modelTicTacToe.setStartString("O");
		} else {
			modelTicTacToe.setStartString("X");
		}
	}
}
