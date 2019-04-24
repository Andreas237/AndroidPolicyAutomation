// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.widget.RadioGroup;

// Referenced classes of package com.irobot.home.fragments:
//			ba

class ba$2
	implements android.widget.Group.OnCheckedChangeListener
{

	public void onCheckedChanged(RadioGroup radiogroup, int i)
	{
		ba.a(a, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ba a>
	//    2    4:iload_2         
	//    3    5:invokestatic    #25  <Method void ba.a(ba, int)>
	//    4    8:return          
	}

	final ba a;

	ba$2(ba ba1)
	{
		a = ba1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ba a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
