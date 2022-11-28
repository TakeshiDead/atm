public class ATMProcess {
    public void balance(){
        //MOSTRAR BALANCE DE LA CUENTA.
    }
<<<<<<< HEAD
    public void deposit(){
        //SUMAR DEPOSITO + Balance
    }
    public void withdraw(){
        //RESTAR AL BALANCE ACTUAL.
        //VALIDAR QUE EL RETIRO < BALANCE.
    }
    public void transfer(){
        //RESTAR AL BALANCE ACTUAL
        //SUMAR A OTRA CUENTA.
        //VALIDAR QUE LA TRANSFERENCIA < BALANCE.
=======
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
>>>>>>> f154b9ec811033d611f63204c28cd5139b081a3c
    }
}
