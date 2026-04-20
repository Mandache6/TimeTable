package cz.uhk.timetable.model;

import com.google.gson.annotations.SerializedName;

import java.time.LocalTime;

/**
 * POJO Timetable activity
 */
public class Activity {
    // Module abbreviation, ie ZMAT2, PRO1 etc.
    @SerializedName("predmet")
    private String id;
    // Full name of the module
    @SerializedName("nazev")
    private String name;
    @SerializedName("vsichniUciteleJmenaTituly")
    private String teacher;
    @SerializedName("den")
    private String day;
    @SerializedName("typAkce")
    private String type;
    @SerializedName("hodinaSkutOd")
    private LocalTime start;
    @SerializedName("hodinaSkutDo")
    private LocalTime end;

    public Activity(String pro1, String programovaniI, String kozel, String pondělí, String cvičení, LocalTime localTime, LocalTime end) {
    }

    public Activity(String id, String name, String teacher, String day, LocalTime start, String type, LocalTime end) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.day = day;
        this.start = start;
        this.type = type;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", day='" + day + '\'' +
                ", type='" + type + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
