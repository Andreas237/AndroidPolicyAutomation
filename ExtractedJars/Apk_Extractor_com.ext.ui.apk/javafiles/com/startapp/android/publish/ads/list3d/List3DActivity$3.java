// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.view.View;
import com.startapp.android.publish.adsCommon.c;

// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			List3DActivity

class List3DActivity$3
	implements android.view.ner
{

	public void onClick(View view)
	{
		c.b(((android.content.Context) (a)), a.b(), a.a());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List3DActivity a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field List3DActivity a>
	//    4    8:invokevirtual   #27  <Method String List3DActivity.b()>
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field List3DActivity a>
	//    7   15:invokevirtual   #30  <Method com.startapp.android.publish.adsCommon.d.b List3DActivity.a()>
	//    8   18:invokestatic    #35  <Method void c.b(android.content.Context, String, com.startapp.android.publish.adsCommon.d.b)>
		a.finish();
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field List3DActivity a>
	//   11   25:invokevirtual   #38  <Method void List3DActivity.finish()>
	//   12   28:return          
	}

	final List3DActivity a;

	List3DActivity$3(List3DActivity list3dactivity)
	{
		a = list3dactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field List3DActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
