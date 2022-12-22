package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.entities.Role;
import com.devsuperior.movieflix.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
