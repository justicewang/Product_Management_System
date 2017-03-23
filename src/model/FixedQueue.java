package model;

import java.util.LinkedList;

public class FixedQueue<E> extends LinkedList<E>{
	private int len;
	public FixedQueue(int len) {
		this.len = len;
	}
	@Override
	public boolean add(E o) {
		super.add(o);
		while(size() > len) {
			super.remove();
		}
		return true;
	}
}
