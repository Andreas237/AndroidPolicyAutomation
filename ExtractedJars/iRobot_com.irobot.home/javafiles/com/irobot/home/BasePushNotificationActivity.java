// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.os.PersistableBundle;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class BasePushNotificationActivity extends BaseFragmentActivity
{

	public BasePushNotificationActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void onBackPressed()
	{
		if(v())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #31  <Method boolean v()>
	//*   2    4:ifeq            12
		{
			j.a(((android.app.Activity) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #34  <Method void j.a(android.app.Activity)>
			return;
	//    5   11:return          
		} else
		{
			super.onBackPressed();
	//    6   12:aload_0         
	//    7   13:invokespecial   #36  <Method void BaseFragmentActivity.onBackPressed()>
			return;
	//    8   16:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void BaseFragmentActivity.onCreate(Bundle)>
		u();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #43  <Method void u()>
	//    5    9:return          
	}

	public void onCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		super.onCreate(bundle, persistablebundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void BaseFragmentActivity.onCreate(Bundle, PersistableBundle)>
		u();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #43  <Method void u()>
	//    6   10:return          
	}

	private static final String a = j.r(((Class) (com/irobot/home/BasePushNotificationActivity)).getSimpleName());

	static 
	{
	//    0    0:ldc1            #2   <Class BasePushNotificationActivity>
	//    1    2:invokevirtual   #14  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #20  <Method String j.r(String)>
	//    3    8:putstatic       #22  <Field String a>
	//*   4   11:return          
	}
}
