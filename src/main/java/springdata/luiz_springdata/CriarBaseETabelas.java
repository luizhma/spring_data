package springdata.luiz_springdata;

import javax.persistence.Persistence;

public class CriarBaseETabelas {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("usjtPU");
    }
}
