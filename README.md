# Workout Tracker
> App to let users track their workouts and progress.
## Overview
A backend system for a workout tracker application that enables users to sign up, log in, create workout plans, and track their progress.
# Features
* User Authentication: Sign up and log in functionality using JWT (JSON Web Tokens)
* Workout Management: Create, Read, Update, and Delete (CRUD) operations for workout plans
* Progress Tracking: Generate reports on past workouts
# Technologies Used
* Framework: *Spring Boot*
* Language: *Java*
* Build: *Maven*
* Database: *PostgreSQL*
* Authentication: *JWT*
## Getting Started
1. Clone the repository: git clone https://github.com/shaurya-afk/Workout-Tracker.git
2. Install Dependencies: mvn clean install
3. Start the application: mvn spring-boot:run
## API Endpoints
### User
* POST /api/users - Create a new user
* POST /api/login - Log in an existing user
### Workout
* POST /api/workouts - Create a new workout plan
* GET /api/workouts - Retrieve all workout plans
* GET /api/workouts/:id - Retrieve a specific workout plan
* PUT /api/workouts/:id - Update a workout plan
* DELETE /api/workouts/:id - Delete a workout plan
### Reports
* GET /api/reports - Generate a report on past workouts
## Contributions
Contributions are welcome! Please open an issue or submit a pull request.


#### Self
> [Generative AI Reference](https://www.meta.ai/c/69dd1a25-68a2-428d-846e-bd3beaa693a4)