package org.example.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {

    private Long id;
    private String nome;
    private Integer idade;
}
