// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			AppOpsManagerCompat23

public final class AppOpsManagerCompat
{
	static class AppOpsManager23 extends AppOpsManagerImpl
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

		AppOpsManager23()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AppOpsManagerCompat$AppOpsManagerImpl()>
		//    2    4:return          
		}
	}

	static class AppOpsManagerImpl
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

		AppOpsManagerImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private AppOpsManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static int noteOp(Context context, String s, int i, String s1)
	{
		return IMPL.noteOp(context, s, i, s1);
	//    0    0:getstatic       #31  <Field AppOpsManagerCompat$AppOpsManagerImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #39  <Method int AppOpsManagerCompat$AppOpsManagerImpl.noteOp(Context, String, int, String)>
	//    6   10:ireturn         
	}

	public static int noteProxyOp(Context context, String s, String s1)
	{
		return IMPL.noteProxyOp(context, s, s1);
	//    0    0:getstatic       #31  <Field AppOpsManagerCompat$AppOpsManagerImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #44  <Method int AppOpsManagerCompat$AppOpsManagerImpl.noteProxyOp(Context, String, String)>
	//    5    9:ireturn         
	}

	public static String permissionToOp(String s)
	{
		return IMPL.permissionToOp(s);
	//    0    0:getstatic       #31  <Field AppOpsManagerCompat$AppOpsManagerImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method String AppOpsManagerCompat$AppOpsManagerImpl.permissionToOp(String)>
	//    3    7:areturn         
	}

	private static final AppOpsManagerImpl IMPL;
	public static final int MODE_ALLOWED = 0;
	public static final int MODE_DEFAULT = 3;
	public static final int MODE_IGNORED = 1;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			IMPL = ((AppOpsManagerImpl) (new AppOpsManager23()));
	//    3    8:new             #6   <Class AppOpsManagerCompat$AppOpsManager23>
	//    4   11:dup             
	//    5   12:invokespecial   #29  <Method void AppOpsManagerCompat$AppOpsManager23()>
	//    6   15:putstatic       #31  <Field AppOpsManagerCompat$AppOpsManagerImpl IMPL>
	//    7   18:return          
		else
			IMPL = new AppOpsManagerImpl();
	//    8   19:new             #9   <Class AppOpsManagerCompat$AppOpsManagerImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #32  <Method void AppOpsManagerCompat$AppOpsManagerImpl()>
	//   11   26:putstatic       #31  <Field AppOpsManagerCompat$AppOpsManagerImpl IMPL>
	//*  12   29:return          
	}
}
