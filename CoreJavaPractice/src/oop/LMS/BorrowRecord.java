package com.oop.LMS;

public class BorrowRecord {
    private int borrowId;
    private Member member;
    private AddBooks books;

    public BorrowRecord(int borrowId, Member member, AddBooks books) {
        this.borrowId = borrowId;
        this.member = member;
        this.books = books;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public Member getMember() {
        return member;
    }

    public AddBooks getBooks() {
        return books;
    }
}
