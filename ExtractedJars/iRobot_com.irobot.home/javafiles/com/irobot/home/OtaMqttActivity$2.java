// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.ProgressBar;

// Referenced classes of package com.irobot.home:
//			OtaMqttActivity

class OtaMqttActivity$2
	implements Runnable
{

	public void run()
	{
		a.d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field OtaMqttActivity a>
	//    2    4:getfield        #25  <Field ProgressBar OtaMqttActivity.d>
	//    3    7:bipush          8
	//    4    9:invokevirtual   #31  <Method void ProgressBar.setVisibility(int)>
	//    5   12:return          
	}

	final OtaMqttActivity a;

	OtaMqttActivity$2(OtaMqttActivity otamqttactivity)
	{
		a = otamqttactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field OtaMqttActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
