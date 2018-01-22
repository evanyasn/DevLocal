/**
 * 
 */
package com.uangteman.vendor.dto.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author maryosandoz
 *
 */
public class PersonalIdLookupResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("nik")
	private String nik;
	@JsonProperty("nama")
	private String nama;
	@JsonProperty("jenisKelamin")
	private String jenisKelamin;
	@JsonProperty("tps")
	private int nomorTps;
	@JsonProperty("namaPropinsi")
	private String namaPropinsi;
	@JsonProperty("namaKabKota")
	private String namaKabKota;
	@JsonProperty("namaKecamatan")
	private String namaKecamatan;
	@JsonProperty("namaKelurahan")
	private String namaKelurahan;
	@JsonProperty("status")
	private boolean status;

	public PersonalIdLookupResponse() {
		super();
	}

	public PersonalIdLookupResponse(String nik, String nama, boolean status) {
		super();
		this.nik = nik;
		this.nama = nama;
		this.status = status;
	}

	public PersonalIdLookupResponse(String nik, String nama, String jenisKelamin, int nomorTps, String namaPropinsi,
			String namaKabKota, String namaKecamatan, String namaKelurahan, boolean status) {
		super();
		this.nik = nik;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.nomorTps = nomorTps;
		this.namaPropinsi = namaPropinsi;
		this.namaKabKota = namaKabKota;
		this.namaKecamatan = namaKecamatan;
		this.namaKelurahan = namaKelurahan;
		this.status = status;
	}

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

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public int getNomorTps() {
		return nomorTps;
	}

	public void setNomorTps(int nomorTps) {
		this.nomorTps = nomorTps;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
