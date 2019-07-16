package com.algogrit.java;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        AtomicInteger counter = new AtomicInteger(1);
        HashMap<Integer, Student> students = new HashMap<Integer, Student>();

        get("/students", (req, res) -> gson.toJson(students.values()));

        get("/students/:id", (req, res) -> {
            Integer studentId = Integer.parseInt(req.params(":id"));
            Student student = students.get(studentId);

            if (student == null ) {
                res.status(404);
                return null;
            }

            return gson.toJson(student);
        });

        post("/students", (req, res) -> {
            Student newStudent = gson.fromJson(req.body(), Student.class);

            Integer newId = counter.getAndIncrement();
            newStudent.setId(newId);
            students.put(newId, newStudent);

            return gson.toJson(newStudent);
        });

        put("/students/:id", (req, res) -> {
            Student updatedStudent = gson.fromJson(req.body(), Student.class);
            Integer studentId = Integer.parseInt(req.params(":id"));

            updatedStudent.setId(studentId);
            students.put(studentId, updatedStudent);

            return gson.toJson(updatedStudent);
        });

        delete("/students/:id", (req, res) -> {
            Integer studentId = Integer.parseInt(req.params(":id"));

            return gson.toJson(students.remove(studentId));
        });
    }
}
