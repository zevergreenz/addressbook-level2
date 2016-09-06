package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	public Person person;
	public Tag tag;
	public String action;
	
	public Tagging(Person person, Tag tag, String action) {
		this.person = person;
		this.tag = tag;
		this.action = action;
	}
}
