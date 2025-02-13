package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Builder
@SuperBuilder
@Data
@Entity
@Table(name = "Products")
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Products {
    @Id
    @GeneratedValue(generator = "products_generator")
    @SequenceGenerator(name = "products_generator",
            sequenceName = "products_sequence",
            initialValue = 1
    )
    private Integer id;
    private String name;
    private int price;
}
