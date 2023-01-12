package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SanPham {
	@Id
	private String maSanPham;
	private String tenSanPham;
//	private TacGia tacGia;
	private int namXuatBan;
	private double giaNhap;
	private double giaBia;
	private double giaBan;
	private int soLuong;
//	private TheLoai theLoai;
	private String ngonNgu;
	@Lob
	@Column(length = 100000)
	private String moTa;

	public SanPham() {
	}

	public SanPham(String maSanPham, String tenSanPham, int namXuatBan, double giaNhap, double giaBia, double giaBan,
			int soLuong, String ngonNgu, String moTa) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.namXuatBan = namXuatBan;
		this.giaNhap = giaNhap;
		this.giaBia = giaBia;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
		this.ngonNgu = ngonNgu;
		this.moTa = moTa;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public double getGiaBia() {
		return giaBia;
	}

	public void setGiaBia(double giaBia) {
		this.giaBia = giaBia;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", namXuatBan=" + namXuatBan
				+ ", giaNhap=" + giaNhap + ", giaBia=" + giaBia + ", giaBan=" + giaBan + ", soLuong=" + soLuong
				+ ", ngonNgu=" + ngonNgu + ", moTa=" + moTa + "]";
	}

}
