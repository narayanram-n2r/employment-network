package com.employment.network.model;

import com.jobs.jobsearch.model.helper.DocType;
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
@Table(name = "job_document")
public class JobDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long docId;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User user;

    @NotEmpty
    private DocType type;

    @NotEmpty
    private String name;

}
