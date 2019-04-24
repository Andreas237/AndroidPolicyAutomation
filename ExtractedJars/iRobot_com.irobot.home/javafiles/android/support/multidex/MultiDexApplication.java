// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.app.Application;
import android.content.Context;

// Referenced classes of package android.support.multidex:
//			a

public class MultiDexApplication extends Application
{

	public MultiDexApplication()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Application()>
	//    2    4:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Application.attachBaseContext(Context)>
		a.a(((Context) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #18  <Method void a.a(Context)>
	//    5    9:return          
	}
}
