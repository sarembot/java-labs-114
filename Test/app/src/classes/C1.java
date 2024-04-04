package classes;

//default visibility makes this class accessible from just the 'classes' package
class C1 {

    // private keyword makes x unaccessible outside of the C1 class
    private int x;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }
    

    //create a getter and setter for x to be able to access it outside of class

    

}
