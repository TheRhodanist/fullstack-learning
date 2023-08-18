package rhodan.nexus.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rhodan.nexus.models.Entry;

@Repository
public interface EntryRepository extends CrudRepository<Entry,Integer>{
  
}
