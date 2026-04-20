package cz.uhk.timetable.utils;

import cz.uhk.timetable.model.LocationTimetable;

/**
 * Interface for timetable provider classes
 */
public interface ITimeTableProvider {
    /**
     * Returns newly read timetable of selected room
     * @param building building id
     * @param room room id
     * @return timetable of the room
     */
    LocationTimetable readTimetable(String building, String room);

}
