package Clase10;

public class ClassAccount {
    private Integer _accountNumber;
    private String _accountOwner;
    private Float _accountBalance;

    public Integer get_accountNumber() {
        return _accountNumber;
    }

    public Float get_accountBalance() {
        return _accountBalance;
    }

    public String get_accountOwner() {
        return _accountOwner;
    }

    public void set_accountNumber(Integer _accountNumber) {
        this._accountNumber = _accountNumber;
    }

    public void set_accountBalance(Float _accountBalance) {
        this._accountBalance = _accountBalance;
    }

    public void set_accountOwner(String _accountOwner) {
        this._accountOwner = _accountOwner;
    }

    public void _getAccountData() {
        System.out.println("Numero de Cuenta: " + this._accountNumber);
        System.out.println("Titular de la cuenta: " + this._accountOwner);
        System.out.println("Balance actual: " + this._accountBalance);
    }

    public void _setAccountDeposit(Float _depositAmountParm){
        this._accountBalance = this._accountBalance + _depositAmountParm;
    }

    public void _setAccountWithdrawal(Float _withdrawAmountParm){
        this._accountBalance = this._accountBalance - _withdrawAmountParm;
    }
}

