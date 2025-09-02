# USER API SPEC

## Register User

Endpoint : POST /api/users

Request Body :

```json
{
  "username": "rayhanmkm",
  "password": "rahasia",
  "name": "Muhammad Rayhan Atallah"
}
```
Response Body (Success):
```json
{
  "data": "OK"
}
```
Response Body (Failed):
```json
{
  "erorrs": "Username must not blank, ???"
}
```

## Login User
Endpoint : POST /api/auth/login

Request Body :

```json
{
  "username": "rayhanmkm",
  "password": "rahasia"
}
```
Response Body (Success):
```json
{
  "data": {
    "token" : "TOKEN",
    "expiredAt": 23234234234
  }
  
}
```
Response Body (Failed, 401):
```json
{
  "erorrs": "Username or Password is wrong"
}
```

## Get User
Endpoint : GET /api/users/current

Request Header:

- X-API-TOKEN : Token (Mandatory)


Response Body (Success):
```json
{
"data" : {
"username" : "rayhanmkm",
"name" : "Muhammad Rayhan Atallah"
}
}
```
Response Body (Failed, 401):
```json
{
  "erorrs": "Unauthorized"
}
```


## Update User
Endpoint : PATCH /api/auth/login

Request Header:

- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "name" : "Rayhan Atallah",
  "password" : "new password" 
}
```

Response Body (Success):
```json
{
"data" : {
"username" : "rayhanmkm",
"name" : "Muhammad Rayhan Atallah"
}
}
```

Response Body (Failed, 401):
```json
{
  "erorrs": "Unauthorized"
}
```

##Logout User

Endpoint : DELETE /api/auth/logout

Request Header:

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):
```json
{
"data" : "OK"
}
```