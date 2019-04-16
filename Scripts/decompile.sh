#!/bin/bash

############################################
#		Instructions
# 1 - Be in root directory of the project:
#	/Users/andreasslovacek/Development/ResearchAsst2019/AndroidPolicyAutomation/ExtractedJars
#
# 2 -
############################################


############################################
#		Part 0: Get APK Name	   							 #
############################################
function getfilename {
	apk=$1
	filename=${apk##*/}
	filename=${filename%.apk}
	echo "filename name: $filename"
	# filename=$(echo $1 | sed -n "s/.apk//p")
	# Get rid of path: echo ~/Development/APKs/LibriVox_app.librivox.android.apk | sed "s/\(.*\/\)//g"
}

function outputdir {
	echo "Creating/Replacing directory: $filename"
	rm -rf "$filename"
	mkdir "$filename"
}

############################################
#               Part 1:The APK             #
############################################
# Decompile the .apk using dex2jar, and move
# the output into the corresponding dir.
function decompileapk {
	tail="-dex2jar.jar"
	err="-error.zip"
	echo "Decompiling $apk"
	../Tools/dex2jar-2.0/d2j-dex2jar.sh $apk

	# Move the results to the designated directory
	mv "${filename}$tail" "${filename}/"
	mv "${filename}$err" "${filename}/"
}






###########################################
#               Part 2: The Jar           #
###########################################
# The jar must be decompiled.  In this pro-
# ject we use JAD
function decompilejar {
	echo "Unzipping $filename$tail"
	echo "A" | unzip -qqj "$filename/*.jar" -d "$filename/classfiles"
}

# The class files need to be decompiled
# into .java files for searching
function decompileclass {
	echo "Decompiling the class files in $filename/classfiles, results in $filename/javafiles"
	# read -n 1 -s -r -p "Press any key to continue"
	for file in "$filename/classfiles/*[^$]*.class"; do
		jad -sjava -d "$filename/javafiles/" $file
	done
}



###########################################
#		Part 3: Code Analysis	  #
###########################################
# Call modules to analyze the code










###########################################
#	Finally: Put it all together	  #
##########################################

getfilename $1

outputdir

decompileapk

#decompilejar

#decompileclass
