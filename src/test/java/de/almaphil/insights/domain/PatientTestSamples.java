package de.almaphil.insights.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PatientTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Patient getPatientSample1() {
        return new Patient().id(1L).name("name1").age(1).gender("gender1").health("health1").geo("geo1");
    }

    public static Patient getPatientSample2() {
        return new Patient().id(2L).name("name2").age(2).gender("gender2").health("health2").geo("geo2");
    }

    public static Patient getPatientRandomSampleGenerator() {
        return new Patient()
            .id(longCount.incrementAndGet())
            .name(UUID.randomUUID().toString())
            .age(intCount.incrementAndGet())
            .gender(UUID.randomUUID().toString())
            .health(UUID.randomUUID().toString())
            .geo(UUID.randomUUID().toString());
    }
}
