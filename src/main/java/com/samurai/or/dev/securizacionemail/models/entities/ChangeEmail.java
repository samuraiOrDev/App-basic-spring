package com.samurai.or.dev.securizacionemail.models.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Id;

@Entity
@Table(name = "CHANGE_EMAIL")
public class ChangeEmail implements Serializable {

    private static final int NUMBER_100 = 100;
    private static final int NUMBER_20 = 20;
    private static final int NUMBER_50 = 50;

    @Id
    @Column(name = "CLIENT_ID", unique = true, nullable = false, length = NUMBER_50)
    private String clientId;

    @Column(name = "CUSTOMER_ID")
    private String customerId;

    @Column(name = "REGISTRATION_DATE", length = NUMBER_20)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @Column(name = "EMAIL_OLD", length = NUMBER_100)
    private String oldEmail;

    @Column(name = "EMAIL_NEW", length = NUMBER_100)
    private String newEmail;

    @Column(name = "TOKEN", length = NUMBER_100)
    private String token;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getOldEmail() {
        return oldEmail;
    }

    public void setOldEmail(String oldEmail) {
        this.oldEmail = oldEmail;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}