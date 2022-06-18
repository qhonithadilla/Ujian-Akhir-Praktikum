package Main;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){

        return null;
    }

    public double getBeasiswa(){

        return 0;
    }

    @Override
    public String toString() {
        super.toString();
        return "MahasiswaFilkom{" + "NIM='" + getNIM() + '\'' + ", IPK=" + getIPK() + '}';
    }
}
