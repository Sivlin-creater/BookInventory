# 📚 Book Inventory Management Form

A **Java Swing-based Book Inventory Management System** built in **NetBeans IDE** with **MySQL (port 3304)**.
This project allows you to **add, update, delete, and view books** in a database with a simple GUI interface.

![Book Inventory Banner](Screenshot 2026-0)
Screenshot 2026-02-03 221854.png
---

## 🎯 Features

* Add new books to the inventory
* Update existing book details
* Delete books from the inventory
* View all books in a table
* Search books by **Title**, **Author**, or **ID**
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
String password = "yourpassword";

Connection conn = DriverManager.getConnection(url, user, password);
```

---

## 🗂️ Project Structure

```
BookInventory/
│
├─ src/
│   ├─ db/DBConnection.java        # Database connection
│   ├─ ui/MainForm.java            # GUI form
│   ├─ model/Book.java             # Book model
│   ├─ dao/BookDAO.java            # CRUD operations
│   └─ utils/Utils.java            # Helper methods
│
├─ lib/                           # External libraries
├─ images/                        # Screenshots & banners
├─ videos/                        # Demo videos
├─ README.md
└─ BookInventory.nbproj            # NetBeans project file
```

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/your-username/BookInventory.git
```

2. Open in **NetBeans IDE**
3. Make sure **MySQL** is running on **port 3304**
4. Update **DB credentials** in `DBConnection.java`
5. Run **`MainForm.java`**

---

## 📷 Screenshots

**Main Dashboard**
![Dashboard](images/dashboard.png)

**Add Book Form**
![Add Book](images/add_book.png)

**Book Table View**
![Book Table](images/table_view.png)

---

## 🎬 Demo Video

[![Book Inventory Demo](images/video_thumbnail.png)](videos/demo.mp4)

> Click on the image to watch the demo video.

---

## 📝 Future Improvements

* Add **user authentication** (Admin/User)
* Export to **Excel/PDF**
* Add **advanced search and filters**
* Improve UI with **JavaFX**

---

## 👤 Author

* **Name:** Your Name
* **Email:** [your.email@example.com](mailto:your.email@example.com)
* **GitHub:** [your-github](https://github.com/your-github)

---

✅ This README is **ready for GitHub**. Just replace the images in `images/` folder and the video in `videos/` folder.

---

If you want, I can **also create ready-to-use images and a demo video guide** for your project so you can just drop them into GitHub.

Do you want me to do that next?
