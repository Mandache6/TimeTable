package cz.uhk.timetable.utils;

import cz.uhk.timetable.model.Activity;
import cz.uhk.timetable.model.LocationTimetable;

import java.time.LocalTime;

public class MockTimetableProvider implements ITimeTableProvider {

    @Override
    public LocationTimetable readTimetable(String building, String room) {
        var tt = new LocationTimetable("J", "22");
        tt.getActivities().add(new Activity(
                "PRO1", "Programovani I", "Kozel",
                "Pondělí", "Cvičení",
                LocalTime.of(11,35),
                LocalTime.of(13,05)
        ));
        tt.getActivities().add(new Activity(
                "PRO1", "Programovani I", "Kozel",
                "Pondělí", "Přednáška",
                LocalTime.of(9,05),
                LocalTime.of(10,35)
        ));
        tt.getActivities().add(new Activity(
                "ZMAT2", "Základy matematiky II", "Bauer",
                "Pondělí", "Přednáška",
                LocalTime.of(10,45),
                LocalTime.of(12,15)
        ));
        return tt;
    }
}
