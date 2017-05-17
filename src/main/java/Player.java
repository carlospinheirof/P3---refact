package main.java;

import java.awt.Image;

import javax.swing.ImageIcon;

import state.DownState;
import state.FreeDown;
import state.FreeLeft;
import state.FreeRight;
import state.FreeUp;
import state.LeftState;
import state.RightState;
import state.UpState;

public class Player {
	int x, y;
	private Image player;
	public UpState upstate = new FreeUp(); // state pattern
	public DownState downstate = new FreeDown();
	public RightState rightstate = new FreeRight();
	public LeftState leftstate = new FreeLeft();

	public Player() {
		this.player = new ImageIcon(this.getClass().getResource(
				"../resources/player.png")).getImage();
		this.x = 9;
		this.y = 9;
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public Image getPlayer() {
		return player;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// public void spellQ() {
	// }

	// public void spellW() {
	// }

	// public void spellE() {
	// }

	// public void spellR() {
	// }

	// public void spellD() {
	// }

	// public void spellF() {
	// }
}
