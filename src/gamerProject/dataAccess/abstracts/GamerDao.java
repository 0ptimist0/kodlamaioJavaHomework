package gamerProject.dataAccess.abstracts;

import java.util.List;

import gamerProject.entity.concretes.Game;
import gamerProject.entity.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void remove(Gamer gamer);
	void getGame(int gamerId);
	List<Game> getGames(int gamerId);
	

}
