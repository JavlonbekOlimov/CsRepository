package students.cswithgithub.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class CsDTO {

        private Integer id;
        private String name;
        private String description;
        private String type;
        private String usefullevel;
        private String country;
        private String condition;
    }

