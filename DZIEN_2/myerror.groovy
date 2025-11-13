//InvalidEmailException - moja własna nazwa!!! -> dziedziczenie RuntimeException czyni naszą klasę
//klasą błędu

class InvalidEmailException extends RuntimeException {
    InvalidEmailException(String msg) {super(msg)}
}

def validateEmail = {email ->
    if(!(email instanceof String) || !email.contains("@"))
        throw new InvalidEmailException("Niewłaściwy format emaila... ")
    true
}

def caught = null
try {
    validateEmail(54649895)
}
catch (InvalidEmailException e){
    caught = e.message
    println(caught)
}

