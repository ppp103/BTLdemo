package com.company.model;

public class CauHoi {
    private String noiDung;
    private int doKho;

    public CauHoi(String noiDung, int doKho) {
        this.noiDung = noiDung;
        this.doKho = doKho;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getDoKho() {
        return doKho;
    }

    public void setDoKho(int doKho) {
        this.doKho = doKho;
    }


}
