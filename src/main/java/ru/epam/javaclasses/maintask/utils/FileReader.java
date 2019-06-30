package ru.epam.javaclasses.maintask.utils;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileReader {

	public static List<String> readFile(String file) {
		URL url = FileReader.class.getClassLoader().getResource(file);
		try {
			return url == null ? Collections.emptyList()
					: Files.lines(Paths.get(url.getPath())).collect(Collectors.toList());
		} catch (UncheckedIOException | IOException e) {
			return Collections.emptyList();
		}
	}
}
