package com.oop.LMS;

public class Member {
   private int memberId;
   private String membername;
   private int phoneno;

    public Member(int memberId, String membername, int phoneno) {
        this.memberId = memberId;
        this.membername = membername;
        this.phoneno = phoneno;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMembername() {
        return membername;
    }

    public int getPhoneno() {
        return phoneno;
    }
}
