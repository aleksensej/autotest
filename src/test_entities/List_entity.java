package test_entities;

import java.util.ArrayList;
import java.util.List;

public class List_entity {
	
	private List<Entity> entity_list = new ArrayList<Entity>();
	
	public List_entity () {
		setEntity_list(new ArrayList<Entity>());
	}

	public List<Entity> getEntity_list() {
		return entity_list;
	}

	public void setEntity_list(List<Entity> entity_list) {
		this.entity_list = entity_list;
	}
	
	public boolean addEntityToList (Entity entity) {
		entity_list.add(entity);
		return false;
	}
	
	public void showEntityList () {
		
		for(int i = 0; i< entity_list.size(); i++){
			String text = entity_list.get(i).toString();
			System.out.println(text);
		}
	} 

}
