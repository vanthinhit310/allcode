package model;

public class ThongTinDT {
    private String maDT;
    private String tenDT;
    private double giaSP;
    private String manHinh;
    private String cnManHinh;
    private String heDH;
    private String tocdoCPU;
    private String cameraTruoc;
    private String selfie;
    private String dlPin;
    private String sim;
    private String bnTrong;
    private String ram;
    private String hinhAnhSP;
    private double giaBanDau;
    private double giaDaGiam;

    public ThongTinDT() {
        super();
    }

    public ThongTinDT(String maDT, String tenDT, double giaSP, String manHinh, String cnManHinh, String heDH,
                      String tocdoCPU, String cameraTruoc, String selfie, String dlPin, String sim, String bnTrong, String ram,
                      String hinhAnhSP, double giaBanDau, double giaDaGiam) {
        super();
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.giaSP = giaSP;
        this.manHinh = manHinh;
        this.cnManHinh = cnManHinh;
        this.heDH = heDH;
        this.tocdoCPU = tocdoCPU;
        this.cameraTruoc = cameraTruoc;
        this.selfie = selfie;
        this.dlPin = dlPin;
        this.sim = sim;
        this.bnTrong = bnTrong;
        this.ram = ram;
        this.hinhAnhSP = hinhAnhSP;
        this.giaBanDau = giaBanDau;
        this.giaDaGiam = giaDaGiam;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getCnManHinh() {
        return cnManHinh;
    }

    public void setCnManHinh(String cnManHinh) {
        this.cnManHinh = cnManHinh;
    }

    public String getHeDH() {
        return heDH;
    }

    public void setHeDH(String heDH) {
        this.heDH = heDH;
    }

    public String getTocdoCPU() {
        return tocdoCPU;
    }

    public void setTocdoCPU(String tocdoCPU) {
        this.tocdoCPU = tocdoCPU;
    }

    public String getCameraTruoc() {
        return cameraTruoc;
    }

    public void setCameraTruoc(String cameraTruoc) {
        this.cameraTruoc = cameraTruoc;
    }

    public String getSelfie() {
        return selfie;
    }

    public void setSelfie(String selfie) {
        this.selfie = selfie;
    }

    public String getDlPin() {
        return dlPin;
    }

    public void setDlPin(String dlPin) {
        this.dlPin = dlPin;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getBnTrong() {
        return bnTrong;
    }

    public void setBnTrong(String bnTrong) {
        this.bnTrong = bnTrong;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHinhAnhSP() {
        return hinhAnhSP;
    }

    public void setHinhAnhSP(String hinhAnhSP) {
        this.hinhAnhSP = hinhAnhSP;
    }

    public double getGiaBanDau() {
        return giaBanDau;
    }

    public void setGiaBanDau(double giaBanDau) {
        this.giaBanDau = giaBanDau;
    }

    public double getGiaDaGiam() {
        return giaDaGiam;
    }

    public void setGiaDaGiam(double giaDaGiam) {
        this.giaDaGiam = giaDaGiam;
    }

}
