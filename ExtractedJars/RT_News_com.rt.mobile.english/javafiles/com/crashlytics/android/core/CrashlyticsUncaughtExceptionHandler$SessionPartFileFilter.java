// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

static class CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		file = ((File) (new StringBuilder()));
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (file)).append(sessionId);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field String sessionId>
	//    7   13:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		((StringBuilder) (file)).append(".cls");
	//    9   17:aload_1         
	//   10   18:ldc1            #30  <String ".cls">
	//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		boolean flag = s.equals(((Object) (((StringBuilder) (file)).toString())));
	//   13   24:aload_2         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   16   29:invokevirtual   #40  <Method boolean String.equals(Object)>
	//   17   32:istore_3        
		boolean flag1 = false;
	//   18   33:iconst_0        
	//   19   34:istore          4
		if(flag)
	//*  20   36:iload_3         
	//*  21   37:ifeq            42
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		flag = flag1;
	//   24   42:iload           4
	//   25   44:istore_3        
		if(s.contains(((CharSequence) (sessionId))))
	//*  26   45:aload_2         
	//*  27   46:aload_0         
	//*  28   47:getfield        #18  <Field String sessionId>
	//*  29   50:invokevirtual   #44  <Method boolean String.contains(CharSequence)>
	//*  30   53:ifeq            70
		{
			flag = flag1;
	//   31   56:iload           4
	//   32   58:istore_3        
			if(!s.endsWith(".cls_temp"))
	//*  33   59:aload_2         
	//*  34   60:ldc1            #46  <String ".cls_temp">
	//*  35   62:invokevirtual   #50  <Method boolean String.endsWith(String)>
	//*  36   65:ifne            70
				flag = true;
	//   37   68:iconst_1        
	//   38   69:istore_3        
		}
		return flag;
	//   39   70:iload_3         
	//   40   71:ireturn         
	}

	private final String sessionId;

	public CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		sessionId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String sessionId>
	//    5    9:return          
	}
}
