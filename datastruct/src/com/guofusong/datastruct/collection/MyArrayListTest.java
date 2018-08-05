package com.guofusong.datastruct.collection;

import org.junit.jupiter.api.Test;

class MyArrayListTest {

	@Test
	void testMyArrayList() {
		MyArrayList<String> mal = new MyArrayList<>();
	}

	@Test
	void testMyArrayListInt() {
		MyArrayList<String> mal = new MyArrayList<>(23);
	}

	@Test
	void testSize() {
		MyArrayList<String> mal = new MyArrayList<>(23);
		System.out.println(mal.size());
	}

	@Test
	void testAddT() {
		MyArrayList<String> mal = new MyArrayList<>();
		for(int i = 0; i < 100; i ++) {
			mal.add("hello");
		}
		System.out.println(mal.size());
		System.out.println(mal.get(99));
	}

	@Test
	void testAddIntT() {
		MyArrayList<String> mal = new MyArrayList<>();
		mal.add(0, "hello");
		System.out.println(mal.get(0));
	}

	@Test
	void testRemove() {
		MyArrayList<String> mal = new MyArrayList<>();
		mal.add(0, "hello");
		System.out.println(mal.get(0));
		mal.remove(0);
		System.out.println(mal.get(0));
	}

	@Test
	void testContains() {
		MyArrayList<String> mal = new MyArrayList<>();
		mal.add("你好");
		System.out.println(mal.contains("你好1"));
	}
	
	@Test
	void walk() {
		MyArrayList<String> mal = new MyArrayList<>();
		for(int i = 0; i < 100; i++) {
			mal.add("添加内容"+i);
		}
		mal.remove(98);
		for(int i = 0 ; i < mal.size(); i++) {
			System.out.println("下标：" + i + " , "+mal.get(i));
		}
	}
	

}
