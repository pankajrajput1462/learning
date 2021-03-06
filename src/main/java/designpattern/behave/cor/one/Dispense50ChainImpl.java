package designpattern.behave.cor.one;

public class Dispense50ChainImpl implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextChain.dispense(currency);
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }
}
