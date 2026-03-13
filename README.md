# Simple Notes Application

A simple notes application built with **Spring Boot (backend)** and **Angular (frontend)**.
Users can create, view, and delete notes. Notes are stored temporarily in memory without using a database.

---

## Tech Stack

**Backend**

* Java
* Spring Boot

**Frontend**

* Angular
* Bootstrap

---

## API Endpoints

| Method | Endpoint          | Description        |
| ------ | ----------------- | ------------------ |
| GET    | `/api/notes`      | Retrieve all notes |
| POST   | `/api/notes`      | Create a new note  |
| DELETE | `/api/notes/{id}` | Delete a note      |

---

## How to Run

### Backend

```bash
mvn spring-boot:run
```

Server will run at:

```
http://localhost:8000
```

### Frontend

```bash
npm install
ng serve
```

Open the application at:

```
http://localhost:4200
```

---

## Screenshots

### Validation Error

![Validation Error](screenshots/validation.png)

### Get Notes

![Get Notes](screenshots/get.png)

### Create Note

![Create Note](screenshots/add.png)

### Delete Note

![Delete Note](screenshots/delete.png)

### Empty Notes Page

![Empty Notes](screenshots/empty.png)

### Notes List

![Notes List](screenshots/6notes.png)
