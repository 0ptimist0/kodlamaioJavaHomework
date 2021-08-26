package gamerProject.entity.concretes;

import gamerProject.entity.abstracts.Entity;
import gamerProject.entity.abstracts.User;

public class Gamer extends User implements Entity {
	private String nickName;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
