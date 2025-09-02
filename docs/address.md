# ADDRESS API SPEC

## Create Address
Endpoint : POST /api/contacts/{idContacts}/addresses

Request Header:
- X-API-TOKEN : Token (Mandatory)

Request Body:
```json
{
  "street": "jalan apa",
  "city" : "jakarta",
  "province": "provinsi",
  "country" :"negara",
  "postal code": "kode pos"
}
```

Response Body (Success):
```json
{
  "data": {
    "id" : "random-string",
    "street": "jalan apa",
    "city" : "jakarta",
    "province": "provinsi",
    "country" :"negara",
    "postal code": "kode pos"
  }
}
```

Response Body (Failed):
```json
{
  "error": "contact is not found"
}
```

## Update Address

Endpoint : PUT api/contacts/{idContacts}/addresses/{idAddress}

Request Header:
- X-API-TOKEN : Token (Mandatory)

Request Body: 
```json
{
  "street": "jalan apa",
  "city" : "jakarta",
  "province": "provinsi",
  "country" :"negara",
  "postal code": "kode pos"
}
```

Response Body (Success):

```json
{
  "data": {
    "id" : "random-string",
    "street": "jalan apa",
    "city" : "jakarta",
    "province": "provinsi",
    "country" :"negara",
    "postal code": "kode pos"
  }
}
```

Response Body (Failed):

```json
{
  "error": "contact is not found"
}
```


## Get Address

Endpoint : GET api/contacts/{idContacts}/addresses/{idAddress}

Request Header:
- X-API-TOKEN : Token (Mandatory)

Response Body (Success):
```json
{
  "data": {
    "id" : "random-string",
    "street": "jalan apa",
    "city" : "jakarta",
    "province": "provinsi",
    "country" :"negara",
    "postal code": "kode pos"
  }
}
```

Response Body (Failed):
```json
{
  "error": "Address is not found"
}
```


## Remove Address

Endpoint : DELETE /api/contacts/{idContacts}/addresses/{idAddress)

Request Header:
- X-API-TOKEN : Token (Mandatory)

Response Body (Success):
```json
{
  "data" : "OK"
}
```

Response Body (Failed):
```json
{
  "errors" :"contact not found"
}
```

## List Address

Endpoint : GET /api/contacts/{idContacts}/addresses

Request Header:
- X-API-TOKEN : Token (Mandatory)

Response Body (Success):
```json
{
  "data": [
    {
      "id": "random-string",
      "street": "jalan apa",
      "city": "jakarta",
      "province": "provinsi",
      "country": "negara",
      "postal code": "kode pos"
    } 
  ]
}
```

Response Body (Failed):
```json
{
  "errors" :"Contact not found"
}
```

