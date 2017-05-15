package main.java;

public interface DownState {
	DownState toDown(Player p, Map m);
	DownState check(Player p, Map m);
}
