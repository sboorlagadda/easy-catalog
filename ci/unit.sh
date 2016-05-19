#!/bin/bash
export TERM=${TERM:-dumb}

set -e

pushd easy-catalog
./gradlew clean test
popd
