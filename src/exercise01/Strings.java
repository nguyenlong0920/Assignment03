package exercise01;

public class Strings {
	public static void main(String[] args) {
		String str = "Java core is very simple, but I do not like Java";
		
		int count = 0;
		String[] words = str.split(" ");
        for (String word : words) {
            if (word.equals("Java")) {
            	count++;
            }
        }
        System.out.println("Occurrences of \"Java\": " + count);
        
        // Use a regex with word boundaries \b
        String newStr = str.replaceAll("\\bJava\\b", "Python");
        System.out.println(newStr);
        
        // First and last positions of 'e'
        System.out.println("First position of 'e': " + str.indexOf('e'));
        System.out.println("Last position of 'e': " + str.lastIndexOf('e'));
	}
}
