package com.localmobile.app.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_DTLS")
@Getter
@Setter
public class CustomerDtls {

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name ="uuid-hibernate-generator",strategy = "org.hibernate.id.UUIDGenerator")
    private String customerId;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    private String customerName;

    @Column(name = "CUSTOMER_MOBILE",nullable=false)
    private String customerMobile;

    @Column(name = "CUSTOMER_EMAIL",nullable = false)
    private String customerEmail;

    @Column(name = "IS_ACTIVE",nullable =false)
    private String isActive;

}
