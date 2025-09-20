# Software Design & Architecture Assignment 1 (Smart Home Devices)

Author(s): Kingsley Qiu, Farhan Shameer, Aaraan Mahmood

> This project uses the application of the Abstract Factory and Factory design patterns, and uses them to create smart home devices for a given brand.
> To accomplish this, we created a interface class to implement both factories, and create the devices

---

## Repository Contents

- `uml_diagram/` -> Contains the class diagrams and any other designs we might have used (`.png`, `.svg`, or `.uml` files)
- factory (`interface`) Declares the make() method and acts as the product interface that all concrete products (bulb, lock) must implement.
- bulb (`concrete product`) Implements factory, represents a bulb, and defines how it uses battery power and is created.
- lock (`concrete product`) Implements factory, represents a lock, and defines how it uses power and is created.
- orders (`abstract creator`) Declares the factory method createparts() and provides the template orderparts() for creating and initializing products.
- bulborders (`concrete creator`) Extends orders and implements createparts() to produce bulb objects.
- lockorders (`concrete creator`) Extends orders and implements createparts() to produce lock objects.
- test (`client`) Contains main() and demonstrates ordering products using the factory classes.
---

