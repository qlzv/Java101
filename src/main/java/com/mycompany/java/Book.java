package com.mycompany.java;

public class Book extends Document{
private String subject;
private int yearOfPublishing;

public Book(String authorName, int numberOfPages, String classificationNo, String subject, int yearOfPublishing){
super(authorName, numberOfPages, classificationNo);
this.subject = subject;
this.yearOfPublishing = yearOfPublishing;
}

public void display(){
System.out.println("Subject : " + subject);
System.out.println("Year of Publishing : " + yearOfPublishing);
}

public boolean checkYear(int year){
return this.yearOfPublishing >= year;
}

public boolean equals(Book book){
return (this.subject == book.subject);
}

}

