package com.goldsgym.golds_gym.repositories;

import com.goldsgym.golds_gym.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE gym_id = ?", nativeQuery = true)
    List<User> getByGym(int gymId);
}
