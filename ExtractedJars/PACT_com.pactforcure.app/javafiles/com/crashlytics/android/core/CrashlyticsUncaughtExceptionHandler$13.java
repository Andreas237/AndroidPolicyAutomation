// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$13
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		if(s.length() < 35)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #33  <Method int String.length()>
	//*   2    4:bipush          35
	//*   3    6:icmpge          11
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return val$invalidSessionIds.contains(((Object) (s.substring(0, 35))));
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field Set val$invalidSessionIds>
	//    8   15:aload_2         
	//    9   16:iconst_0        
	//   10   17:bipush          35
	//   11   19:invokevirtual   #37  <Method String String.substring(int, int)>
	//   12   22:invokeinterface #43  <Method boolean Set.contains(Object)>
	//   13   27:ireturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final Set val$invalidSessionIds;

	CrashlyticsUncaughtExceptionHandler$13()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$invalidSessionIds = Set.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Set val$invalidSessionIds>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
