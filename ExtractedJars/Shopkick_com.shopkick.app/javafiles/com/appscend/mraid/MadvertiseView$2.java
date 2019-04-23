// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.os.Handler;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseView

class MadvertiseView$2
	implements imationEndListener
{

	public void onAnimationEnd()
	{
		MadvertiseView.access$100(MadvertiseView.this).sendEmptyMessage(2);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MadvertiseView this$0>
	//    2    4:invokestatic    #23  <Method Handler MadvertiseView.access$100(MadvertiseView)>
	//    3    7:iconst_2        
	//    4    8:invokevirtual   #29  <Method boolean Handler.sendEmptyMessage(int)>
	//    5   11:pop             
	//    6   12:return          
	}

	final MadvertiseView this$0;

	MadvertiseView$2()
	{
		this$0 = MadvertiseView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MadvertiseView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
