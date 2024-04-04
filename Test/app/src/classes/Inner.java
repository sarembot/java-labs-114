package classes;

public class Outer {
    private int outerX;

    class Inner {
        private int x; // Inner classes cannot have their own static variables - except if we use final keyword

        public Inner(int x) {
            this.x = x;
        }

        public int getX(){
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        
    }
    
}
