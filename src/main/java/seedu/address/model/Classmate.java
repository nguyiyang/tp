package seedu.address.model;

import static java.util.Objects.requireNonNull;

import java.util.List;

import javafx.collections.ObservableList;
import seedu.address.model.student.Student;
import seedu.address.model.student.UniqueStudentList;
import seedu.address.model.tutorialclass.TutorialClass;
import seedu.address.model.tutorialclass.UniqueTutorialClassList;
import seedu.address.model.tutorialgroup.TutorialGroup;
import seedu.address.model.tutorialgroup.UniqueTutorialGroupList;

/**
 * Wraps all data at the address-book level
 * Duplicates are not allowed (by .isSameStudent comparison)
 */
public class Classmate implements ReadOnlyClassmate {

    private final UniqueStudentList students;
    private final UniqueTutorialClassList tutorialClasses;
    private final UniqueTutorialGroupList tutorialGroups;

    /*
     * The 'unusual' code block below is a non-static initialization block, sometimes used to avoid duplication
     * between constructors. See https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
     *
     * Note that non-static init blocks are not recommended to use. There are other ways to avoid duplication
     *   among constructors.
     */
    {
        students = new UniqueStudentList();
        tutorialClasses = new UniqueTutorialClassList();
        tutorialGroups = new UniqueTutorialGroupList();
    }

    public Classmate() {}

    /**
     * Creates an Classmate using the Students in the {@code toBeCopied}
     */
    public Classmate(ReadOnlyClassmate toBeCopied) {
        this();
        resetData(toBeCopied);
    }

    //// list overwrite operations

    /**
     * Replaces the contents of the student list with {@code students}.
     * {@code students} must not contain duplicate students.
     */
    public void setStudents(List<Student> students) {
        this.students.setStudents(students);
    }

    /**
     * Replaces the contents of the tutorial class list with {@code tutorialClasses}.
     * {@code tutorialClasses} must not contain duplicate students.
     */
    public void setTutorialClasses(List<TutorialClass> tutorialClasses) {
        this.tutorialClasses.setTutorialClasses(tutorialClasses);
    }

    /**
     * Resets the existing data of this {@code Classmate} with {@code newData}.
     */
    public void resetData(ReadOnlyClassmate newData) {
        requireNonNull(newData);

        setStudents(newData.getStudentList());
        setTutorialClasses(newData.getTutorialClassList());
    }

    //// student-level operations

    /**
     * Returns true if a student with the same identity as {@code student} exists in the ClassMATE.
     */
    public boolean hasStudent(Student student) {
        requireNonNull(student);
        return students.contains(student);
    }

    /**
     * Adds a student to the ClassMATE.
     * The student must not already exist in the ClassMATE.
     */
    public void addStudent(Student p) {
        students.add(p);
    }

    /**
     * Replaces the given student {@code target} in the list with {@code editedStudent}.
     * {@code target} must exist in the ClassMATE.
     * The student identity of {@code editedStudent} must not be the same as another existing student in ClassMATE.
     */
    public void setStudent(Student target, Student editedStudent) {
        requireNonNull(editedStudent);

        students.setStudent(target, editedStudent);
    }

    /**
     * Removes {@code key} from this {@code Classmate}.
     * {@code key} must exist in the ClassMATE.
     */
    public void removeStudent(Student key) {
        students.remove(key);
    }

    //// tutorialclass-level operations

    /**
<<<<<<< HEAD:src/main/java/seedu/address/model/Classmate.java
     * Returns true if a student with the same identity as {@code student} exists in the ClassMATE.
=======
     * Returns true if a tutorialClass with the same identity as {@code tutorialClass} exists in the address book.
>>>>>>> branch-ClassCode-Yirui:src/main/java/seedu/address/model/AddressBook.java
     */
    public boolean hasTutorialClass(TutorialClass tutorialClass) {
        requireNonNull(tutorialClass);
        return tutorialClasses.contains(tutorialClass);
    }

    /**
<<<<<<< HEAD:src/main/java/seedu/address/model/Classmate.java
     * Adds a student to the ClassMATE.
     * The student must not already exist in the ClassMATE.
=======
     * Adds a tutorialClass to the address book.
     * The tutorialClass must not already exist in the address book.
>>>>>>> branch-ClassCode-Yirui:src/main/java/seedu/address/model/AddressBook.java
     */
    public void addTutorialClass(TutorialClass c) {
        tutorialClasses.add(c);
    }

    /**
<<<<<<< HEAD:src/main/java/seedu/address/model/Classmate.java
     * Replaces the given student {@code target} in the list with {@code editedStudent}.
     * {@code target} must exist in the ClassMATE.
     * The student identity of {@code editedStudent} must not be the same as another existing student in ClassMATE.
=======
     * Replaces the given tutorialClass {@code target} in the list with {@code editedTutorialClass}.
     * {@code target} must exist in the address book.
     * The tutorialClass identity of {@code editedTutorialClass} must not be the same
     * as another existing tutorialClass in ClassMATE.
>>>>>>> branch-ClassCode-Yirui:src/main/java/seedu/address/model/AddressBook.java
     */
    public void setTutorialClass(TutorialClass target, TutorialClass editedTutorialClass) {
        requireNonNull(editedTutorialClass);

        tutorialClasses.setTutorialClass(target, editedTutorialClass);
    }

    /**
     * Removes {@code key} from this {@code Classmate}.
     * {@code key} must exist in the ClassMATE.
     */
    public void removeTutorialClass(TutorialClass key) {
        tutorialClasses.remove(key);
    }

    /**
     * Returns true if a student with the same identity as {@code student} exists in the ClassMATE.
     */
    public boolean hasTutorialGroup(TutorialGroup tutorialGroup) {
        requireNonNull(tutorialGroup);
        return tutorialGroups.contains(tutorialGroup);
    }

    /**
     * Adds a student to the ClassMATE.
     * The student must not already exist in the ClassMATE.
     */
    public void addTutorialGroup(TutorialGroup tutorialGroup) {
        tutorialGroups.add(tutorialGroup);
    }

    /**
     * Replaces the given student {@code target} in the list with {@code editedStudent}.
     * {@code target} must exist in the ClassMATE.
     * The student identity of {@code editedStudent} must not be the same as another existing student in ClassMATE.
     */
    public void setTutorialGroup(TutorialGroup target, TutorialGroup editedTutorialGroup) {
        requireNonNull(editedTutorialGroup);

        tutorialGroups.setTutorialGroup(target, editedTutorialGroup);
    }

    /**
     * Removes {@code key} from this {@code Classmate}.
     * {@code key} must exist in the ClassMATE.
     */
    public void removeTutorialGroup(TutorialGroup key) {
        tutorialGroups.remove(key);
    }

    //// util methods

    @Override
    public String toString() {
        return students.asUnmodifiableObservableList().size() + " students";
        // TODO: refine later
    }

    @Override
    public ObservableList<Student> getStudentList() {
        return students.asUnmodifiableObservableList();
    }

    @Override
    public ObservableList<TutorialClass> getTutorialClassList() {
        return tutorialClasses.asUnmodifiableObservableList();
    }

    @Override
    public ObservableList<TutorialGroup> getTutorialGroupList() {
        return tutorialGroups.asUnmodifiableObservableList();
    }


    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Classmate // instanceof handles nulls
                && students.equals(((Classmate) other).students));
    }

    @Override
    public int hashCode() {
        return students.hashCode();
    }
}