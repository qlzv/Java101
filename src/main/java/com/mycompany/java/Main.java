package com.mycompany.java;

/*
Github repository : https://github.com/qlzv/Java101
Author : Qatada Azzeh
At : 5/1/2024
*/

public class Main {
public static void main(String[] args) {
Book book1 = new Book("John Doe", 200, "11234", "Science", 2010);
Book book2 = new Book("Jane Doe", 300, "B5678", "Math", 2020);
book1.display();
book2.display();

if(book1.equals(book2)){
System.out.println("Equal");
}else{
System.out.println("Not Equal");
}

System.out.println("Book1 Check Year Result : " + book1.checkYear(2019));
System.out.println("Book2 Check Year Result : " + book2.checkYear(2019));
}
}
