interface LayananGameVault {
    void prosesData(); 
    
    default void greeting() { 
        System.out.println("Sistem GameVault: Operasi Berhasil."); 
    }
    
    static String getVersi() { 
        return "v1.0-Final"; 
    }
}

class BaseTransaksi implements LayananGameVault {
    protected String kode = "GV-001"; 
    
    public BaseTransaksi(String kode) {
        this.kode = kode;
    }

    @Override
    public void prosesData() {
        System.out.println("Memproses kode transaksi: " + kode);
    }
}

class TransaksiSewa extends BaseTransaksi {
    public TransaksiSewa(String kode) {
        super(kode); 
    }

    @Override
    public void prosesData() {
        super.prosesData(); 
        System.out.println("Status: Data Sewa Terverifikasi.");
    }
}

class TransaksiVIP extends BaseTransaksi {
    private String memberId;

    public TransaksiVIP(String kode, String memberId) {
        super(kode);
        this.memberId = memberId;
    }

    public TransaksiVIP(String kode) {
        super(kode);
        this.memberId = "NON-MEMBER";
    }

    @Override
    public void prosesData() {
        System.out.println("Memproses Member VIP: " + memberId);
    }
    
    public void fiturKhusus() {
        System.out.println("Bonus Durasi +1 Jam Aktif!");
    }
}