package com.company;

import java.util.*;


public class MySortedSet<T> {
    private Vector<T> vector = new Vector<T>();
    private  ListIterator<T> listIterator;

    private SortedSet<T> set = new TreeSet<>();
    private Comparator comparator = Comparator.naturalOrder();

    public boolean add(T o){
        try{
            vector.add(o);
            vector.sort(comparator);
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    public Comparator comparator(){
        return comparator;
    }

    public T first(){
        try{
            listIterator = vector.listIterator();
            return listIterator.next();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public T last(){
        listIterator = vector.listIterator();
        return vector.get(vector.size() - 1);
    }

    public boolean remove(Object o){
        try{
            vector.remove(o);
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        listIterator = vector.listIterator();
        while(listIterator.hasNext()){
            result.append(listIterator.next() + "\n");
        }
        return result.toString();
    }
}
