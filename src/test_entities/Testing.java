package test_entities;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entity entity = new Entity(0, 0, 0, null, null, null, null, 0, 0, 0, 0);
		Entity entity2 = new Entity(0, 0, 0, null, null, null, null, 0, 0, 0, 0);
		
		List_entity listEntity = new List_entity();
		
		entity.setTitle("Entity_title");
		entity.setDescription("Entity description");
		
		entity2.setTitle("Efos");
		entity2.setDescription("Islands");
		
		listEntity.addEntityToList(entity);
		listEntity.addEntityToList(entity2);
		listEntity.showEntityList();

	}

}
