package gamerProject.dataAccess.abstracts;

import java.util.List;

import gamerProject.entity.concretes.Game;
import gamerProject.entity.concretes.Seller;

public interface SellerDao {
	void add(Seller seller);
	void update(Seller seller);
	void remove(Seller seller);
	void getGame(int sellerId);
	List<Game> getGames(int sellerId);
}
