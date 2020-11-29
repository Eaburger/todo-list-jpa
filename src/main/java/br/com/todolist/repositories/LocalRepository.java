package br.com.todolist.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.todolist.model.Local;


public class LocalRepository implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private EntityManager entityManager;
	
	public List<Local> listaTudo(){
		
		return entityManager.createQuery("from local",Local.class).getResultList();
	

}
	
}
