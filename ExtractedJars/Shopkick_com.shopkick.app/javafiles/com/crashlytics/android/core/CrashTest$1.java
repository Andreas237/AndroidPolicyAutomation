// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.AsyncTask;

// Referenced classes of package com.crashlytics.android.core:
//			CrashTest

class CrashTest$1 extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class Void[]>
	//    3    5:invokevirtual   #31  <Method Void doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(Void avoid[])
	{
		try
		{
			Thread.sleep(val$delayMs);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long val$delayMs>
	//    2    4:invokestatic    #38  <Method void Thread.sleep(long)>
		}
	//*   3    7:aload_0         
	//*   4    8:getfield        #18  <Field CrashTest this$0>
	//*   5   11:ldc1            #40  <String "Background thread crash">
	//*   6   13:invokevirtual   #44  <Method void CrashTest.throwRuntimeException(String)>
	//*   7   16:aconst_null     
	//*   8   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Void avoid[]) { }
	//    9   18:astore_1        
		throwRuntimeException("Background thread crash");
		return null;
	//*  10   19:goto            7
	}

	final CrashTest this$0;
	final long val$delayMs;

	CrashTest$1()
	{
		this$0 = final_crashtest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashTest this$0>
		val$delayMs = J.this;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #20  <Field long val$delayMs>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void AsyncTask()>
	//    8   14:return          
	}
}
