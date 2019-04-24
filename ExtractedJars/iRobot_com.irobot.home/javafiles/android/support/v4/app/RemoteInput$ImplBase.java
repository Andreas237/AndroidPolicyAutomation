// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			RemoteInput

static class RemoteInput$ImplBase
	implements RemoteInput.Impl
{

	public void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//    0    0:ldc1            #18  <String "RemoteInput">
	//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
	//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//    0    0:ldc1            #18  <String "RemoteInput">
	//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
	//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public Map getDataResultsFromIntent(Intent intent, String s)
	{
		Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//    0    0:ldc1            #18  <String "RemoteInput">
	//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
	//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
	//    3    7:pop             
		return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
	}

	public Bundle getResultsFromIntent(Intent intent)
	{
		Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//    0    0:ldc1            #18  <String "RemoteInput">
	//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
	//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
	//    3    7:pop             
		return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
	}

	RemoteInput$ImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
