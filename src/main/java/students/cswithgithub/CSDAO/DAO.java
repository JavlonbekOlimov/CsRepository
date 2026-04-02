package students.cswithgithub.CSDAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "CS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DAO {

    @Id
    private Integer id;
    private String name;
    private String description;
    private String type;
    private String usefullevel;
    private String country;
    private String condition;

}
