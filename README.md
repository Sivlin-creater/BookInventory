# 📚 Book Inventory CRUD Form

A **Java Swing-based Book Inventory CRUD** built in **NetBeans IDE** with **MySQL (port 3304)**.
This project allows you to **add, update, delete, and view books** in a database with a simple GUI interface.

![Book Inventory Banner](images/crud_form.png)

---

## 🎯 Features

* Add new books to the inventory
* Update existing book details
* Delete books from the inventory
* View all books in a table
* Simple and intuitive **GUI**

---

## 🛠️ Technologies Used

* **Java SE** (NetBeans IDE)
* **Swing** for GUI
* **MySQL** (Port 3304)
* **JDBC** for database connectivity
* **Maven/Gradle** (optional for dependencies)

---

## 🗄️ Database Setup

1. Make sure **MySQL** is installed and running on **port 3304**.
2. Create the database:

```sql
CREATE DATABASE testdb;
USE testdb;
```

3. Create the table `tablebooks`:

```sql
CREATE TABLE tablebooks (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    publisher VARCHAR(100),
    price DECIMAL(10,2),
    quantity INT
);
```

4. Update your **DB connection** in `DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3304/testdb";
String user = "root";
String password = "";

Connection conn = DriverManager.getConnection(url, user, password);
```

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/Sivlin-creater/BookInventory.git
```

2. Open in **NetBeans IDE**
3. Make sure **MySQL** is running on **port 3304**
4. Update **DB credentials** in `DBConnection.java`
5. Run **`MainForm.java`**

---

## 🎬 Demo Video

[![Book Inventory Demo]](images/crud_video.mp4)

> Click on the image to watch the demo video.

---

## 👤 Author

* **Name:** CHHAY Sivlin
* **Email:** [sivlinchhay01@gmail.com](mailto:sivlinchhay01@gmail.com)
* **GitHub:** [Sivlin-creater](https://github.com/Sivlin-creater)

