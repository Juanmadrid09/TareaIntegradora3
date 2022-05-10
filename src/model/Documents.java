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




    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return int [][] return the image
     */
    public int [][] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(int [][] image) {
        this.image = image;
    }

}