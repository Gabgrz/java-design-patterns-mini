# Java Design Patterns Mini

A collection of essential design patterns implemented in Java.

## Patterns Included

### Singleton Pattern
- **SimpleSingleton**: Basic singleton with lazy initialization
- **BillPughSingleton**: Thread-safe singleton using static inner class (Initialization on demand holder)

### Factory Pattern
- **AppFactory**: Creates different app types based on environment
- **App**: Abstract base class for applications
- **Concrete Apps**: AndroidApp, iOSApp, DesktopApp, WatchApp, FlutterApp

## Running the Examples

Each pattern includes a `main` method for demonstration:

```bash
# Singleton examples
cd java/SingletonExample/src && javac com/company/SimpleSingleton.java && java com.company.SimpleSingleton
cd java/bill-pugh-singleton/src && javac com/company/BillPughSingleton.java && java com.company.BillPughSingleton

# Factory pattern example
cd java/factory-pattern/src && javac com/company/*.java && java com.company.GrzAppCatalog
```

## Project Structure
```
java/
├── SingletonExample/          # Basic singleton implementation
├── bill-pugh-singleton/       # Thread-safe singleton
└── factory-pattern/           # Factory pattern with app creation
```
