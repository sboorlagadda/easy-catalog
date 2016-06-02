#!/bin/sh
export TERM=${TERM:-dumb}

set -e

cp catalog-jar/catalog*.jar image
cp easy-catalog/src/main/docker/Dockerfile image
