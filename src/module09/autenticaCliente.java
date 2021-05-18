package module09;

public interface autenticaCliente {
    default boolean autentica(long cpf) {
        if (this.cpf != cpf){
            return false;
        } else {
            return true;
        }
    }
}
