package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        FullName fullName = new FullName("Sithira","Roneth");
        student.setId(String.valueOf(1));
        student.setName(fullName);
        student.setAddress("Malabe");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        //session.update(student);
        //session.delete(student);
        //session.get(Student.class,1);

        transaction.commit();
        session.close();
    }
}