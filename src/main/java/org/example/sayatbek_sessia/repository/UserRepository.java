package org.example.sayatbek_sessia.repository;

import org.example.sayatbek_sessia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
