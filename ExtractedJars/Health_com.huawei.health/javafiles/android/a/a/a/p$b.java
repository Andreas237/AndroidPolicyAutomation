// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.a.a.a:
//			p

static class p$b
	implements p$c
{

	public Bundle b(Intent intent)
	{
		Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//    0    0:ldc1            #17  <String "RemoteInput">
	//    1    2:ldc1            #19  <String "RemoteInput is only supported from API Level 16">
	//    2    4:invokestatic    #25  <Method int Log.w(String, String)>
	//    3    7:pop             
		return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
	}

	public void c(p ap[], Intent intent, Bundle bundle)
	{
		Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//    0    0:ldc1            #17  <String "RemoteInput">
	//    1    2:ldc1            #19  <String "RemoteInput is only supported from API Level 16">
	//    2    4:invokestatic    #25  <Method int Log.w(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	p$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
