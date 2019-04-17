#!/bin/bash

############################################
#   Purpose
# Remove the directory associated with
# the APK
#
#
#		Instructions
# 1 - Be in root directory of the project:
#	~/Development/ResearchAsst2019/AndroidPolicyAutomation/ExtractedJars
#
# 2 - Run with: ../Scripts/clean.sh [Path/APK]
#			Example:>> ../Scripts/clean.sh ../APKs/Ibotta_com.ibotta.android.apk
############################################




############################################
#               Part 0: Get APK Name       #
###########################################
function getfilename {
	apk=$1
	filename=${apk##*/}
	filename=${filename%.apk}
	echo "filename name: $filename"
	# filename=$(echo $1 | sed -n "s/.apk//p")
} # end function getfilename



############################################
#  Part 1: Delete Directory and Contents   #
############################################
function removedir {
        echo "Removing directory: $filename"
        rm -rf "$filename"
}


getfilename $1

removedir
