package models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import models.Category;
import models.Tag;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
public class CreatePetRequest {
    private Integer id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;
}
