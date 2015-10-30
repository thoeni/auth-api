#!/usr/bin/env bash

#################################################################
# Author: msubramanian
# Environment variables for Web API scripts.
#
# Usage:
# source ./environment.sh
#################################################################

set -e

#################################################################
# Variables
#################################################################

ROOT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )"/.. && pwd )"

API_IMAGE_NAME="pulse/web-api"

# container names (NB: not image names)
API_CONTAINER_NAME="pulse-web-api"
