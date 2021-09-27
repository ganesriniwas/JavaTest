package testInheritance;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class AmazonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 4, 4, 5, 5, 5, 3, 2, 6, 4, 7, 1, 2, 2, 1 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		ArrayList<Integer> ual = new ArrayList<Integer>();
		ual.add(al.get(0));
		for (int i = 0; i < al.size(); i++) {
			if (!(ual.contains(al.get(i)))) {
				ual.add(al.get(i));
			}
		}
		ArrayList<Integer> count = new ArrayList<Integer>();
		for (int i = 0; i < ual.size(); i++) {
			int temp = 0;
			for (int j = 0; j < al.size(); j++) {
				if (ual.get(i).equals(al.get(j))) {
					temp++;
				}
			}
			count.add(temp);
		}
		System.out.println(al);
		System.out.println(ual);
		System.out.println(count);
	}

}
