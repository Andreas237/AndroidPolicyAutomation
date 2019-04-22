// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

static final class CrashlyticsController$4
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return CrashlyticsController.access$000().matcher(((CharSequence) (s))).matches();
	//    0    0:invokestatic    #19  <Method Pattern CrashlyticsController.access$000()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #25  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:invokevirtual   #31  <Method boolean Matcher.matches()>
	//    4   10:ireturn         
	}

	CrashlyticsController$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
