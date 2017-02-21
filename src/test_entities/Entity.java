package test_entities;

import java.util.GregorianCalendar;

public class Entity {
	
	private int id;
	private int entity_type;
	private int entity_status;
	private String title;
	private String description;
	private GregorianCalendar start_date;
	private GregorianCalendar end_date;
	private int responsable_member_id;
	private int entity_priority;
	private int parent_enity_id;
	private int type_id;
	
	
	
	public Entity(int id, int entity_type, int entity_status, String title, String description,
			GregorianCalendar start_date, GregorianCalendar end_date, int responsable_member_id, int entity_priority,
			int parent_enity_id, int type_id) {
		super();
		this.id = id;
		this.entity_type = entity_type;
		this.entity_status = entity_status;
		this.title = title;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.responsable_member_id = responsable_member_id;
		this.entity_priority = entity_priority;
		this.parent_enity_id = parent_enity_id;
		this.type_id = type_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(int entity_type) {
		this.entity_type = entity_type;
	}
	public int getEntity_status() {
		return entity_status;
	}
	public void setEntity_status(int entity_status) {
		this.entity_status = entity_status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GregorianCalendar getStart_date() {
		return start_date;
	}
	public void setStart_date(GregorianCalendar start_date) {
		this.start_date = start_date;
	}
	public GregorianCalendar getEnd_date() {
		return end_date;
	}
	public void setEnd_date(GregorianCalendar end_date) {
		this.end_date = end_date;
	}
	public int getResponsable_member_id() {
		return responsable_member_id;
	}
	public void setResponsable_member_id(int responsable_member_id) {
		this.responsable_member_id = responsable_member_id;
	}
	public int getEntity_priority() {
		return entity_priority;
	}
	public void setEntity_priority(int entity_priority) {
		this.entity_priority = entity_priority;
	}
	public int getParent_enity_id() {
		return parent_enity_id;
	}
	public void setParent_enity_id(int parent_enity_id) {
		this.parent_enity_id = parent_enity_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	@Override
	public String toString() {
		return "Entity [title=" + title + ", description=" + description + "]";
	}	
	
	
}
