# BookTitleJava

**BookTitleJava** is a simple Java console application that demonstrates the use of the `Stack` and `Queue` data structures. The program accepts four book titles from the user, stores them in a stack, and transfers them into a queue by removing the most recently entered title first.

This project is designed for beginners learning Java collections and the differences between stack and queue operations.

## Features

- Accepts four book titles through console input.
- Stores book titles using Java's `Stack<String>`.
- Removes titles from the stack using the `pop()` method.
- Transfers the removed titles into a `Queue<String>`.
- Displays the resulting order of book titles.
- Demonstrates the LIFO behavior of a stack and the FIFO behavior of a queue.

## Requirements

- Java Development Kit (JDK) 21
- Maven
- A Java-compatible IDE, such as NetBeans, or a terminal

## Project Structure

```text
BookTitleJava/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── booktitle/
                        └── BookTitle.java
```

## How It Works

1. The program prompts the user to enter four book titles.
2. Each title is added to the `books` stack using `push()`.
3. The program removes titles from the stack using `pop()`.
4. Each removed title is added to the `newOrder` queue.
5. The program displays the queue containing the titles in their new order.

Because a stack follows **Last In, First Out (LIFO)**, the fourth title entered is removed first. The queue then preserves the order in which the titles were added to it.

## Example

Suppose the user enters these titles:

```text
Book 1: The Hobbit
Book 2: Harry Potter
Book 3: The Little Prince
Book 4: The Alchemist
```

The resulting output is:

```text
New order of books:
[The Alchemist, The Little Prince, Harry Potter, The Hobbit]
```

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/ichiroyamazaki/BookTitleJava.git
cd BookTitleJava
```

### 2. Compile the Project

```bash
mvn compile
```

### 3. Run the Application

```bash
mvn exec:java
```

The project configures `com.mycompany.booktitle.BookTitle` as its main class. You can also open the project in a compatible Java IDE and run the `BookTitle` class directly.

## Concepts Demonstrated

- **Stack:** Stores book titles and removes them in LIFO order.
- **Queue:** Stores the titles removed from the stack.
- **`push()`:** Adds a title to the stack.
- **`pop()`:** Removes and returns the top title from the stack.
- **`add()`:** Adds a title to the queue.
- **`isEmpty()`:** Checks whether the stack still contains titles.
- **Scanner:** Reads book titles from the console.

## Limitations

- The program accepts exactly four book titles.
- The titles are not saved after the application closes.
- The program does not provide book searching, editing, or deletion features.
- The queue is used to demonstrate collection operations rather than a complete library-management workflow.

## Author

**Ichiro Yamazaki**

## License

No license is specified in this repository. Check the repository for licensing information before redistributing or modifying the project.
