package Heaps;
import java.util.*;
public class Heaps {
	private List<Integer> list;
	
	Heaps(){
		list = new ArrayList<>();
	}
	private void swap(int f, int s) {
		int temp = list.get(f);
		list.set(f, list.get(s));
		list.set(s,temp);
	}
	private int parent(int i) {
		return (i-1)/2;
	}
	private int left(int i) {
		return (i*2)+1;
	}
	private int right(int i) {
		return (2*i)+2;
	}
	public 	void insert(int val) {
		list.add(val);
		upheap(list.size()-1);
	}
	private void upheap(int i) {
		if(i==0) {
			return;
		}
		int val = list.get(i);
		int parent = parent(i);
		if(val < list.get(parent)) {
			swap(i,parent);
			upheap(parent);
		}
		else {
			return;
		}
		
	}
	public void remove(int val) {
		if(list.isEmpty()) {
			System.out.println("Heap is Empty");
			return;
		}
		int last = list.get(list.size()-1);
		list.remove(list.size()-1);
		if(!list.isEmpty()) {
			list.set(0, last);
			downheap(0);
		}
	}
	private void downheap(int i) {
		int min=i;
		int left = left(i);
		int right = right(i);
		if(left < list.size() && list.get(min)> list.get(left)) {
			min = left;
		}
		if(right < list.size() && list.get(min)> list.get(right)) {
			min = right;
		}
		if(min != i) {
			swap(min,i);
			downheap(min);
		}
	}
	public void print() {
		for(int i:list) {
			System.out.print(i+" ");
		}
	}
	
}
