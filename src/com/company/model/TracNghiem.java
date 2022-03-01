package com.company.model;

import java.util.HashMap;
import java.util.Map;

public class TracNghiem extends CauHoi {
    private Map<LuaChon, Boolean> dsLuaChon;

    public TracNghiem(String noiDung, int doKho) {
        super(noiDung, doKho);
        this.dsLuaChon = new HashMap<LuaChon, Boolean>();
    }

    public Map<LuaChon, Boolean> getDsLuaChon() {
        return dsLuaChon;
    }

    public void setDsLuaChon(Map<LuaChon, Boolean> dsLuaChon) {
        this.dsLuaChon = dsLuaChon;
    }

    public void addLuaChon(LuaChon luaChon, Boolean dapAn){
        dsLuaChon.put(luaChon, dapAn);
    }

    public String toString(){
        String s = "Cau hoi: " + this.getNoiDung() + "\n";
        for (LuaChon luaChon : dsLuaChon.keySet()){
            s += luaChon.getNoiDung() + "\n";
        }
        return s;
    }
}
