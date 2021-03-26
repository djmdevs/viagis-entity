package mz.djm.via.fe.entity;

/**
 * 
 * @author Sergio
 *
 */
public abstract class BaseObject {
	
	private Long id;
	
	protected String code;
	
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
