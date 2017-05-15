package main.java;

public interface RightState {
	RightState toRight(Player p, Map m);
	RightState check(Player p, Map m);
}
