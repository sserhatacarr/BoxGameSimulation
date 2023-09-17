public class Main {
    public static void main(String[] args) {
        Fighter mAli = new Fighter("Muhammet Ali", 15, 100, 90, 25);
        Fighter mTyson = new Fighter("Mike Tyson", 10, 85, 100, 40);
        Ring ring = new Ring(mAli, mTyson, 90, 100);
        ring.Run();
    }
}
