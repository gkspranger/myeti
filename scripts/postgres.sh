#!/usr/bin/env bash

docker container run \
-p 5432:5432 \
--name postgres \
--rm \
-e POSTGRES_USER="yetibot" \
-e POSTGRES_PASSWORD="yetibot" \
-e POSTGRES_DB="yetibot" \
postgres:latest