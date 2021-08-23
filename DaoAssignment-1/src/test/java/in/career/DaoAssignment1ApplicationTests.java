package in.career;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.dao.PhoneBookDao;
import in.career.entity.PhoneBook;

@SpringBootTest
class DaoAssignment1ApplicationTests {
	
	@Autowired
	private PhoneBookDao dao;

	@Test
	public void testSavePhoneBook()
	{
		PhoneBook phonebook = new PhoneBook(4L,"POOJA", "poojas@gmail.com", 1234567);
		 dao.save(phonebook);
	}	
		@Test
       public void testFindById()
     {
           	long id = 2L;
    	    Optional<PhoneBook> FindById =dao.findById(id);
    	    System.out.println(FindById.get());
      }
  
		@Test
		 public void testFindAll()
		 {
			Iterable<PhoneBook> FindAll= dao.findAll();
    	    System.out.println(FindAll);

		 }
		 
		@Test
		public void testDeleteById()
		{
			long id = 4L;
			dao.deleteById(id);
		}
		}


