package org.lang;

public class StateDetails {
public void southIndia() {
System.out.println("south indian students: 50 students");
}
public void northIndian() {
System.out.println("north Indian students: 15 students");
}
public static void main(String[] args) {
	
	StateDetails s = new StateDetails();
	s.southIndia();
	s.northIndian();
	
	LanguageInfo l = new LanguageInfo();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLanguage();
	
}
}
