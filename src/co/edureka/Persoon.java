package co.edureka;

import java.beans.ConstructorProperties;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Persoon implements Comparable<Persoon> {
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;

	@ConstructorProperties({"id",""})
	public Persoon(int id, String name, double salary, LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	@Override
	public int compareTo(Persoon o) {
		int result = this.joiningDate.compareTo(o.joiningDate);
		return result;
	}

	@Override
	public String toString() {
		return "Persoon{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				", joiningDate=" + joiningDate + '\n' +
				'}';
	}
}

class RunIT {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "A");
		map.put(3, "G");
		map.put(7, "A");
		map.put(53, "B");
		map.put(17, "B");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		List<Map.Entry<Integer, String>> list = new ArrayList<>(set);
		Collections.sort(list, new comparatorValue());
		System.out.println("By Value " + list);
		Collections.sort(list, new comparatorKey());
		System.out.println("By Key" + list);
		Collections.sort(list, new comparatorKeyValue());
		System.out.println("By Value and Key" + list);
	}
}

class comparatorValue implements Comparator<Map.Entry<Integer, String>> {
	@Override
	public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
		if (o1.getValue().compareTo(o2.getValue()) < 0) {
			return -1;
		} else if (o1.getValue().compareTo(o2.getValue()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}

class comparatorKey implements Comparator<Map.Entry<Integer, String>> {
	@Override
	public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
		if ((o1.getKey() - o2.getKey()) < 0) {
			return -1;
		} else {
			return 1;
		}
	}
}

class comparatorKeyValue implements Comparator<Map.Entry<Integer, String>> {
	@Override
	public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
		if (o1.getValue().compareTo(o2.getValue()) < 0) {
			return -1;
		} else if (o1.getValue().compareTo(o2.getValue()) > 0) {
			return 1;
		} else {
			if ((o1.getKey() - o2.getKey()) < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}




