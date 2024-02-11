import java.util.logging.Logger;

public class ComCal implements Calculator {
    private Logger log;

    public ComCal(Logger log){
        this.log = log;
    }

    @Override
    public ComplexNumder add(ComplexNumder n1, ComplexNumder n2) {
        ComplexNumder result = n1.add(n2);
        log.log(null, "Cложение: " + n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumder multiply(ComplexNumder n1, ComplexNumder n2) {
        ComplexNumder result = n1.multiplication(n2);
        log.log(null, "Умножение: " + n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumder divide(ComplexNumder n1, ComplexNumder n2) {
        ComplexNumder result = n1.divide(n2);
        log.doLog("Деление: " + n1 + " / " + n2 + " = " + result);
        return result;
    }



}
