package rhodan.nexus.endpoints;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rhodan.nexus.models.Entry;
import rhodan.nexus.repositories.EntryRepository;

@RestController
public class Endpoints {
  private final EntryRepository entryRepository;

  public Endpoints(EntryRepository entryRepository) {
    this.entryRepository = entryRepository;
  }
  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue= "World") String name) {
    return String.format("Hello you fabulous man and god %s!", name);
  }
  @GetMapping("/entry")
  public Entry getEntry() {
  
    Entry entry = null;
    if(this.entryRepository.findAll().iterator().hasNext()) {
      entry = this.entryRepository.findAll().iterator().next();
    }

    if(entry == null) { return new Entry("no Entries");}
    return entry;
    
  }
  @PostMapping("/entry")
  public void addEntry() {
    this.entryRepository.save(new Entry("test"+System.currentTimeMillis()));
  }
}
