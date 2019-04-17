package university.timetable.scheduling.domain;

public class Class {

    		this.course = course;
}


    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setMeetingTime(MeetingTime meetingTime) {
        this.meetingTime = meetingTime;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    public int getClassId() {
        return classId;
    }



    public Department getDepartment() {
        return department;
    }


    public Course getCourse() {
        return course;
    }


    public Instructor getInstructor() {
        return instructor;
    }


    public MeetingTime getMeetingTime() {
        return meetingTime;
    }


    public Room getRoom() {
        return room;
    }

    public String toString() {
        return department.getName()+", "+ course.getCRNumber()+", "+room.getRoomnumber()+", "+ instructor.getName()+", "+meetingTime.getId();

    }
}
