package miniproject;

import java.util.List;

public interface PhoneBookDao {
	public List<PhonebookVO> getlist();
	public String insert(PhonebookVO vo);
	public String delete(PhonebookVO vo);
}
