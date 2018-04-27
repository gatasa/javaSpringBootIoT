package es.alfa.centauri.SpringBootIoT.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
public User findByName(String name);
public void deleteByName(String name);
}
