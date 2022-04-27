package tacos;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table
public class IngredientRef {

    public String ingredient;
}
