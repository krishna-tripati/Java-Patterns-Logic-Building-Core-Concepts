package com.oop.LMS;

public class AddBooks {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    private int bookCount;


    public AddBooks(int bookId, String bookTitle, String bookAuthor, double bookPrice,int bookCount) {
        this.bookCount = bookCount;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookCount() {
        return bookCount;
    }

    public boolean checkBookAvailable(){
       return getBookCount()>0;
    }

    //decrease book count by
    public void decreaseBookCount() {
        this.bookCount --;
    }

    //increase book count by 1
    public void increaseBookCount(){
        this.bookCount++;
    }
}
