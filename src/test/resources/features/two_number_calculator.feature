Feature: Two Number Calculator
    As a user
    I need a calculator
    To perform multiple operations with two numbers

    Background:
        Given that the user is in the calculator page

    Scenario Outline: Sum of two numbers
        When he perform a operation of "Add" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  | result |
            |     2        |      2        |   4    |

    Scenario Outline: Subtraction of two numbers
        When he perform a operation of "Subtract" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  | result |
            |     5        |      2        |   3    |

    Scenario Outline: Multiplication of two numbers
        When he perform a operation of "Multiply" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  | result |
            |     5        |      5        |   25   |

    Scenario Outline: Division of two numbers
        When he perform a operation of "Divide" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  | result |
            |     10       |      2        |   5    |

    Scenario Outline: Concatenation of two numbers
        When he perform a operation of "Concatenate" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  | result |
            |     1        |      1        |   11   |