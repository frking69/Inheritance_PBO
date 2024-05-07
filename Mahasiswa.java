public class Mahasiswa extends Orang {
    private String nrp;

    public Mahasiswa(String nrp, String nama, String alamat) {
        super(nama, alamat);
        setNr(nrp);
    }

    public String getNr() {
        return nrp;
    }

    public void setNr(String nrp) {
        this.nrp = nrp;
    }

}
