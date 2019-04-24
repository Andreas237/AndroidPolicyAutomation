// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity, OtaMqttActivity_

class DeveloperActivity$8
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		OtaMqttActivity_.a(((android.content.Context) (a))).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DeveloperActivity a>
	//    2    4:invokestatic    #27  <Method OtaMqttActivity_$a OtaMqttActivity_.a(android.content.Context)>
	//    3    7:invokevirtual   #32  <Method org.androidannotations.api.a.e OtaMqttActivity_$a.a()>
	//    4   10:pop             
		a.finish();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field DeveloperActivity a>
	//    7   15:invokevirtual   #35  <Method void DeveloperActivity.finish()>
	//    8   18:return          
	}

	final DeveloperActivity a;

	DeveloperActivity$8(DeveloperActivity developeractivity)
	{
		a = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeveloperActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
