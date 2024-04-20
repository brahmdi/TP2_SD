package com.tp.hospital.service;

import com.tp.hospital.entities.Consultation;
import com.tp.hospital.entities.Medecin;
import com.tp.hospital.entities.Patient;
import com.tp.hospital.entities.RendezVous;

public interface IHospitatlService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
