package gamerProject;

import java.rmi.RemoteException;

import gamerProject.adapters.MernisServiceAdapter;
import gamerProject.busieness.abstracts.GameService;
import gamerProject.busieness.concretes.GameManager;
import gamerProject.dataAccess.concretes.OracleGamerDao;
import gamerProject.dataAccess.concretes.SqlCampanyDao;
import gamerProject.dataAccess.concretes.SqlSellerDao;
import gamerProject.dataAccess.concretes.SqlGameDao;
import gamerProject.entity.concretes.Campany;
import gamerProject.entity.concretes.Game;
import gamerProject.entity.concretes.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Gamer gamer = new Gamer();
		
		Campany campany = new Campany();
		Game game = new Game();
		
		GameService gameManager = new GameManager(new SqlCampanyDao(), new OracleGamerDao(),new SqlSellerDao(),new SqlGameDao(),new MernisServiceAdapter());
		gameManager.addGame(game, gamer);
		gameManager.sellGame(game, gamer, campany);

	}

}
