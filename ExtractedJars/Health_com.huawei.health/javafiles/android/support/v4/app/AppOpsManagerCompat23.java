// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

class AppOpsManagerCompat23
{

	AppOpsManagerCompat23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int noteOp(Context context, String s, int i, String s1)
	{
		return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteOp(s, i, s1);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class AppOpsManager>
	//    2    3:invokevirtual   #22  <Method Object Context.getSystemService(Class)>
	//    3    6:checkcast       #16  <Class AppOpsManager>
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:invokevirtual   #25  <Method int AppOpsManager.noteOp(String, int, String)>
	//    8   15:ireturn         
	}

	public static int noteProxyOp(Context context, String s, String s1)
	{
		return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteProxyOp(s, s1);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class AppOpsManager>
	//    2    3:invokevirtual   #22  <Method Object Context.getSystemService(Class)>
	//    3    6:checkcast       #16  <Class AppOpsManager>
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #30  <Method int AppOpsManager.noteProxyOp(String, String)>
	//    7   14:ireturn         
	}

	public static String permissionToOp(String s)
	{
		return AppOpsManager.permissionToOp(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method String AppOpsManager.permissionToOp(String)>
	//    2    4:areturn         
	}
}
