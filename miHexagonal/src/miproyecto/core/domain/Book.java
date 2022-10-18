package miproyecto.core.domain;

public class Book {
	private Long id;
    private String name;
    
    public Long getid() {
    	return id;
    }
    
    public void setid(Long id) {
    	this.id=id;
    }
    
    public String getname() {
    	return name;
    }
    
    public void setid(String name) {
    	this.name=name;
    }

	public Book(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
