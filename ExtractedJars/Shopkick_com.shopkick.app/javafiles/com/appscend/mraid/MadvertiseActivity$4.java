// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.view.View;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseActivity

class MadvertiseActivity$4
	implements android.view.View$OnClickListener
{

	public void onClick(View view)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MadvertiseActivity this$0>
	//    2    4:invokevirtual   #26  <Method void MadvertiseActivity.finish()>
	//    3    7:return          
	}

	final MadvertiseActivity this$0;

	MadvertiseActivity$4()
	{
		this$0 = MadvertiseActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MadvertiseActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
