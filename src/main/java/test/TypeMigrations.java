package test;

import java.util.ArrayList;

public class TypeMigrations {
	//type Migrations
	//alt+r -> Migrations or ctl+shift+f6


	private ArrayList<String> stringArrayList;

	public String[] getResult() {
		return stringArrayList.toArray(new String[stringArrayList.size()]);
	}
}
