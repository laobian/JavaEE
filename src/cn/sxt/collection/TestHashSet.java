package cn.sxt.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试HashSet的基本用法
 * Set:没有顺序，不可重复！
 * List：有顺序，可重复！
 * @author Administrator
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String>  set1 = new HashSet<>();
		
		set1.add("aa");
		set1.add("bb");
		set1.add("aa");
		System.out.println(set1);
		set1.remove("bb");
		System.out.println(set1);
		
	
		Set<String>  set2 = new HashSet<>();
		set2.add("高淇");
		set2.addAll(set1);
		System.out.println(set2);
		
		
		
	}
}
