package Model;

import java.util.Date;

public class Borrowing {

    private String idB;
    private String idUser;
    private String userName;
    private String isbn;
    private String bookName;
    private Date dStart;
    private Date devolution;
    private Date dEnd;
    private boolean rSituation;

    /*SETS E GETS*/

    public String getIdB() {
        return idB;
    }

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getdStart() {
        return dStart;
    }

    public void setdStart(Date dStart) {
        this.dStart = dStart;
    }

    public Date getDevolution() {
        return devolution;
    }

    public void setDevolution(Date devolution) {
        this.devolution = devolution;
    }

    public Date getdEnd() {
        return dEnd;
    }

    public void setdEnd(Date dEnd) {
        this.dEnd = dEnd;
    }

    public boolean isrSituation() {
        return rSituation;
    }

    public void setrSituation(boolean rSituation) {
        this.rSituation = rSituation;
    }
}
