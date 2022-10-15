public class CatchupExeception {
    public void throwExeception() {
        int x = 0;
        int y = 1;
        if (x != y) {
            throw new IllegalStateException("throw a StateException");
        }
    }
}
