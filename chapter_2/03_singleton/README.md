# Singleton

- The contructor should be private in opposition to popular convention. This is done to prevent making more instances by the clients.
- Create an instance of the singleton class inside the class with access modifiers `static`, `final` and `public`. This instance is used by all the clients.
- Needs security against de/serialization to prevent more instances.
- There are two ways for creating Singleton classes:
    1. Public Field Approach: Shown by CameraDriver1
    2. Static Factory: Shown by CameraDriver2
    3. Single Element Enum: Shown by CameraDriver3