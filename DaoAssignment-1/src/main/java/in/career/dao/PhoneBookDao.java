package in.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.PhoneBook;

public interface PhoneBookDao extends JpaRepository<PhoneBook, Long>{
	
	

}
