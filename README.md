# Setup Guide

### 1. Setting up Postgresql from docker container
* Install psql
    ```
   brew install postgresql
    ```
* Download docker container:

    ```
   docker pull postgres
    ```
  
* Run the container with basic username and password:

    ```
    docker run --name mypostgres -e POSTGRES_USER=myuser -e POSTGRES_PASSWORD=mypassword -e POSTGRES_DB=mydatabase -d -p 5432:5432 -v my_pgdata:/var/lib/postgresql/data postgres
    ```
* Login to the created DB to confirm everything works as expected:

    ```
    psql -h localhost -p 5432 -U myuser -d mydatabase
    ```    

> [!NOTE]
> something Something SOMETHING

  