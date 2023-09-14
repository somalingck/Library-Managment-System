package com.example.librarymanagementsystem.model;

import com.example.librarymanagementsystem.Enum.TransactionStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String transactionNumber;

    @CreationTimestamp
    Date transactionTime;

    TransactionStatus transactionStatus;

    @ManyToOne
    @JoinColumn
    Book book;

    @ManyToOne
    @JoinColumn
    LibraryCard libraryCard;

}














