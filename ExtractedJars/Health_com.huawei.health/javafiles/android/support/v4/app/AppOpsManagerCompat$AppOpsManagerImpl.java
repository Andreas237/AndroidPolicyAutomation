// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			AppOpsManagerCompat

static class AppOpsManagerCompat$AppOpsManagerImpl
{

	public int noteOp(Context context, String s, int i, String s1)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int noteProxyOp(Context context, String s, String s1)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String permissionToOp(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	AppOpsManagerCompat$AppOpsManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
