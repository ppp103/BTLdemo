package com.company.model;

public class TuLuan extends CauHoi{
    private String dapAn;

    public TuLuan(String noiDung, int doKho, String dapAn) {
        super(noiDung, doKho);
        this.dapAn = dapAn;
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }
    @Override
    public String toString(){
      return "Cau hoi: " + this.getNoiDung() + "\n";
    }
}
