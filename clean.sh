#!/bin/bash
set -e

source ./environment.sh

# clean webapp
bash ./gradlew clean

cd "${ROOT_DIR}"/web-api

# clean docker images
docker stop ${API_CONTAINER_NAME} || echo "No jboss container to stop"
docker rm ${API_CONTAINER_NAME} || echo "No jboss container to remove"
docker rmi ${API_IMAGE_NAME}:latest || echo "No jboss image to remove"
