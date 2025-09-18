package com.example.demo.service;

import com.example.demo.entity.Certificate;
import java.util.List;

public interface CertificateService {
    Certificate saveCertificate(Certificate certificate);
    List<Certificate> getAllCertificates();
    Certificate getCertificateById(Long id);
    Certificate updateCertificate(Long id, Certificate certificate);
    void deleteCertificate(Long id);
}
