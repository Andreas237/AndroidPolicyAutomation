// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			LocalOtaHttpsActivity

class LocalOtaHttpsActivity$1
	implements android.content.istener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		LocalOtaHttpsActivity.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
	//    2    4:invokestatic    #24  <Method void LocalOtaHttpsActivity.a(LocalOtaHttpsActivity)>
	//    3    7:return          
	}

	final LocalOtaHttpsActivity a;

	LocalOtaHttpsActivity$1(LocalOtaHttpsActivity localotahttpsactivity)
	{
		a = localotahttpsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LocalOtaHttpsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}