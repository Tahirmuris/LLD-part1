package designPattern.builderDesign;

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private String address;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    private Student () {
    }

    private Student(Integer id, String name, String surname, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }
    private Student(Builder builder) {
        this(builder.getId(), builder.getName(), builder.getSurname(), builder.getAddress(), builder.getAge());
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer id;
        private String name;
        private String surname;
        private String address;
        private Integer age;

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getAddress() {
            return address;
        }

        public Integer getAge() {
            return age;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        private void validate() {
            if (id == null || id <= 0) {
                throw new IllegalArgumentException("ID can not be negative");
            }

            if (age == null || age > 20) {
                throw  new IllegalArgumentException("age can not be null or above 20 years");
            }
        }

        public Student build() {
            validate();
            return new Student(this);
        }
    }
}
