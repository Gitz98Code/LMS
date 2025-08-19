
package lk.lms.model;

import java.sql.Date;


public class ReturnRecord {
    private int borrowId;
    private int memberId;
    private String memberName;
    private String bookId;
    private String bookName;
    private Date borrowDate;
    private Date returnDate;
    private boolean returned;

    public ReturnRecord() {
    }

    public ReturnRecord(int borrowId, int memberId, String memberName, String bookId, String bookName, Date borrowDate, Date returnDate, boolean returned) {
        this.borrowId = borrowId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.bookId = bookId;
        this.bookName = bookName;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Return{" + "borrowId=" + borrowId + ", memberId=" + memberId + ", memberName=" + memberName + ", bookId=" + bookId + ", bookName=" + bookName + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + ", returned=" + returned + '}';
    }

    
    
    
}
