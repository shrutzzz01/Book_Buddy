package model;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isRead;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean getRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String toString() {
        return ("Book name " + title
                + ", Book Author " + author
                + ", Book Genre " + genre
                + ", Book Status " + isRead);
    }
}
