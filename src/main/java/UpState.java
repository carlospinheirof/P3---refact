package main.java;

public interface UpState {
	UpState toUp(Player p, Map m);
	UpState check(Player p, Map m);
}
