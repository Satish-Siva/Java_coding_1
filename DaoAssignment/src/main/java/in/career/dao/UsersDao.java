package in.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Users;

public interface UsersDao extends JpaRepository<Users, Long> {

}
