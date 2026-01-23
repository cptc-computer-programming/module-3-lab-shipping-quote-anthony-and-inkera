# Shipping Quote Calculator  

I am making a change to the design file

## Problem Description

You are building a program that generates a shipping quote for a package using its physical measurements.

Your program must start with a single package defined in `main` using:

- weight in pounds  
- length in inches  
- width in inches  
- height in inches  

From these values, your program must compute and display:

1. volume (in³)  
2. size factor (your chosen size-based measurement)  
3. final estimated shipping cost  

The exact cost formula is up to you, but it must follow this required structure:

Your formula must include *all three components*:

1. a base cost  
2. a weight component  
3. a size component  

General form:

``` java
finalCost = baseCost
        + (weight * weightRate)
        + (sizeFactor * sizeRate)
```


You may add extra terms, but these three parts are required.

---

### Size Factor Options (choose at least one)

The size factor is a single value computed from the package dimensions that represents how much space or handling difficulty the package adds to the shipping cost.

It is used so that large or awkward packages cost more to ship, even if they are not very heavy, because they take up more space and are harder to handle.

You may use one or more of the following, or create your own.

1. Square root of volume  
   `sizeFactor = √(volume)`

2. Surface area  
   `sizeFactor = 2(lw + lh + wh)`

3. Longest side  
   `sizeFactor = max(length, width, height)`

4. Density  
   `sizeFactor = weight ÷ volume`

5. Cube root of volume  
   `sizeFactor = volume^(1/3)`

6. Perimeter of the box footprint  
   `sizeFactor = 2(length + width)`

You must explain in `DESIGN.md` which size factor(s) you chose and why.

---

## Phase 1: Design 

Before you write any Java code, you must commit to a file named `DESIGN.md`.

Your `DESIGN.md` will include:

### 1. Cost Formula Description
Explain, in words and math, how your program will calculate the final shipping cost.

Include:
- what factors you use (weight, volume, longest side, etc.)
- how each factor changes the cost
- the full formula written in math or pseudocode

### 2. Method Plan
Create a list of your planned methods.

For each method, include:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type

---

## Phase 2: Coding (Paired Programming)

You will implement your design in Java using a single class with a `main` method.

Rules:

- Work in pairs  
- Both students must commit code  
- There must be multiple commits from each partner  
- Commits must show editing DESIGN.md before writing code

---

## Program Requirements

Your program must:

- Use constants in `main` to define:  
  - weight  
  - length  
  - width  
  - height  

- Compute and print:
  - volume  
  - size factor  
  - final estimated shipping cost  

- Use at least two `Math` methods  

Your design must include:
- at least one method returning `int`  
- at least one method returning `double`  
- at least one method returning `boolean`  
- at least five total methods  
- parameters for every method  

---

## Submission Checklist

- `DESIGN.md` with formula and method plan  
- Java file with a working program  
- Git history showing multiple commits from both partners  
