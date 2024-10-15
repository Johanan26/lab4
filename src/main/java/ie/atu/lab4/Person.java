package ie.atu.lab4;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be Blank")
    private String name;

    @NotNull(message = "Title cannot be empty")
    private String title;

    @PositiveOrZero(message = "employeeid must be greater or equal to zero")
    private int employeeid;

    @PositiveOrZero(message = "age must be greater or equal to 0")
    private int age;

    @Email(message = "invalid email address")
    private String email;

    @NotBlank(message = "position cannot be blank")
    private String position;

    @NotBlank(message = "department cannot be blank")
    private String department;

}
