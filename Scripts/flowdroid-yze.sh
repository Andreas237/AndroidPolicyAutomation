#!/bin/bash
# Author:       Andreas Slovacek
# Date:         8 April 2019
############################################
# About:
#   When an APK is entered into this script
#   the results of applying FlowDroid will
#   be saved in ~/Downloads/<apk_name>
############################################






############################################
#		Part 0: Get APK Name	   							 #
############################################
# Get the name of the APK to be analyzed
function getfilename {
	apk=$1
	filename=$(echo $1 | sed -n "s/.apk//p")
  echo $1
}

# Create an output directory in the user's
# home Downloads folder.
function outputdir {
  outdir=$HOME"/Downloads/"$filename
  echo "Creating/Replacing directory: $outdir"
	rm -rf $outdir
	mkdir $outdir
}
#------------------------------------------






############################################
#		Part 1: Run FlowDroid on the APK       #
############################################
#java -jar
sootpath="/Users/andreasslovacek/Development/Libraries/FlowDroid/soot-infoflow-cmd/target/soot-infoflow-cmd-jar-with-dependencies.jar"
#-a /Users/andreasslovacek/Development/ResearchAsst2019/AndroidPolicyAutomation/TestApks/Health_com.huawei.health.apk \
sdkplatform="/Users/andreasslovacek/Library/Android/sdk/platforms"
sourcesink="/Users/andreasslovacek/Development/Libraries/FlowDroid/soot-infoflow-android/SourcesAndSinks.txt"
function flow {
  java -Xmx1024m -jar $sootpath \
  -a $apk \
  -p $sdkplatform \
  -s $sourcesink
}




#------------------------------------------





###########################################
#	Finally: Put it all together	  #
##########################################

# getfilename $1

# outputdir

flow $1
