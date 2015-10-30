#!/bin/bash

#################################################################
# Author: msubramanian
# Run the Web API container.
#
# Usage:
# ./run.sh
#################################################################

set -e

#################################################################
# Variables
#################################################################

source ./environment.sh

AS_PORT="8080"

#################################################################
# Functions
#################################################################

function printDockerHost()
{
    # get docker host
    __DOCKER_HOST="$( docker-machine ip default 2> /dev/null || docker-machine ip dev 2> /dev/null || echo "unknown" )"
    echo "Application server starting on http://${__DOCKER_HOST}:${AS_PORT}"
}

function runDockerContainer()
{
    # run docker container
    # note: using --rm to clean up after run
    cd ${ROOT_DIR}/auth-api

    docker run -it \
               --rm \
               -p ${AS_PORT}:8080 \
               -p 8443:8443 \
               --name=pulse-web-api \
               pulse/web-api
}

#################################################################
# Script
#################################################################

printDockerHost

runDockerContainer
