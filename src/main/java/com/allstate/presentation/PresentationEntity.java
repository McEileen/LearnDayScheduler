package com.allstate.presentation;


import com.allstate.user.UserEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Builder
@Getter
@Table(name = "PRESENTATIONS")
public class PresentationEntity {
    @Id
    @Column(name = "ID")
    Float id;

    @ManyToOne
    @JoinColumn(name = "PRESENTER_ID")
    UserEntity presenter;

    @Column(name = "TITLE")
    String title;

    @Column(name = "SUMMARY")
    String summary;

    @Column(name = "IS_APPROVED")
    boolean isApproved;
}
