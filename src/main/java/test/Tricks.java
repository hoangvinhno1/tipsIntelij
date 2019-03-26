package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tricks {

	//multi select alt+ctrl+shift+j or alt+j find same word
	//multi select handle alt+shift + double click
	//Selecting Containing Declarations  Ctrl+Shift+[ or ]
	//multi point alt + pull down mouse or alt+shift+ click
	//Shrink and Extend Selection ctrl+w or ctrl+shift+w
	//Toggling between line and column selection modes Shift+Alt+Insert

	//add,remove and duplicate new line shift+enter, ctrl+y, ctrl+d
	//move selection shift+alt+up or down
	String data1 = "text1";
	String data2 = "text2";
	String data3 = "text3";
	String data4 = "text4";
	String data5 = "text5";
	String data6 = "text6";
	String data7 = "text7";
	String data8 = "text8";
	String data9 = "text9";
	String data10 = "text10";
	String data11 = "text11";

	//injection language and edit fragment
	String json = "{\n" + "  \"name\": \"vinh\",\n " + "  \"old\": 20\n" + "}";

	String regexPattern = "[0-9]+";


	//multi line String
	//shift + ctrl + j -> join string

	//	Press CTRL + ALT + S to open Settings window
//	Find Code Style / Java sectionString longText = "Actions are available under Edit menu, or via
//	the shortcut \"alt M\" and " +
//	Make sure to uncheck "Line Breaks" option and check "Ensure right margin is not exceeded"
//	option		"\"alt shift M\". You can setup your own shortcuts for better usability or
//	customize " +
//			"the popup in File | Settings | Appearance & Behavior | Menus and Toolbars";
	String longText = "The basic way to select a piece of text is to extend the selection with the" +
			" mouse cursor. JetBrains Rider, as a keyboard-centric IDE, suggests to use navigation" +
			" keys to make selections.";
//	Go to Editor | Live Templates in the settings and add a new template
//	// formatter:off
//	    $SELECTION$
//	// formatter:on


	//auto comment ctrl+/ or block ctrl+shift+/
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("something.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
