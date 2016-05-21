#!/bin/bash
export TERM=${TERM:-dumb}

set -e

VERSION=$(cat catalog-version/version)

pushd easy-catalog
./gradlew build -Pversion=$VERSION
popd
cp easy-catalog/build/libs/catalog*.jar builds/