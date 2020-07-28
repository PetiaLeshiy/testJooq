package org.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PetModel {

    private Long id;
    private TypeAnimal typeAnimal;

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", typeAnimal=" + typeAnimal +
                '}';
    }
}
