# Shipping Quote Calculator

## Cost Formula

Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
int finalCost = baseCost + (weight * weightRate) + (sizeFactor * sizeRate)
The weight and 
```
Size factor selected (choose at least one):
- sqrt(volume)
- surface area: 2(lw + lh + wh) 
- longest side: max(length, width, height)
- density: weight / volume
- cube root: volume^(1/3)
- perimeter of footprint: 2(length + width)
- other:

Brief justification (2–4 sentences):
We will use surface area as the size factor since it account for the total size.
---

## Method List (at least 5)

For each method, keep it short. Include only:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type

Method 1: Compute the volume
- description: This method will multiply the length by the width
- inputs: Length, width
- output: length * width
- return type: Double

Method 2: This method will multiply the length by the height
- description:
- inputs: Length, Height
- output:Length * Height
- return type: Double

Method 3: This method will multiply the width by the height
- description:
- inputs: width, height
- output: width * height
- return type: Double

Method 4: Surface area (Size Factor)
- description: Adds all inputs together and multiplies by 2
- inputs: Lw, Lh, Wh
- output: 2(Lw + Lh + Wh)
- return type: int

Method 5:
- description: Discount 
- inputs: sizeFactor
- output: True or False
- return type: Boolean

Method 6:
- description: Perform cost calculation
- inputs: Base cost, weight, weightRate, sizeFactor, sizeRate
- output: finalCost
- return type: double