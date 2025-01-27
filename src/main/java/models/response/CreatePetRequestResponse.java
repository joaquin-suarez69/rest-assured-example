package models.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.Category;
import models.Tag;

public class CreatePetRequestResponse {

	@JsonProperty("photoUrls")
	private List<String> photoUrls;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private Category category;

	@JsonProperty("tags")
	private List<Tag> tags;

	@JsonProperty("status")
	private String status;

	public List<String> getPhotoUrls(){
		return photoUrls;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public Category getCategory(){
		return category;
	}

	public List<Tag> getTags(){
		return tags;
	}

	public String getStatus(){
		return status;
	}
}