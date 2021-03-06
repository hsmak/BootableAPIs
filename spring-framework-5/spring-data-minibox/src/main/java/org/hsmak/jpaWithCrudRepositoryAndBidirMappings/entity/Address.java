package org.hsmak.jpaWithCrudRepositoryAndBidirMappings.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street_number")
    private Integer streetNumber;

    @Column(name = "street_name")
    private String streetName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Address() {
    }

    public Address(Integer streetNumber, String streetName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
    }

    public Address(Integer streetNumber, String streetName, User user) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
