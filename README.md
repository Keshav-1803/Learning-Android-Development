# Dummy Android App

This is a simple Android app created using Jetpack Compose. It demonstrates the basics of creating a composable UI with a background color and text greeting.

## Features

- Displays a greeting message: "Hello Android!"
- Uses Jetpack Compose for UI components
- Adds background color using `Surface`
- Applies padding to the greeting message
- Supports edge-to-edge display for a modern, immersive experience

## Screenshots Preview 
 
<img width="248" alt="Screenshot 2024-11-27 at 11 25 14 PM" src="https://github.com/user-attachments/assets/aa4992d6-154f-4dff-a303-9f7b7d2a6864">


## Tech Stack

- **Android Studio**: Development environment
- **Kotlin**: Programming language
- **Jetpack Compose**: UI framework

## Setup Instructions

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/your-username/dummyandroidapp.git
    ```

2. Open the project in **Android Studio**.

3. Build and run the app on an Android emulator or device.

4. The app will display a greeting message with a cyan background and some padding.

## Code Overview

- **MainActivity**: The main activity that sets up the content view with a greeting message inside a `Surface` composable. The greeting message has padding and a background color of cyan.
  
- **Greeting Composable**: Displays the text "Hello $name!" with padding inside a `Surface` composable, which provides the background color.

## Running the App

To run the app, follow these steps:
1. Open the project in **Android Studio**.
2. Select a connected Android device or emulator.
3. Click the "Run" button in Android Studio to build and launch the app.
