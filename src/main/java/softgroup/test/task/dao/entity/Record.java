package softgroup.test.task.dao.entity;


import java.util.Date;

public class Record {

    private Long id;

    private String name;

    private String surname;

    private Date birthday;

    private String phoneNumber;

    private String mail;

    private String country;

    private String city;

    public Record() {
    }

    public Record(String name, String surname, Date birthday, String phoneNumber, String mail, String country, String city) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.country = country;
        this.city = city;
    }

    public Record(Long id, String name, String surname, Date birthday, String phoneNumber, String mail, String country, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.country = country;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (birthday != null ? !birthday.equals(record.birthday) : record.birthday != null) return false;
        if (city != null ? !city.equals(record.city) : record.city != null) return false;
        if (country != null ? !country.equals(record.country) : record.country != null) return false;
        if (mail != null ? !mail.equals(record.mail) : record.mail != null) return false;
        if (name != null ? !name.equals(record.name) : record.name != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(record.phoneNumber) : record.phoneNumber != null) return false;
        if (surname != null ? !surname.equals(record.surname) : record.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
