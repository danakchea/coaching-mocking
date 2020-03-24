public class ATMController {

    public ATMController ( ATMService atmService ) {
        this.atmService = atmService;
    }

    public ATMController ( ATMService atmService , boolean isATM ) {
        this.atmService = atmService;
        this.isATM = isATM;
    }

    private ATMService atmService;
    boolean isATM = true;

    public double getBalance() {
        if (isATM) {
            return atmService.getBalance();
        }
       return 0.00;
    }
}
