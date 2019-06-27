package ru.epam.javaclasses.optionaltask;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	private static final List<String> FACULTIES = Arrays.asList("Economy", "Jurisprudence", "Informatics");
	private static final List<Integer> COURSES = Arrays.asList(1, 2, 3, 4, 5);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chouse action: ");
		System.out
				.println("1 - list of students of a given faculty\n2 - lists of students for each faculty and course\n"
						+ "3 - the list of students who were born after a specified year\n4 - a list of groups");
		int userChoice = scanner.nextInt();
		switch (userChoice) {
		case (1):
			System.out.println("Enter faculty:");
			getFacultyStudents(scanner.next()).forEach(System.out::println);
			break;
		case (2):
			printFacultieStudents();
			printCourseStudents();
			break;
		case (3):
			System.out.println("Enter year:");
			getStudentsWereBornAfterSpecifiedYear(scanner.nextInt()).forEach(System.out::println);
			break;
		case (4):
			System.out.println("Enter group:");
			getGroupStudents(scanner.next()).forEach(System.out::println);
			break;
		default:
			System.out.println("Command is not found!");
			break;
		}
	}

	private static void printFacultieStudents() {
		for (String faculty : FACULTIES) {
			System.out.println(faculty + " faculty:");
			getFacultyStudents(faculty).forEach(System.out::println);
		}
	}

	private static void printCourseStudents() {
		for (int course : COURSES) {
			System.out.println("Course " + course + ":");
			Arrays.asList(getStudents()).stream().filter(s -> s.getCourse() == course).forEach(System.out::println);
		}
	}

	private static List<Student> getGroupStudents(String group) {
		return Arrays.asList(getStudents()).stream().filter(s -> s.getGroup().equalsIgnoreCase(group))
				.collect(Collectors.toList());
	}

	private static List<Student> getFacultyStudents(String faculty) {
		return Arrays.asList(getStudents()).stream().filter(s -> s.getFaculty().equalsIgnoreCase(faculty))
				.collect(Collectors.toList());
	}

	private static List<Student> getStudentsWereBornAfterSpecifiedYear(int year) {
		return Arrays.asList(getStudents()).stream().filter(s -> s.getBirthDay().getYear() > year)
				.collect(Collectors.toList());
	}

	private static Student[] getStudents() {
		Student[] students = new Student[] {
				new Student(1, "Olga", "Pyshkina", "Sergeevna", LocalDate.of(1993, 3, 22), "Svobody 65", 1234567,
						"Economy", 1, "sr111"),
				new Student(2, "Oleg", "Petrov", "Ivanovich", LocalDate.of(1992, 6, 15), "Mira 16", 766543, "Economy",
						1, "sr111"),
				new Student(3, "Petr", "Petrov", "Petrovich", LocalDate.of(1988, 11, 8), "Gorshina 6", 1234567,
						"Jurisprudence", 3, "sr333"),
				new Student(4, "Irina", "Markova", "Sergeevna", LocalDate.of(1990, 3, 20), "Gorkogo 45", 1234567,
						"Jurisprudence", 2, "sr222"),
				new Student(5, "Anna", "Nazarova", "Igorevna", LocalDate.of(1987, 1, 22), "Sretenka 7", 1234567,
						"Informatics", 4, "sr444"),
				new Student(6, "Sergey", "Mikhalkov", "Artemovich", LocalDate.of(1988, 7, 10), "Novaya 35", 766543,
						"Economy", 4, "sr444"),
				new Student(7, "Kate", "Kredysheva", "Nikolaevna", LocalDate.of(1986, 12, 3), "Moscovskaya 68", 1234567,
						"Informatics", 5, "sr555"),
				new Student(8, "Danil", "Markov", "Sergeevich", LocalDate.of(1987, 9, 19), "Lodochnaya 12", 1234567,
						"Jurisprudence", 5, "sr555") };
		return students;
	}
}
