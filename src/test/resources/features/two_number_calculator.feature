Feature: Two Number Calculator
    As a user
    I need a calculator
    To perform multiple operations with two numbers

    Background:
        Given that the user is in the calculator page

    @Sum
    Scenario Outline: Sum of two numbers: "<firstNumber>" and "<secondNumber>"
        When he perform a operation of "Add" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber | result |
            |       2      |       2      |     4  |
            |     -15      |     -35      |   -50  |
            |    -100      |     100      |     0  |
            |     2.2      |     3.4      |   5.6  |
            |     10       |              |   10   |
            |              |              |    0   |

    @Substraction
    Scenario Outline: Subtraction of two numbers: "<firstNumber>" and "<secondNumber>"
        When he perform a operation of "Subtract" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber   | secondNumber | result   |
            |        5      |        2     |      3   |
            |    -1020      |    -3500     |   2480   |
            |      500      |      500     |      0   |
            |   120000      |   300000     | -180000  |
            |    10.24      |     3.12     |    7.12  |
            |               |     15       |    -15   |

    @Multiplication
    Scenario Outline: Multiplication of two numbers: "<firstNumber>" and "<secondNumber>"
        When he perform a operation of "Multiply" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber | result  |
            |        5     |       5      |     25  |
            |       -4     |       2      |     -8  |
            |       -3     |      -3      |      9  |
            |  2000000     |       0      |      0  |
            |     4.21     |    2.33      | 9.8093  |
            |       30     |              |      0  |

    @Division
    Scenario Outline: Division of two numbers: "<firstNumber>" and "<secondNumber>"
        When he perform a operation of "Divide" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  |      result    |
            |      10      |      2        |          5     |
            |     -84      |      4        |        -21     |
            |     -33      |     -3        |         11     |
            |      17      |     17        |          1     |
            |   45.99      |     3.2       |  14.371875     |

    @Concatenation
    Scenario Outline: Concatenation of two numbers: "<firstNumber>" and "<secondNumber>"
        When he perform a operation of "Concatenate" between the number "<firstNumber>" and "<secondNumber>"
        Then he should that the result is "<result>"

        Examples:
            | firstNumber  | secondNumber  |      result    |
            |       1      |         1     |           11   |
            |    3012      |     21764     |    301221764   |
            |     -12      |       -41     |       -12-41   |
            |   43.21      |     12.89     |   43.2112.89   |
            |  ABCÑÓ@      |    defñú#     | ABCÑÓ@defñú#   |
            |   VACIO      |               |        VACIO   |
            |              |               |                |

    @ClearTheResult
    Scenario: Clear the result obtained of the operation
        When he perform a operation of "Add" between the number "2" and "3"
        Then he should that the result is "5"
        When clear the result obtained of the operation
        Then he should that the result is ""

    @DivisionByZero
    Scenario: Division of a number by zero
        When he perform a operation of "Divide" between the number "20" and "0"
        Then he should that the error message "Divide by zero error!"

    @FollowedOperations
    Scenario: Followed Sum Operations
        When he perform a operation of "Add" between the number "2" and "3"
        Then he should that the result is "5"
        When he perform a operation of "Add" between the number "4" and "10"
        Then he should that the result is "14"

    @FirstNumberNotValid
    Scenario Outline: Operation of <operation> between a not valid number with a number
        When he perform a operation of "<operation>" between the number "PALABRA" and "20"
        Then he should that the error message "Number 1 is not a number"

        Examples:
            |  operation    |
            |        Add    |
            |   Subtract    |
            |   Multiply    |
            |     Divide    |

    @SecondNumberNotValid
    Scenario Outline: Operation of <operation> between a number with a not valid number
        When he perform a operation of "<operation>" between the number "20" and "PALABRA"
        Then he should that the error message "Number 2 is not a number"

        Examples:
            |  operation    |
            |        Add    |
            |   Subtract    |
            |   Multiply    |
            |     Divide    |


