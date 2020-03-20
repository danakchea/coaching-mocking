public class ATMController {
    private ATMService atmService = new ATMService();

    public double getBalance()
    {
        return atmService.getBalance();
    }
}
