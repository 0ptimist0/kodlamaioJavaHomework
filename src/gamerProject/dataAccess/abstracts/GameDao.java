package gamerProject.dataAccess.abstracts;

import java.util.List;

import gamerProject.entity.concretes.Campany;
import gamerProject.entity.concretes.Game;
import gamerProject.entity.concretes.Gamer;

public interface GameDao {
	void add(Game game);
	void update(Game game);
	void remove(Game game);
	void sellGame(Game game, Gamer gamer, Campany campany);
	void getGame(int gameId);
	List<Game> getAllGames(int gameId);

}
