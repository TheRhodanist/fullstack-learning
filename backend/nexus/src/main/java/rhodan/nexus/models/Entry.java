package rhodan.nexus.models;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "entries")
public class Entry {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String message;
  public Entry(String message) {
    this.message = message;
  }
  public String getMessage() {
    return this.message;
  }
  
}
