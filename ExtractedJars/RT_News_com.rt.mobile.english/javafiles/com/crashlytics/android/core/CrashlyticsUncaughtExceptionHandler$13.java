// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$13
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.startsWith(val$sessionId);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field String val$sessionId>
	//    3    5:invokevirtual   #33  <Method boolean String.startsWith(String)>
	//    4    8:ireturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final String val$sessionId;

	CrashlyticsUncaughtExceptionHandler$13()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$sessionId = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$sessionId>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
