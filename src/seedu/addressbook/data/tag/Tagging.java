package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    public enum TagOperation { ADD, DELETE }

    private Person person;
    private Tag tag;
    private TagOperation operation;

    public Tagging(Person person, Tag tag, TagOperation operation) {

        this.person = person;
        this.tag = tag;
        this.operation = operation;

    }

    public Person getPerson() {
        return person;
    }

    public Tag getTag() {
        return tag;
    }

    public TagOperation getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        String output = (operation == TagOperation.ADD)? "+" : "-";

        return output + " " + person.getName() + " " + tag.toString();
    }
}
