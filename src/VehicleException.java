public class VehicleException extends Exception {
    public VehicleException(String message) {
        super(message);
    }

    public VehicleException(Throwable cause) {
        super(cause);
    }

    public VehicleException(String message, Throwable cause) {
        super(message, cause);
    }
}
