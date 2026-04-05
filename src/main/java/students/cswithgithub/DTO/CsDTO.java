package students.cswithgithub.DTO;


    public class CsDTO {

        private Integer id;
        private String name;         // kodni o'zi
        private String description;  // tavsifi
        private String type;         // tasvir, qurol, xarakat....
        private String useFullLevel; // foydalilik darajasi 1,2,3,4,5


        public CsDTO() {
        }

        @Override
        public String toString() {
            return "CsDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", type='" + type + '\'' +
                    ", useFullLevel='" + useFullLevel + '\'' +
                    '}';
        }

        public CsDTO(Integer id, String name, String description, String type, String useFullLevel) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.type = type;
            this.useFullLevel = useFullLevel;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUseFullLevel() {
            return useFullLevel;
        }

        public void setUseFullLevel(String useFullLevel) {
            this.useFullLevel = useFullLevel;
        }
    }

