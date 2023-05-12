package com.employment.network.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="company", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    public User user;

    @NotEmpty
    public String name;

    @NotEmpty
    public String address;

    @NotEmpty
    public String contactInfo;

}
