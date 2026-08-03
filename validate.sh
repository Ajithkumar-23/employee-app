#!/bin/bash


if [ -f pom.xml ]

then

echo "pom.xml found"

else

echo "pom.xml missing"

exit 1

fi



if [ -d src ]

then

echo "Source code found"

else

echo "Source missing"

exit 1

fi


echo "Validation Successful"