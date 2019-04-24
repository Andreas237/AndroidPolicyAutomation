// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.irobot.home:
//			PartsDetailListActivity_

class PartsDetailListActivity_$2
	implements android.widget.ener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		a.f(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PartsDetailListActivity_ a>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #26  <Method void PartsDetailListActivity_.f(int)>
	//    4    8:return          
	}

	final PartsDetailListActivity_ a;

	PartsDetailListActivity_$2(PartsDetailListActivity_ partsdetaillistactivity_)
	{
		a = partsdetaillistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field PartsDetailListActivity_ a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
