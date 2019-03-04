#!/bin/bash

# Purpose: remove the directory associated
# with the APK
############################################
#               Part 0: Get APK Name       #
###########################################
function getfilename {
        apk=$1
        filename=$(echo $1 | sed "s/.apk//p" -n)
}

function removedir {
        echo "Removing directory: $filename"
        rm -rf "$filename"
}


getfilename $1

removedir
