public class ATMProcess {
    public void balance(){
        //MOSTRAR BALANCE DE LA CUENTA.
    }
    public void deposit(Account cuenta, float deposit){
        cuenta.setBalance(cuenta.getBalance()+deposit);
    }
    public boolean withdraw(Account cuenta, float withdraw){

        if(withdraw > cuenta.getBalance()){
            return false;
        }
        cuenta.setBalance(cuenta.getBalance()-withdraw);
        return true;
    }
    public boolean transfer(Account cuentaOrigen, Account cuentaDestino, float montoTrans){

        if(montoTrans > cuentaOrigen.getBalance()){
            return false;
        }
        cuentaOrigen.setBalance(cuentaOrigen.getBalance()-montoTrans);
        cuentaDestino.setBalance(cuentaDestino.getBalance()+montoTrans);
        return true;
    }
}
