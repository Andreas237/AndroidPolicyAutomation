#!/bin/bash


############################################
#		Part 0: Get APK Name	   #
###########################################
function getfilename {
	apk=$1
	filename=$(echo $1 | sed "s/.apk//p" -n)
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
	echo "Decompiling $apk"
	./../Tools/dex2jar-2.0/d2j-dex2jar.sh $apk
	mv "$filename$tail" "$filename"
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

decompilejar

decompileclass
