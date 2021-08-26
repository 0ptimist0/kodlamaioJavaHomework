package gamerProject.busieness.concretes;

import java.rmi.RemoteException;

import gamerProject.busieness.abstracts.CheckGamerService;
import gamerProject.busieness.abstracts.GameService;
import gamerProject.dataAccess.abstracts.CampanyDao;
import gamerProject.dataAccess.abstracts.GameDao;
import gamerProject.dataAccess.abstracts.GamerDao;
import gamerProject.dataAccess.abstracts.SellerDao;
import gamerProject.entity.abstracts.User;
import gamerProject.entity.concretes.Campany;
import gamerProject.entity.concretes.Game;
import gamerProject.entity.concretes.Gamer;

public class GameManager implements GameService {
	CampanyDao campanyDao;
	GamerDao gamerDao;
	SellerDao sellerDao;
	CheckGamerService checkGamerService;
	GameDao gameDao;

	public GameManager(CampanyDao campanyDao, GamerDao gamerDao, SellerDao sqlSellerDao,GameDao gameDao,
			CheckGamerService checkGamerService) {
		this.campanyDao = campanyDao;
		this.gamerDao = gamerDao;
		this.sellerDao = sqlSellerDao;
		this.checkGamerService = checkGamerService;
		this.gameDao = gameDao;
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campany campany) throws NumberFormatException, RemoteException {
		if (checkGamerService.checkIfRealPerson(gamer)) {
			gameDao.sellGame(game, gamer, campany);
		}
		else System.out.println("Not valid a person! "+gamer.getFirstName());

	}

	@Override
	public void addGame(Game game, User user) throws NumberFormatException, RemoteException {
		if (checkGamerService.checkIfRealPerson(user)) {
			gameDao.add(game);
		}
		else System.out.println("Not valid a person! "+user.getFirstName());
	}
}



















