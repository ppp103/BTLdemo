package com.company.model;

public class Main {
    public static void main(String[] args) {
        DeThi dt1 = new DeThi();
        CauHoi ch1 = new TuLuan("1 + 1 = ?", 25, "2");
        CauHoi ch2 = new TuLuan("1 + 3 = ?", 30, "4");
        TracNghiem ch3 = new TracNghiem("What is ML", 90);
        ch3.addLuaChon(new LuaChon("Machine Learning"),true);
        ch3.addLuaChon(new LuaChon("Mimi"),false);
        ch3.addLuaChon(new LuaChon("Deep Learning"),false);

        TracNghiem ch4 = new TracNghiem("1 + 4 = ?", 20);
        ch4.addLuaChon(new LuaChon("5"),true);
        ch4.addLuaChon(new LuaChon("2"),false);
        ch4.addLuaChon(new LuaChon("5 + 0"),true);

        dt1.addCauHoi(ch1, 1.0);
        dt1.addCauHoi(ch2,2.0);
        dt1.addCauHoi(ch3,3.0);
        dt1.addCauHoi(ch4,4.0);

//        System.out.println(ch4);
//        System.out.println(ch1);
        System.out.println(dt1);
    }
}
