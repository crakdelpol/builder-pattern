# builderpattern
Example of builder battern

The Builder Design Pattern is a creational pattern designed to deal with the construction of comparatively complex objects.

When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

This builder can then be used to create many other similar representations using a simple step-by-step approach.

When to Use Builder Pattern
  - When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
  - When an increase in the number of constructor parameters leads to a large list of constructors
  - When client expects different representations for the object that’s constructed
