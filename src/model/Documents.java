package model;

public abstract class Documents{

private double price;
private int year;
private int [][] image;



public Documents(double price, int year) {
    this.price = price;
    this.year = year;
    image= new int[4][4];


}

public void  generateImage(){

    for (int x=0; x < image.length; x++) {
        for (int y=0; y < image[0].length; y++) {
              image[x][y] = (int)(Math.random()*(100+1)+1);
              }
              }



}



}