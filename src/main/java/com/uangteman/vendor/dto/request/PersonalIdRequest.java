package com.uangteman.vendor.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

//&nama=&namaPropinsi=&namaKabKota=&namaKecamatan=&namaKelurahan=&notificationType=
public class PersonalIdRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("nik")
	private String nik;
	@JsonProperty("nama")
	private String nama;
	@JsonProperty("nama_propinsi")
	private String namaPropinsi;
	@JsonProperty("nama_kab_kota")
	private String namaKabKota;
	@JsonProperty("nama_kecamatan")
	private String namaKecamatan;
	@JsonProperty("nama_kelurahan")
	private String namaKelurahan;
	@JsonProperty("tipe_notifikasi")
	private String notificationType;

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNamaPropinsi() {
		return namaPropinsi;
	}

	public void setNamaPropinsi(String namaPropinsi) {
		this.namaPropinsi = namaPropinsi;
	}

	public String getNamaKabKota() {
		return namaKabKota;
	}

	public void setNamaKabKota(String namaKabKota) {
		this.namaKabKota = namaKabKota;
	}

	public String getNamaKecamatan() {
		return namaKecamatan;
	}

	public void setNamaKecamatan(String namaKecamatan) {
		this.namaKecamatan = namaKecamatan;
	}

	public String getNamaKelurahan() {
		return namaKelurahan;
	}

	public void setNamaKelurahan(String namaKelurahan) {
		this.namaKelurahan = namaKelurahan;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

}
