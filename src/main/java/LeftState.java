package main.java;

public interface LeftState {
	LeftState toLeft(Player p, Map m);
	LeftState check(Player p, Map m);
}
