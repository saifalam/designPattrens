package com.saif.dp.observer.pattern.observers;

import com.saif.dp.observer.pattern.subject.Subject;

/**
 * Created by saif on 27.11.16.
 */
public class ForecastDispaly implements Observer, DispalyElement {

    private Subject weatherData;

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    @Override
    public void dispaly() {

    }
}