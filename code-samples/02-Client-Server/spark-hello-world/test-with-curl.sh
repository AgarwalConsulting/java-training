#!/usr/bin/env bash

# GET /students
curl 'http://localhost:4567/students'

# GET /students/:id
curl 'http://localhost:4567/students/1'

# POST
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"firstName": "Gaurav", "lastName": "Agarwal", "phoneNumber": "1234567890"}' \
  http://localhost:4567/students

# PUT
curl --header "Content-Type: application/json" \
  --request PATCH \
  --data '{"firstName": "Gaurav", "lastName": "Agarwal", "phoneNumber": "1234567890"}' \
  http://localhost:4567/students/1

# DELETE
curl --header "Content-Type: application/json" \
  --request DELETE \
  http://localhost:4567/students/0
