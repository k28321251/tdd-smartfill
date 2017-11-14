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
The problem that you would be solving, is to create a class of <b><u>measuring flasks</u></b>: different shapes and 
sizes, and a <b><u>container</u></b>: any shape and size. Assuming an unlimited supply of a liquid and the flask is 
auto-filled every time when it is emptied, need to find the arrangement that would fill the container with 
(1) minimal the wastage (remaining in the last flask after the container is full) and (2) minimal iteration of flasks.

**Below is an example :-**

Container: cylindrical, 110 oz <br>
Flask(s) : (F1) cylindrical, 50 oz; (F2) cylindrical, 30 oz; (F3) rectangular, 20 oz. <br>

Few of the possible combinations are: <br>
[Scn#1] F1 X 3; F2 X 0; F3 X 0   => Wastage 40 oz; 3 iterations <br>
[Scn#2] F1 X 2; F2 X 0; F3 X 1   => Wastage 10 oz; 3 iterations ***[optimal]*** <br>
[Scn#3] F1 X 1; F2 X 1; F3 X 2   => Wastage 10 oz; 4 iterations <br>
[Scn#4] F1 X 0; F2 X 0; F3 X 6   => Wastage 10 oz; 6 iterations <br>

<b><u>Hints:</u></b><br><br>
Formulae to calculate the volume for few shapes that can be used:<br><br>
CYLINDRICAL => pi * R<sup>2</sup> * H; where R is radius and H is height<br><br>
RECTANGULAR => L * W * H; where L is length, W is width and H is height<br><br>
HEXAGONAL => (3&radic;3 / 2) * A<sup>2</sup> * H; where A is length of a side and H is height

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
1) Create a method “fillContainer”, under the container.
2) This will accept a cylindrical flask.
3) Should be able to fill the container using the flask.
4) Should return the no. of time the flask is used to fill the flask and the leftover in the flask after the container is full.

<pre><code>
   class CylindricalContainer {
      ...
      ...

      //fill the container using the flask, and
      //return the wastage and no. of times the flask was used/re-filled
      *** fill() {}

   }
</code></pre>

## Step 4
1) At point, generalize flasks, containers and filler, so that you could use different shapes.
2) Should be able to define them with appropriate geometric values (say, length, breadth and height for a rectangular 
flask; length of a side & height for a pentagonal or hexagonal flask).

## Step 5
1) Refactor the “fillContainer” method to “smartFill”
2) Should be able to accept a collection of flasks (any shape and size), at least 1 flask.
3) No two flasks should be of same volume.
4) The sum of volume of all flasks should not be more than 2/3 of the container.
5) Try to keep the wastage of liquid and the usage of flasks to be minimal.

### Happy Coding!!!
