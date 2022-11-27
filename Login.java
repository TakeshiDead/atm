public class Login {

    public Account validatePin(int pin){

        for (Account cuenta : Main.cuentas) {
            if(pin == cuenta.getPin()){
                return cuenta;
            }
        }
        return null;
    }
}
