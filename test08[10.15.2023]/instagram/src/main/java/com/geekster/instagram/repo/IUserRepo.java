package com.geekster.instagram.repo;

import com.geekster.instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}
