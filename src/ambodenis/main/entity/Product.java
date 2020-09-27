package ambodenis.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Entity
@Table
public class Product {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	@Size(min = 3, max = 20, message = "min 3, max 20 characters")
	private String name;
	@Column
	@Size(min = 10, max = 120, message = "min 10, max 120 characters")
	private String description;
	@Column
	@Size(max = 120, message = "max 120 characters")
	private String image;
	@Column
	private double price;
	@Column
	private boolean isOnMainPage;
	@Column
	private boolean isOnMenu;
	@Valid
	@JoinColumn(name = "idrecipe")
	@OneToOne(cascade = CascadeType.ALL)
	private Recipe recipe;
	
	@JoinColumn(name = "idcategory")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Category category;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name = "product_tag", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_tag"))
	private List<Tag> tags;
	
	public Product() {
	}
	
	public Product(String name, String description, String image, double price, Recipe recipe) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.recipe = recipe;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public boolean getIsOnMainPage() {
		return isOnMainPage;
	}

	public void setIsOnMainPage(boolean isOnMainPage) {
		this.isOnMainPage = isOnMainPage;
	}

	public boolean getIsOnMenu() {
		return isOnMenu;
	}

	public void setIsOnMenu(boolean isOnMenu) {
		this.isOnMenu = isOnMenu;
	}

	@Override
	public String toString() {
		return "("+id+") - "+name;
	}
	

}
