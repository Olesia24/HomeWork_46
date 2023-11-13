package homeWork.homeWork.Hw3_runners;

import java.util.Objects;

public class Runners implements Comparable<Runners> {
    //Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров, в котором зафиксированы фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах. Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.
    private String lasName;
    private String firstName;
    private int idNumber;
    private String club;
    private int time;

    public Runners(String lasName, String firstName, int idNumber, String club, int time) {
        this.lasName = lasName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.club = club;
        this.time = time;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Runners{" +
                "lasName='" + lasName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", idNumber=" + idNumber +
                ", club='" + club + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runners runners = (Runners) o;
        return idNumber == runners.idNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }

    @Override
    public int compareTo(Runners o) { //sorted by ID & time
        int res = this.idNumber -o.idNumber;
        return res != 0 ? res : Integer.compare(this.time, o.time) ;
    }
}
