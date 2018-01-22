package com.uangteman.vendor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uangteman.vendor.dto.response.PersonalIdLookupResponse;
import com.uangteman.vendor.service.PersonalIdService;

@Service("personalIdService")
@Transactional
public class PersonalIdServiceImpl implements PersonalIdService {

	public static final String kpuJakartaUrl = "https://pilkada2017.kpu.go.id/pemilih/dpt/2/hasil-cari/resultDps.json";

	@Override
	public PersonalIdLookupResponse lookupPersonalId(String personalIdNumber) {

		RestTemplate restTemplate = new RestTemplate();
		if (personalIdNumber.isEmpty())
			return new PersonalIdLookupResponse(personalIdNumber, "", false);

		Map<String, String> vars = new HashMap<String, String>();
		vars.put("nik", personalIdNumber);
		Map<?, ?> result = restTemplate.getForObject(
				PersonalIdServiceImpl.kpuJakartaUrl + "?&nik={nik}"
						+ "&nama=&namaPropinsi=&namaKabKota=&namaKecamatan=&namaKelurahan=&notificationType=",
				Map.class, vars);

		List<PersonalIdLookupResponse> resultPersonalId = (List<PersonalIdLookupResponse>) result.get("aaData");

		boolean isEmptyResultPersonalId = resultPersonalId.isEmpty();
		if (isEmptyResultPersonalId) {
			return new PersonalIdLookupResponse(personalIdNumber, "", false);
		}
		System.out.println(resultPersonalId.get(0).getNik());
		return null;
	}

}
