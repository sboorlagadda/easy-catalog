#!/bin/bash
export TERM=${TERM:-dumb}

set -e

pushd easy-catalog
./gradlew bootRepackage
popd
cp easy-catalog/build/libs/catalog.jar builds/