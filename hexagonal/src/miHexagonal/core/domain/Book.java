package miHexagonal.core.domain;

public class Book {
	
	public Book() {
		
	}
	private Long id;
	private String name;
	public Book(Long id2, String name2) {
		id=id2;
		name=name2;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
