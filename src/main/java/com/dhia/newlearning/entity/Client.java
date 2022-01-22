package com.dhia.newlearning.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;

/**
 *
 */
@Entity
@Getter
@Setter
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;



    @NotBlank
    @Column(name="Nom_client")
    private String nomClient;
    @Column(name="Prenom_Client")
    @NotBlank
    private String prenomClient;

    @NotBlank
    private String login;
    @NotBlank
    private String password;
    @NotBlank
    private String rue;

    @Column(name="Code_Postale")
    @NotBlank
    private String codePostale;
    @NotBlank
    private String ville;
    @NotBlank
    private String pays;
    @NotBlank
    private String tel;
    @JsonProperty("E_mail")
    @NotBlank
    private String e_mail;


}
