package Entity;

import jakarta.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(length = 30, nullable = false)
    private String name;

    private String description;
    
    @Column(nullable = false)
    private String category;
    

	@Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;
    
    @Column(unique = true)
    private String sku;          

    private boolean active;  
    
    public Product(){
    	
    }
    
    public Product(String name, String description, String category, int quantity, double price, String sku,
			boolean active) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.sku = sku;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public String getSku() {
		return sku;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", quantity=" + quantity + ", price=" + price + ", sku=" + sku + ", active=" + active + "]";
	}

}
