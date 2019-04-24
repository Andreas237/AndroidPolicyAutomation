// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;

// Referenced classes of package o:
//			dhu

static final class dhu$2
	implements Runnable
{

	public void run()
	{
		Log.i("LogUtil_LogConfig", "clearNativeMemoryAndFilesLogAsync memory");
	//    0    0:ldc1            #18  <String "LogUtil_LogConfig">
	//    1    2:ldc1            #20  <String "clearNativeMemoryAndFilesLogAsync memory">
	//    2    4:invokestatic    #26  <Method int Log.i(String, String)>
	//    3    7:pop             
		dhu.q();
	//    4    8:invokestatic    #29  <Method void dhu.q()>
	//    5   11:return          
	}

	dhu$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
