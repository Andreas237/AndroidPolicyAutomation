#!/bin/bash

############################################
#		Instructions
# 1 - Be in root directory of the project:
#	~/Development/ResearchAsst2019/AndroidPolicyAutomation/ExtractedJars
#
# 2 - Run with: ../Scripts/decompile.sh [Path/APK]
#			Example:>> ../Scripts/decompile.sh ../APKs/Ibotta_com.ibotta.android.apk
############################################


############################################
#		Part 0: Get APK Name	   							 #
############################################
# Parse the input filename to strip path and
# extension
function getfilename {
	apk=$1
	filename=${apk##*/}
	filename=${filename%.apk}
	echo "filename name: $filename"
	# filename=$(echo $1 | sed -n "s/.apk//p")
} # end function getfilename






# Create a directory to store the output in,
# based on the input APK name
function outputdir {
	echo "Creating/Replacing directory: $filename"
	rm -rf "$filename"
	mkdir "$filename"
} # end function outputdir






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
	echo "Attempting to move: ${filename}$tail" "${filename}/"
	if [ -f ${filename}$tail ]
	then
		mv "${filename}$tail" "${filename}/"
	fi


	echo "Attempting to move: ${filename}$err" "${filename}/"
	if [ -f ${filename}$err ]
	then
		mv "${filename}$err" "${filename}/"
	fi
} # end function decompileapk






# Manifest.xml is not available through dex2jar.  Therefore use Apktool to get
# the manifest and all other resources it can.  Will strip down for efficiency
# later.
function getmanifest {
	echo "Running Apktool"
	apktool d -o "$filename" $apk
} # end function getmanifest






###########################################
#               Part 2: The Jar           #
###########################################
# The jar must be decompiled.  Unzip them
# with standard unzip command and put the
# resulting .class files in the
# corresponding directory.
function decompilejar {
	echo "Unzipping ${filename}/$filename$tail"
	echo "A" | unzip -qqj "$filename/*.jar" -d "$filename/classfiles"
} # end function decompilejar






# The class files need to be decompiled
# into .java files for searching
function decompileclass {
	echo "A"	# In response to "replace filename/classfiles/a.class? [y]es, [n]o, [A]ll, [N]one, [r]ename:"
	echo "Decompiling the class files in $filename/classfiles, results in $filename/javafiles"


	# Decompile every class file into its original .java form
	for file in "${filename}/classfiles/"*[^$]*".class"; do
		echo "Applying jad to "$file
		# Check flags with >> jad --help
		jad -sjava -a -o -r -safe -t -d "$filename/javafiles/" $file
				# response to jad parsing asking to overwrite
	done
} # end function decompileclass






###########################################
#		Part 3: Code Analysis	  #
###########################################
# Call modules to analyze the code










###########################################
#	Finally: Put it all together	  #
##########################################

getfilename $1

getmanifest
# outputdir # remove this to test if `getmanifest` will do this in place

decompileapk

decompilejar

decompileclass
