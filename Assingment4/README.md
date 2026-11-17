

# Calculator Program – GitHub Copilot Assignment

## 1. Introduction

This project is a simple Java Calculator application developed using Java and IntelliJ IDEA.

The calculator can:
- Add positive integers.
- Add multiple positive integers.
- Reset the calculator value to zero.
- Return the current calculator value.
- Throw an exception when a negative integer is entered.

GitHub Copilot was used to explore different ways of generating Java methods and explaining existing code.

## 2. Calculator.java

```java
public class Calculator {

    private int value = 0;

    // Reset calculator to zero
    public void reset() {
        value = 0;
    }

    // Add one positive integer
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Negative numbers are not allowed"
            );
        }

        value = value + number;
    }

    // Return current calculator value
    public int getValue() {
        return value;
    }

    // Add multiple positive integers
    public void sum(int... numbers) {
        for (int number : numbers) {
            add(number);
        }
    }
}
```

## 3. CalculatorMain.java

```java
public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Add integers
        calculator.add(10);
        calculator.add(20);
        calculator.add(30);

        System.out.println("Current value: "
                + calculator.getValue());

        // Reset calculator
        calculator.reset();

        System.out.println("After reset: "
                + calculator.getValue());

        // Add multiple integers
        calculator.sum(5, 10, 15);

        System.out.println("After sum: "
                + calculator.getValue());
    }
}
```

## 4. Program Output

```text
Current value: 60
After reset: 0
After sum: 30
```

## 5. Explanation of the Calculator Class

### Private Variable

The Calculator class contains a private integer variable called `value`.

It stores the current calculator total and starts at zero. The private keyword prevents other classes from changing this variable directly.

### reset() Method

The reset() method sets the current calculator value back to zero.

### add() Method

The add() method adds one positive integer to the current value.

If a negative number is entered, it throws an IllegalArgumentException.

### getValue() Method

The getValue() method returns the current calculator value without changing it.

### sum() Method

The sum() method accepts multiple integers using `int... numbers`.

It uses a for-each loop to process each number and calls the add() method to add it to the calculator.

For example:

`calculator.sum(5, 10, 15);`

This adds 5, 10, and 15 to the current calculator value.

## 6. Task 1: Using GitHub Copilot to Write Methods

I explored three different approaches to generate the sum method using GitHub Copilot.

### Experiment 1: Writing the Method Signature

First, I wrote the method signature:

`public void sum(int... numbers)`

I left the method body empty and allowed GitHub Copilot to suggest the implementation.

Copilot provided a code suggestion. This helped me understand how Copilot can complete a method based on its signature and the surrounding code.

### Experiment 2: Writing the Method Signature and First Line

In the second experiment, I wrote the method signature and the first line of the method.

Copilot suggested an implementation using a for loop. However, the generated code contained an error because it used an undefined variable.

I reviewed the suggestion and learned that generated code is not always correct. I also explored changing the loop structure from a for loop to a while loop.

### Experiment 3: Writing an English Comment

In the third experiment, I wrote an English comment describing what the method should do.

GitHub Copilot used the comment as context and automatically suggested the sum method.

This experiment helped me understand how Copilot can use natural-language comments to generate Java code.

## 7. Task 2: Using GitHub Copilot to Explain Code

I used GitHub Copilot Chat to explain my Calculator.java and CalculatorMain.java files.

I asked Copilot to explain the private variable, methods, exception handling, and how the sum method works.

Copilot provided an explanation based on my actual Java code.

I reviewed the generated explanation and edited it to make it simpler and easier to understand.

The explanation helped me understand the following concepts:

- How a private variable stores the current calculator value.
- How reset() changes the value to zero.
- How add() adds positive integers.
- Why IllegalArgumentException is used for negative numbers.
- How getValue() returns the current value.
- How sum() processes multiple integers using a loop.

## 8. Benefits of GitHub Copilot

- It saves time when writing code.
- It provides automatic code suggestions.
- It helps explore different programming approaches.
- It can explain existing code in simple language.
- It helps beginners understand unfamiliar programming concepts.

## 9. Drawbacks of GitHub Copilot

- Generated code can contain errors.
- Suggestions may not always match the assignment requirements.
- Some generated code can be difficult for beginners to understand.
- The programmer must review and test the suggested code.
- Depending on Copilot too much can reduce independent problem-solving practice.

## 10. My Personal Experience and Evaluation

Using GitHub Copilot was a useful learning experience for me as a beginner Java programmer.

I used Copilot to generate a method in different ways, including providing a method signature, writing the first line, and describing the method using an English comment.

During the experiments, Copilot generated a suggestion that contained an undefined variable. I had to review the code and understand what was wrong.

I also used Copilot Chat to explain my Calculator class. Its explanation helped me understand how the different methods work.

I found Copilot useful because it provides ideas, saves time, and helps me explore different ways of writing code.

However, I learned that I should not accept every suggestion without checking it. I need to understand, test, and correct the code myself.

For my coding style, GitHub Copilot is a helpful assistant, especially when I am learning something new. However, I prefer to understand the programming logic and make the final decisions myself.

Overall, GitHub Copilot is useful for programming and learning, but it works best when combined with the programmer's own knowledge and problem-solving skills.

## 11. Conclusion

This assignment helped me practise Java methods, loops, exceptions, and object creation.

It also gave me practical experience using GitHub Copilot for code generation and code explanation.

I learned that AI-generated code can save time and provide useful suggestions, but it must always be reviewed, tested, and understood before using it.
