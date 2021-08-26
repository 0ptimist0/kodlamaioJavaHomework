package gamerProject.dataAccess.abstracts;

import java.util.List;

import gamerProject.entity.concretes.Campany;

public interface CampanyDao {
	void add(Campany campany);
	void update(Campany campany);
	void remove(Campany campany);
	void getCampany(int campanyId);
	List<Campany> getAllCampanies(int campanyId);

}
