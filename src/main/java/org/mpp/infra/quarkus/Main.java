package org.mpp.infra.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.logging.Logger;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Logger.getLogger("MAIN").info("INICIANDO A API TESTANDO O OPENFGA");
        Quarkus.run(args);
    }
}
