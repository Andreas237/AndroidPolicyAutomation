// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

public final class AppOpsManagerCompat
{

	private AppOpsManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static int noteOp(Context context, String s, int i, String s1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          24
			return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteOp(s, i, s1);
	//    3    8:aload_0         
	//    4    9:ldc1            #26  <Class AppOpsManager>
	//    5   11:invokevirtual   #32  <Method Object Context.getSystemService(Class)>
	//    6   14:checkcast       #26  <Class AppOpsManager>
	//    7   17:aload_1         
	//    8   18:iload_2         
	//    9   19:aload_3         
	//   10   20:invokevirtual   #35  <Method int AppOpsManager.noteOp(String, int, String)>
	//   11   23:ireturn         
		else
			return 1;
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	public static int noteProxyOp(Context context, String s, String s1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          23
			return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteProxyOp(s, s1);
	//    3    8:aload_0         
	//    4    9:ldc1            #26  <Class AppOpsManager>
	//    5   11:invokevirtual   #32  <Method Object Context.getSystemService(Class)>
	//    6   14:checkcast       #26  <Class AppOpsManager>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokevirtual   #41  <Method int AppOpsManager.noteProxyOp(String, String)>
	//   10   22:ireturn         
		else
			return 1;
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	public static String permissionToOp(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return AppOpsManager.permissionToOp(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #45  <Method String AppOpsManager.permissionToOp(String)>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public static final int MODE_ALLOWED = 0;
	public static final int MODE_DEFAULT = 3;
	public static final int MODE_IGNORED = 1;
}
