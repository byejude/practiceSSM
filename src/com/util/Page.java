package com.util;

/**
 * Created by byebyejude on 2017/9/10.
 */
public class Page {
    public int start = 0;
    public int count = 5;
    public int last = 0;

    public int getStart() {
        return start;
    }

    public int getCount() {
        return count;
    }

    public int getLast() {
        return last;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLast(int last) {
        this.last = last;
    }


    public void caculateLast(int total){
          if(0 == total%count){
              last = total -count;
          }else {
              last = total -total % count;
          }


    }
}
