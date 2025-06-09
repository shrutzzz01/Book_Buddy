# 📚 Book Buddy – Java Console Application

**Book Buddy** is a console-based Java application that allows users to manage their personal book collection. It supports adding, viewing, filtering, and updating book information. The project is built using object-oriented principles and follows SOLID design principles.

---

## ✨ Features

- 📖 Add a new book (title, author, genre)
- 📃 View all books
- ✅ Filter books by read/unread status
- 🔍 Filter books by genre
- 🔄 Mark a book as read or unread
- ✅ Clean code with layered architecture
- 💡 Follows SOLID design principles

---

## 🧱 Project Structure

BookBuddy/
├── model/ # Book data class
│ └── Book.java
├── repository/ # Interface + in-memory storage
│ ├── BookRepository.java
│ └── InMemoryBookRepository.java
├── service/ # Business logic layer
│ └── BookService.java
├── ui/ # Console UI interaction
│ └── ConsoleUI.java
└── Main.java # Entry point


---

## 🚀 How to Run

### 🖥️ Compile:

```bash
javac model/*.java repository/*.java service/*.java ui/*.java Main.java
```

## SAMPLE OUTPUT
---
....BOOK BUDDY....
1. Add a Book
2. View All Books
3. View Read Books
4. View Unread Books
5. Filter by Genre
6. Mark Book as Read
7. Mark Book as Unread
8. Exit
------------------
Enter your choice:
