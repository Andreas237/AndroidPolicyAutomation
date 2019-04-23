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

private static class CrashlyticsController$AnySessionPartFileFilter
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, s) && CrashlyticsController.access$000().matcher(((CharSequence) (s))).matches();
	//    0    0:getstatic       #22  <Field FilenameFilter CrashlyticsController.SESSION_FILE_FILTER>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokeinterface #24  <Method boolean FilenameFilter.accept(File, String)>
	//    4   10:ifne            28
	//    5   13:invokestatic    #28  <Method Pattern CrashlyticsController.access$000()>
	//    6   16:aload_2         
	//    7   17:invokevirtual   #34  <Method Matcher Pattern.matcher(CharSequence)>
	//    8   20:invokevirtual   #40  <Method boolean Matcher.matches()>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	private CrashlyticsController$AnySessionPartFileFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	CrashlyticsController$AnySessionPartFileFilter(CrashlyticsController._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void CrashlyticsController$AnySessionPartFileFilter()>
	//    2    4:return          
	}
}
