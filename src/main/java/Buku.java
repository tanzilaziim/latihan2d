public class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
    //deklarasi atribut judul, pengarang, penerbit, dan tahun
    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    } //deklarasi konstruktor dengan parameter 4 atribut yang ada
    public void cetakBuku(){
        System.out.println("Judul: "+this.judul);
        System.out.println("Pengarang: "+this.pengarang);
        System.out.println("Penerbit: "+this.penerbit);
        System.out.println("Tahun: "+this.tahun);
    }//deklarasi metode cetakBuku untuk menampilkan nilai yang ada pada atribut
}
