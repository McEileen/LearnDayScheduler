package com.allstate.session;

import com.allstate.presentation.PresentationEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Time;

@Data
@Entity
@Builder
@Getter
@Table(name = "SESSIONS")
public class SessionEntity {
    @Id
    @Column(name = "ID")
    Float id;

    @ManyToOne
    @JoinColumn(name = "PRESENTATION_ID")
    PresentationEntity presentation;

    @Column(name = "ROOM")
    Room room;

    @Column(name = "TIME")
    Time time;

}

