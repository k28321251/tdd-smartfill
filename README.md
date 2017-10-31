# Smart Fill

Difficult Level - Intermediate

## This kata focuses on:
1) Test Driven Development (TDD)
2) JAVA concepts: Interfaces, Inheritance, Generics, etc.
3) Validating rules and handling violations/exceptions.

## Rules for the kata:
1) Use the “RED – GREEN – REFACTOR” principle.
2) Try NOT to read ahead; complete the steps one-by-one as ordered.
3) Make sure that you have both positive and negative test cases.
4) Try not to use type casting.
5) Keep test coverage 100%

## Objective:
The problem that you would be solving, is to create a class of flasks: different shapes and sizes, and a container: 
any shape and size. Assuming an unlimited supply of a liquid and the flask is auto-filled every time when it is 
emptied, need to find the arrangement to fill the container with minimal iteration of flasks and the wastage (remaining
 in the last flask after the container is full), complying with certain constraints.

**NOTE: To make the calculations simple and focus on concepts, consider the dimensions to be positive integers only 
and round-off the volume to the nearest (preferably, higher) integer value.**

## Step 1
1) Create class for a cylindrical flask. Don’t worry about the different shapes.
2) Should be able to define the flask of different dimensions (diameter and height).
3) The volume of the flask should be only in multiple of 10s.

<pre><code>
   class CylindricalFlask {

      //return the volume of the flask
      int volume() {}

   }
</code></pre>

## Step 2
1) Create class for a cylindrical container. Don’t worry about the different shapes.
2) Should be able to define the container of different dimensions (diameter and height).
3) The volume of the container should be only in multiple of 10s.

<pre><code>
   class CylindricalContainer {

      //return the volume of the container
      int volume() {}

      //return the remaining capacity of the container
      int remainingCapacity() {}

      //take an amount (“quality”) of liquid and fill the container
      void fillWith(int quantity) {}

      //return TRUE if the container is full, else FALSE
      boolean isFull() {}

   }
</code></pre>

## Step 3
1) Create the “FillContainer” class
2) This will accept a cylindrical container and a cylindrical flask.
3) Should be able to fill the container using the flask.
4) Should return the no. of time the flask is used to fill the flask and the leftover in the flask after the container is full.

<pre><code>
   class FillContainer {

      //fill the container using the flask, and
      //return the wastage & no. of times the flask was used/re-filled
      *** fill() {}

   }
</code></pre>

## Step 4
1) At point, generalize flasks, containers and filler, so that you could use different shapes.
2) Should be able to define them with appropriate geometric values (say, length, breadth & height for a rectangular flask; length of a side & height for a pentagonal or hexagonal flask).

## Step 5
1) Refactor the “FillContainer” class to “SmartFill”
2) Should be able to accept a container (any shape & size) and a collection of flasks (any shape & size), at least 1 flask.
3) No two flasks should be of same volume.
4) The sum of volume of all flasks should not be more than 2/3 of the container.
5) Try to keep the wastage of liquid and the usage of flasks to be minimal.

