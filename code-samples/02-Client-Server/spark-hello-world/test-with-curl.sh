#!/usr/bin/env bash

# GET /students
printf "Testing... GET /students: \n"
curl 'http://localhost:4567/students'

# POST
printf "\n\nTesting... POST /students: \n"
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"firstName": "Gaurav", "lastName": "Agarwal", "phoneNumber": "1234567890"}' \
  http://localhost:4567/students

# GET /students/:id
printf "\n\nTesting... GET /students/1: \n"
curl 'http://localhost:4567/students/1'

# PUT
printf "\n\nTesting... PUT /students/1: \n"
curl --header "Content-Type: application/json" \
  --request PUT \
  --data '{"firstName": "Gaurav", "lastName": "Agarwal", "phoneNumber": "+91876543210"}' \
  http://localhost:4567/students/1

# PATCH
printf "\n\nTesting... PATCH /students/1: \n"
curl --header "Content-Type: application/json" \
  --request PATCH \
  --data '{"phoneNumber": "+91876543210"}' \
  http://localhost:4567/students/1

# DELETE
printf "\n\nTesting... DELETE /students/1: \n"
curl --header "Content-Type: application/json" \
  --request DELETE \
  http://localhost:4567/students/1

printf "\nCompleted!\n"
