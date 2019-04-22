// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

public final class AppOpsManagerCompat
{

	public static int noteProxyOpNoThrow(Context context, String s, String s1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #13  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          23
			return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteProxyOpNoThrow(s, s1);
	//    3    8:aload_0         
	//    4    9:ldc1            #15  <Class AppOpsManager>
	//    5   11:invokevirtual   #21  <Method Object Context.getSystemService(Class)>
	//    6   14:checkcast       #15  <Class AppOpsManager>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokevirtual   #24  <Method int AppOpsManager.noteProxyOpNoThrow(String, String)>
	//   10   22:ireturn         
		else
			return 1;
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	public static String permissionToOp(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #13  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return AppOpsManager.permissionToOp(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #31  <Method String AppOpsManager.permissionToOp(String)>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}
}
