package com.rp.sec01;

import courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Lec05MonoFromSupplier {
    public static void main(String[] args) {

        // Use just method only when you have data already
        // Mono<String> mono = Mono.just(getName());

        // Use supplier instead

        Supplier<String> stringSupplier = () -> getName();
        Mono<String> mono = Mono.fromSupplier(stringSupplier);

        mono.subscribe(Util.onNext());

        Callable<String> stringCallable = () -> getName();
        Mono.fromCallable(stringCallable)
                .subscribe(Util.onNext());
    }

    private static String getName() {
        System.out.println("Generating name...");
        return Util.faker().name().fullName();
    }
}
