package object.chap02;

import java.time.LocalDateTime;

public class Screening {

    private final Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }
}
