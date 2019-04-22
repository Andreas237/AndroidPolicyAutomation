// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			RuntimeCompat

class RuntimeCompat$1
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return val$cpuNamePattern.matcher(((CharSequence) (s))).matches();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Pattern val$cpuNamePattern>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #29  <Method Matcher Pattern.matcher(CharSequence)>
	//    4    8:invokevirtual   #35  <Method boolean Matcher.matches()>
	//    5   11:ireturn         
	}

	final Pattern val$cpuNamePattern;

	RuntimeCompat$1()
	{
		val$cpuNamePattern = pattern;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Pattern val$cpuNamePattern>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
