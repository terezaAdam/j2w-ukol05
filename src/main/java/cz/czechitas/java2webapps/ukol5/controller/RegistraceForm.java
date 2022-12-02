package cz.czechitas.java2webapps.ukol5.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class RegistraceForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @NotBlank
    private int datum_narozeni;
    @NotBlank
    private String pohlavi;
    @NotBlank
    private String turnus;
    @Email
    @NotBlank
    private String email;
    private String telefon;




    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getDatum_narozeni() {
        return datum_narozeni;
    }

    public void setDatum_narozeni(int datum_narozeni) {
        this.datum_narozeni = datum_narozeni;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


}
