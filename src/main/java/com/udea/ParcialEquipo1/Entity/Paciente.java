package com.udea.ParcialEquipo1.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Paciente implements Serializable {
    @Id

    @Column(name="cc", length =20)

    private Long cc;

    @Column(name="firstname", nullable = false, length = 80)
    private @NonNull String firstName;

    @Column(name="FC", nullable = false, length = 80)

    private @NonNull Date fechaCreacionHC;


}
