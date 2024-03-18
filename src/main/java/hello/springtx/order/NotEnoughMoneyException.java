package hello.springtx.order;

// Exception 상속 받은 체크예외이므로 롤백하지 않는다!
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
