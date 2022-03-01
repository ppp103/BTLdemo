package com.company.model;
import java.util.HashMap;
import java.util.Map;
public class DeThi {
    private Map<CauHoi, Double> dsCauHoi;

    public DeThi() {
        this.dsCauHoi = new HashMap<CauHoi, Double>();
    }

    public Map<CauHoi, Double> getDsCauHoi() {
        return dsCauHoi;
    }

    public void setDsCauHoi(Map<CauHoi, Double> dsCauHoi) {
        this.dsCauHoi = dsCauHoi;
    }

    public void addCauHoi(CauHoi c, Double diem){
        dsCauHoi.put(c,diem);
    }

    public double doKhoTB(){
        double s = 0;
        for(CauHoi c : dsCauHoi.keySet()){
            s += c.getDoKho();
        }
        return s/dsCauHoi.size();
    }

    public String toString(){
        String s = "";
        for(CauHoi c : dsCauHoi.keySet()){
            s += c.toString();
        }
        return s;
    }
}
