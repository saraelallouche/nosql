package org.acme.mongodb;
import java.util.Objects;

public class Note {

    private Float note;


    public Note() {
    }

    public Note(Float note) {
        this.note = note;
    }



    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        return Objects.equals(note, note1.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note);
    }




}
