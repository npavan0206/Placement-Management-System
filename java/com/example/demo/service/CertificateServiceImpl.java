package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    @Override
    public Certificate getCertificateById(Long id) {
        return certificateRepository.findById(id).orElse(null);
    }

    @Override
    public Certificate updateCertificate(Long id, Certificate certificate) {
        return certificateRepository.findById(id)
                .map(existing -> {
                    existing.setStudentName(certificate.getStudentName());
                    existing.setHallTicketNumber(certificate.getHallTicketNumber());
                    existing.setCourse(certificate.getCourse());
                    existing.setUniqueHash(certificate.getUniqueHash());
                    existing.setYearOfPassing(certificate.getYearOfPassing());
                    return certificateRepository.save(existing);
                })
                .orElse(null);
    }

    @Override
    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }
}
