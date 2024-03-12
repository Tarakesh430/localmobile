package com.localmobile.app.entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "MERCHANT_DTLS")
@Getter
@Setter
public class MerchantDtls {

    @Id
    @Column(name = "MERCHANT_ID")
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name ="uuid-hibernate-generator",strategy = "org.hibernate.id.UUIDGenerator")
    private String merchantId;

    @Column(name = "MERCHANT_NAME", nullable = false)
    private String merchantName;

    @Column(name = "MERCHANT_MOBILE",nullable=false)
    private String merchantMobile;

    @Column(name = "MERCHANT_EMAIL",nullable = false)
    private String merchantEmail;

    @Column(name = "IS_ACTIVE",nullable =false)
    private String isActive;
}