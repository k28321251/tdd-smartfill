package com.tdd.smartfill;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.runner.notification.Failure;

public final class CylindricalFlaskTest {

    @Test
    public void shouldCalculateCylindriccalVolume() {
        CylindricalFlask cylindricalFlask = new CylindricalFlask();
        final int radius = 6;
        final int height = 3;
        final int actualVolume = cylindricalFlask.shouldCalculateVolumeOfACylinder(radius, height);
        final int expectedVolume = 340;
        Assert.assertThat(actualVolume, Is.is(expectedVolume));

    }

    @Test(expected = AssertionError.class)
    public void shouldCalculateCylindriccalVolumeTwo() {
        CylindricalFlask cylindricalFlask = new CylindricalFlask();
        final int radius = 3;
        final int height = 10;
        final int expectedVolume = cylindricalFlask.shouldCalculateVolumeOfACylinder(radius, height);
        final int actualVolume = 282;
        Assert.assertThat(actualVolume, Is.is(expectedVolume));

    }


}
