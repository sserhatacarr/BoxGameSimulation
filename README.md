# Boxing Match Simulator

This program simulates a boxing match using Java classes.

## Table of Contents

- [Overview](#overview)
- [Classes](#classes)
- [Usage](#usage)
- [How It Works](#how-it-works)
- [Contributing](#contributing)
- [License](#license)

## Overview

This program simulates a boxing match between two fighters. The fighters have attributes such as name, damage, health, weight, and dodge probability. The match is run in a ring where each fighter takes turns hitting their opponent until one of them runs out of health.

## Classes

- **Fighter**: Represents a fighter in the boxing match. Contains attributes such as name, damage, health, weight, and dodge probability. It has a method to handle a hit from one fighter to another and a method to simulate dodging.

- **Ring**: Represents the boxing ring where the match happens. Contains information about the fighters and methods to run the match and determine the winner.

## Usage

To use this program, create instances of the `Fighter` class with appropriate attributes. Then, create an instance of the `Ring` class with the two fighters and the weight range for the match. Finally, call the `run` method to start the match.

## How It Works

1. Create instances of the `Fighter` class with names, damage, health, weight, and dodge probability.

2. Create an instance of the `Ring` class with the two fighters and a weight range.

3. Call the `run` method of the `Ring` class to start the match.

4. The match simulates rounds where each fighter takes turns hitting the other until one of them runs out of health.

5. The winner is determined based on the remaining health of the fighters.

## Contributing

Feel free to contribute to this project by forking the repository, making your changes, and creating a pull request. We welcome any improvements or suggestions!

## Author

- Serhat Acar

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
