package com.oop.LMS;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarayManagementSys {
    //Borrow Record
    static ArrayList<BorrowRecord> borrowRecords=new ArrayList<>();

    //find member by id
    public static Member memberFindById(int memberid, ArrayList<Member> members){
        for(Member newMember: members){
            if(newMember.getMemberId()==memberid){
                return newMember;
            }
        }
        return null;
    }

    // find book by id
    public static AddBooks bookFindById(int newbookid, ArrayList<AddBooks> books){
        for(AddBooks book1: books){
            if(book1.getBookId()==newbookid){
                return book1;
            }
        }
        return null;
    }

    //Store Borrow Record
     static  int borrowId=1;
    public static void storeBorrowRecords(Member members, AddBooks books){

        borrowRecords.add(new BorrowRecord(borrowId,members,books));
        //display Borrow data
        System.out.println("---Borrow Data  ");
        System.out.println("Borrow Id: "+borrowId);
        System.out.println("Member Name: "+members.getMembername());
        System.out.println("Book Id: "+books.getBookId());
        System.out.println("Book Title: "+books.getBookTitle());
        System.out.println("Book Author: "+books.getBookAuthor());
        System.out.println("Book price: "+books.getBookPrice());
        borrowId++;
    }

    //find borrow data by id
    public static BorrowRecord borrowRecordByid(int borrowId, ArrayList<BorrowRecord> borrowRecords){
        for(BorrowRecord record: borrowRecords){
            if(record.getBorrowId()==borrowId){
                return  record;
            }
        }
        return null;
    }

    //view all Borrow Records
    public static void displayAllBorrowRocords(){
        for(BorrowRecord record: borrowRecords){
            System.out.println("--View All Borrow Records");
            System.out.println("Borrow Id: "+record.getBorrowId());
            System.out.println("Member Id: "+record.getMember().getMemberId());
            System.out.println("Member Name: "+record.getMember().getMembername());
            System.out.println("Book Id: "+record.getBooks().getBookId());
            System.out.println("Book Title: "+record.getBooks().getBookTitle());
            System.out.println("Book Author: "+record.getBooks().getBookAuthor());
            System.out.println("Book price: "+record.getBooks().getBookPrice());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Member> members=new ArrayList<>();
        ArrayList<AddBooks> books=new ArrayList<>();


         boolean isture=true;
        while (isture){
            System.out.println("Enter 1 for Register Member ");
            System.out.println("Enter 2 for Add New book: ");
            System.out.println("Enter 3 for View Available Books: ");
            System.out.println("Enter 4 for Borrow Book");
            System.out.println("Enter 5 for Return Book");
            System.out.println("Enter 6 for Borrow Records");
            System.out.println("Enter 7 Exit");
            int selectOption=sc.nextInt();

            switch (selectOption){
                case 1:
                    System.out.println(" --- New Member Registration --- ");
                    System.out.println("Enter Member Id");
                    int memberId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Member Name");
                    String memberName=sc.nextLine();
                    System.out.println("Enter Phone No. ");
                    int no= sc.nextInt();
                    members.add(new Member(memberId,memberName,no));
                    System.out.println("successfully added new member");
                    break;
                case 2:
                    System.out.println("Enter New Books");
                    System.out.println("Enter Book Id: ");
                    int bookId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Book Title ");
                    String bookTitle=sc.nextLine();
                    System.out.println("Enter Book Author ");
                    String bookAuthor=sc.nextLine();
                    System.out.println("Enter Book Price ");
                    double bookPrice=sc.nextDouble();
                    System.out.println("Enter Book Count ");
                    int bookCount=sc.nextInt();
                    books.add(new AddBooks(bookId,bookTitle,bookAuthor,bookPrice,bookCount));
                    System.out.println("Successfully added new books");
                    break;
                case  3:
                    if(books.isEmpty()){
                        System.out.println("Books Unavailable");
                    }else {
                        boolean availableBookFound=false;
                        for(AddBooks book: books){
                             if(book.checkBookAvailable()){
                                 availableBookFound=true;
                                 System.out.println("View Available Books");
                                 System.out.println("Book ID: "+book.getBookId());
                                 System.out.println("Book Title: "+book.getBookTitle());
                                 System.out.println("Book Author: "+book.getBookAuthor());
                                 System.out.println("Book Price: "+book.getBookPrice());
                                 book.checkBookAvailable();
                                 System.out.println();
                             }

                        }
                        if(!availableBookFound){
                            System.out.println("book currently Unavailable");
                        }
                    }
                 break;
                case 4:  //find member by id
                    System.out.println(" Enter Member ID: ");
                    int memberid=sc.nextInt();

                    Member newMember=memberFindById(memberid,members);
                    if(newMember==null){
                        System.out.println("Member doesn't exit");
                    }else {
                            //check book by id
                        System.out.println("Enter Book Id: ");
                        int newbookid=sc.nextInt();

                     AddBooks bookdata=bookFindById(newbookid, books);
                          if(bookdata==null){
                              System.out.println("Book Unavailable");
                          }else {
                                 //first check count of book if count zero remove data from arraylist
                              if(bookdata.checkBookAvailable()){
                                  //store Borrow Records
                                  storeBorrowRecords(newMember,bookdata);

                                  //decrese copies by 1
                                  bookdata.decreaseBookCount();
                              }else {
                                  System.out.println("Book is currently unavailable");
                              }
                          }
                    }
                    break;
                case 5:
                    System.out.println("-- Return Book -- ");
                    System.out.println("Enter Borrow ID");
                    int returnBorrowId=sc.nextInt();

                    BorrowRecord record=borrowRecordByid(returnBorrowId,borrowRecords);
                    if(record==null){
                        System.out.println("incorrect ID:  -- give correct ID for returning book ");
                    }
                    else {
                        record.getBooks().increaseBookCount();
                        borrowRecords.remove(record);
                        System.out.println("Book return Successfully");
                    }
                   break;
                case 6:
                    System.out.println("-- All Borrow Records --");
                    displayAllBorrowRocords();
                    break;
                case 7:
                    System.out.println("Thank you for Visiting");
                    isture=false;
                    break;

            }
        }
    }

}
