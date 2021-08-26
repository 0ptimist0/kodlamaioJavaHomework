package gamerProject.busieness.abstracts;

import java.rmi.RemoteException;

import gamerProject.entity.abstracts.User;
import gamerProject.entity.concretes.Campany;
import gamerProject.entity.concretes.Game;
import gamerProject.entity.concretes.Gamer;

public interface GameService {
	void sellGame(Game game, Gamer gamer, Campany campany) throws NumberFormatException, RemoteException;
	void addGame(Game game,User user) throws NumberFormatException, RemoteException;

}
