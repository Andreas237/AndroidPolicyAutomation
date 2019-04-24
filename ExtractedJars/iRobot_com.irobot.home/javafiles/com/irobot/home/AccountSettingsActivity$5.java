// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			AccountSettingsActivity

class AccountSettingsActivity$5 extends HttpCallback
{

	public void onFailure(int i, Error error)
	{
		a.a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccountSettingsActivity a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #23  <Method void AccountSettingsActivity.a(boolean)>
		a.a(0x7f0f0256, 0x7f0f0255);
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field AccountSettingsActivity a>
	//    6   12:ldc1            #24  <Int 0x7f0f0256>
	//    7   14:ldc1            #25  <Int 0x7f0f0255>
	//    8   16:invokevirtual   #28  <Method void AccountSettingsActivity.a(int, int)>
	//    9   19:return          
	}

	public void onSuccess(HttpResponse httpresponse)
	{
		a.a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccountSettingsActivity a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #23  <Method void AccountSettingsActivity.a(boolean)>
		a.j();
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field AccountSettingsActivity a>
	//    6   12:invokevirtual   #33  <Method void AccountSettingsActivity.j()>
	//    7   15:return          
	}

	final AccountSettingsActivity a;

	AccountSettingsActivity$5(AccountSettingsActivity accountsettingsactivity)
	{
		a = accountsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AccountSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void HttpCallback()>
	//    5    9:return          
	}
}
