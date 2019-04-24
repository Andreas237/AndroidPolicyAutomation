// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			AppOpsManagerCompat, AppOpsManagerCompat23

static class AppOpsManagerCompat$AppOpsManager23 extends l
{

	public int noteOp(Context context, String s, int i, String s1)
	{
		return AppOpsManagerCompat23.noteOp(context, s, i, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:invokestatic    #18  <Method int AppOpsManagerCompat23.noteOp(Context, String, int, String)>
	//    5    8:ireturn         
	}

	public int noteProxyOp(Context context, String s, String s1)
	{
		return AppOpsManagerCompat23.noteProxyOp(context, s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #22  <Method int AppOpsManagerCompat23.noteProxyOp(Context, String, String)>
	//    4    6:ireturn         
	}

	public String permissionToOp(String s)
	{
		return AppOpsManagerCompat23.permissionToOp(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method String AppOpsManagerCompat23.permissionToOp(String)>
	//    2    4:areturn         
	}

	AppOpsManagerCompat$AppOpsManager23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AppOpsManagerCompat$AppOpsManagerImpl()>
	//    2    4:return          
	}
}
