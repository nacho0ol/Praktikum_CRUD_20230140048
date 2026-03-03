## Hasil Code
* Post
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e979ae84-75f3-4e8f-a653-95c691469d75" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ebe460a1-c676-45b3-927a-2d894070ea67" />

* Put
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/a4000e06-e0d6-4f1d-84c4-18e81227ddbd" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/5490ab87-95a0-4c4b-990f-4c50418997e9" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/72ec4e46-3ed3-4f6b-9e55-23bef9fe81a9" />

 * Delete
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/81d51bcd-0921-4eaf-a2d5-17007b0c526f" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/bdb4853a-7f19-4354-bd9b-40b380d10308" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/0fd62e97-c7f1-4634-a945-5dc7da5759d2" />



## 1. Create / Add
Menambahkan data user baru ke dalam database. ID akan di-*generate* secara otomatis menggunakan format UUID.

* URL: /api/users
* Method: POST
* Header:
    * Content-Type: application/json
    * Accept: application/json

Request Body
```json
{
    "name": "Nachma Olivia",
    "age": 19
}
```
Hasil Sukses
```json
{
    "status": "success",
    "data": {
        "id": "94300e85-6a2c-40b4-b6bf-b2cde33d6163",
        "name": "Nachma Olivia",
        "age": 19
    }
}
```
## 2. Get Data
Mendapatkan daftar seluruh user yang ada di dalam database.

---

* URL: /api/users
* Method: GET
* Header:
    * Accept: application/json

Hasil Sukses
```json
{
    "status": "success",
    "data": [
        {
            "id": "07805318-1c6c-42fe-aa2d-d05a54ad43f4",
            "name": "agus",
            "age": 21
        },
        {
            "id": "94300e85-6a2c-40b4-b6bf-b2cde33d6163",
            "name": "Nachma Olivia",
            "age": 19
        }
    ]
}
```

## 3.Update Data
Memperbarui nama dan/atau umur dari user yang sudah ada di database berdasarkan ID.

---

* URL: /api/users/id
* Method: PUT
* Header:
    * Content-Type: application/json
    * Accept: application/json
* Path : ID (UUID) dari user yang ingin diperbarui.

Request Body
```json
{
    "name": "Supri (Update)",
    "age": 19
}
```

Hasil Sukses
```json
{
    "status": "success",
    "data": {
        "id": "07805318-1c6c-42fe-aa2d-d05a54ad43f4",
        "name": "Supri (Update)",
        "age": 19
    }
}
```

## 4. Delete Data
Menghapus data user dari database berdasarkan ID.

---

* URL: /api/users/id
* Method: DELETE
* Header:
    * Content-Type: application/json
    * Accept: application/json
* Path: ID (UUID) dari user yang ingin dihapus.

Hasil Jadi
```json
{
    "status": "success delete user with id 07805318-1c6c-42fe-aa2d-d05a54ad43f4"
}
```
