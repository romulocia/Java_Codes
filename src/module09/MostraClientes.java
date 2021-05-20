package module09;

import java.util.function.Consumer;

public class MostraClientes implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
