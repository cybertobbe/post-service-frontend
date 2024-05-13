# PostService

PostService is a microservice responsible for managing the storage of messages between users. The service utilizes MongoDB as the database for storing messages.

## Running with Docker

To run PostService using Docker, make sure you have Docker installed on your machine.

1. Pull the PostService Docker image from Docker Hub:

    ```
    docker pull postservice2
    ```

 

2. Start a Docker container using the pulled image:

    ```
    docker run -p 8090:8080 --name <container> postservice2
    ```

   This will start the container and make it available on port 8090 on your local machine.

### Using PostService

PostService exposes the following endpoints:

- **POST /api/message**: Saves a message to the database. Use JSON format to include the message in the request body.
- **GET /api/message**: Retrieves all saved messages from the database.
- **GET /api/message/sender/{senderUsername}**: Retrieves all messages sent by a specific sender.


To interact with PostService, use an appropriate HTTP client capable of sending requests to the above endpoints.

### Configuration

PostService uses MongoDB as the database. Make sure your MongoDB instance is configured according to the provided URI: `mongodb://root:secret@mongodb:27017/mydatabase`.


