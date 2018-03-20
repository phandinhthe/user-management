# user-management
_ Create user
  + Method: Post
  + Url: localhost:8080/user-management/users
  + JSon body:
        {
              "firstName": "The",
              "middleName": "Dinh",
              "lastName": "Phan",
              "fullName": "The Dinh Phan",
              "birthday": "1991-03-20T20:58:11.173+0000",
              "emailAddress": "phandinhthe1991@gmail.com"
         }

_ Read all users
  + Method: Get
  + Url: localhost:8080/user-management/users

_ Read user by id
  + Method: Get
  + Url: localhost:8080/user-management/users/{id}
  
_ Update user
  + Method: Put
  + Url: localhost:8080/user-management/users
  _ JSon body:
        {
              "id": "f21ae4a8-a9f9-4e3c-ad0d-6c6ed8c05e78",
              "firstName": "The2",
              "middleName": "Dinh",
              "lastName": "Phan",
              "fullName": "The Dinh Phan",
              "birthday": "1991-03-20T20:58:11.173+0000",
              "emailAddress": "phandinhthe1991@gmail.com"
        }

_ Delete user
  + Method: Delete
  + Url: localhost:8080/user-management/users/{id}
