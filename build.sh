#!/usr/bin/env bash

#################################################################
# Author: msubramanian
# Build the Web API webapp and Docker image.
#
# Usage:
# ./build.sh
#################################################################

set -e

#################################################################
# Variables
#################################################################

source ./environment.sh

#################################################################
# Script
#################################################################

# build java webapp
bash ./gradlew build

cd "${ROOT_DIR}"/auth-api

# build docker image
echo "Building pulse/pulse-web-api..."
docker build --tag=${API_IMAGE_NAME} .
