package com.udea.ParcialEquipo1.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Paciente implements Serializable {
    @Id
    @Column(name="cc")
    private Long cc;

    @Column(name="firstname", nullable = false, length = 80)
    private @NonNull String firstName;

    @Column(name="FC", nullable = false, length = 80)
    private @NonNull String fechaCreacion;


}
