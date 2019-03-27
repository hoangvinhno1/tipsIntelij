package test;

import java.util.ArrayList;

public class TypeMigrations {
	//type Migrations
	//alt+r -> Migrations or ctl+shift+f6


	private ArrayList<String> stringArrayList;

	public String[] getResult() {
//		stringArrayList = new ArrayList<String>();
//		stringArrayList.add("1");
//		stringArrayList.add("2");
//		stringArrayList.add("3");
		return stringArrayList.toArray(new String[stringArrayList.size()]);
	}
}
