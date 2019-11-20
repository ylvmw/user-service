# user service

The user service is an RESTful service for managing users, with the operations: add, get, update, delete, list, etc.
It uses PostgreSQL as the backend data store.

## TL;DR

```bash
$ helm install user-service
```

## Configuration

The following tables lists the configurable parameters of the user service chart and their default values.

| Parameter                        | Description                                             | Default                                                      |
|----------------------------------|---------------------------------------------------------|--------------------------------------------------------------|
| `image.repository`               | Docker image name                                       | `tianchi/user-service`                                       |
| `service.type`                   | Service type                                            | `NodePort`                                                   |
| `postgresql.postgresqlDatabase`  | database name                                           | `user`                                                       |
| `postgresql.postgresqlUsername`  | database user                                           | `postgres`                                                   |
| `postgresql.postgresqlPassword`  | database password                                       | `password`                                                   |