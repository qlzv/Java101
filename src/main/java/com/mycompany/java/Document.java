package com.mycompany.java;

public class Document{
protected String authorName;
private int numberOfPages;
private String classificationNo;

public Document(String authorName, int numberOfPages, String classificationNo){
this.authorName = authorName;
this.numberOfPages = numberOfPages;
this.setclassificationNo(classificationNo);
System.out.println("Document constructor Invoked");
}

public void setnumberOfPages(int numberOfPages){
this.numberOfPages = numberOfPages;
}

public int getnumberOfPages(){
return numberOfPages;   
}

public void setclassificationNo(String classificationNo){
if(classificationNo.length() == 5 && (classificationNo.charAt(0) >= 'a' && classificationNo.charAt(0) <= 'z') || (classificationNo.charAt(0) >= 'A' && classificationNo.charAt(0) <= 'Z')){
this.classificationNo = classificationNo;
}else{
this.classificationNo = "00000";
System.out.println("Invalid classification number");
}
}

public String getclassificationNo(){
return classificationNo;
}

public void display(){
System.out.println("Author Name: " + authorName);
System.out.println("Number of Pages: " + numberOfPages);
System.out.println("Classification Number: " + classificationNo);
}

}
