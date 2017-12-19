package com.tdd.smartfill;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public final class CylindricalContainerTest {
    @Test
    public void shouldCalculateCylindriccalVolume() {
        int raduis =6;
        int height =3;
        CylindricalContainer cylindricalContainer = new CylindricalContainer(raduis,height);
        final double expectedVolume = cylindricalContainer.shouldCalculateVolumeOfACylinder();
        final double actualVolume = 340;
        Assert.assertThat(actualVolume, Is.is(expectedVolume));

    }

    @Test(expected = AssertionError.class)
    public void shouldCalculateCylindriccalVolumeTwo() {
        int raduis =6;
        int height =3;
        CylindricalContainer cylindricalContainer = new CylindricalContainer(raduis,height);
        final double expectedVolume = cylindricalContainer.shouldCalculateVolumeOfACylinder();
        final double actualVolume = 282;
        Assert.assertThat(actualVolume, Is.is(expectedVolume));

    }

    @Test
    public void shouldReturnRemainingQuantity() {
        int raduis =6;
        int height =3;
        CylindricalContainer cylindricalContainer = new CylindricalContainer(raduis,height);
        final int quantity =5;
        cylindricalContainer.fillWith(quantity);
        final int actualCapacity = cylindricalContainer.remainingCapacity();
        final int expectedCapacity =335;
        Assert.assertThat(actualCapacity,Is.is(expectedCapacity));
    }

    @Test
    public void shouldReturnRemainingCapacity() {
        int raduis =6;
        int height =3;
        CylindricalContainer cylindricalContainer = new CylindricalContainer(raduis,height);
        int expectedCapacity =340;
        final int actualCapacity = cylindricalContainer.remainingCapacity();
        Assert.assertThat(actualCapacity,Is.is(expectedCapacity));

    }

    @Test
    public void verifyIfContainerIsFullOrNot(){
        int raduis =6;
        int height =3;
        CylindricalContainer cylindricalContainer = new CylindricalContainer(raduis,height);
        cylindricalContainer.fillWith(340);
        final int capacity = cylindricalContainer.remainingCapacity();
        final boolean fullOrNot = cylindricalContainer.isFull();
        Assert.assertTrue(fullOrNot);
    }
    @Test(expected = AssertionError.class)
    public void verifyIfContainerIsFullOrNotFailureTest(){
        int raduis =6;
        int height =3;
        CylindricalContainer cylindricalContainer = new CylindricalContainer(raduis,height);
        cylindricalContainer.fillWith(30);
        final int capacity = cylindricalContainer.remainingCapacity();
        final boolean fullOrNot = cylindricalContainer.isFull();
        Assert.assertTrue(fullOrNot);
    }

 }