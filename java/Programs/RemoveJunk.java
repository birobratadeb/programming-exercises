package sdet_javaProg;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "!#$@%@^@*@@()@)+_)(*&^%$#@!>.???:{{[]}.;?/ The quick brown fox jumps over the lazy dog";
		s= s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
	}
}
