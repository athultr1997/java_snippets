# The Builder Pattern for creating classes

> The user-defined constructor of the original class is kept private, since only the builder will access it. The default public one is used by the clients.

> The Builder class is kept public for easy access by clients.

> The variables inside the Builder class should be private so that it can't be accessed by the clients.