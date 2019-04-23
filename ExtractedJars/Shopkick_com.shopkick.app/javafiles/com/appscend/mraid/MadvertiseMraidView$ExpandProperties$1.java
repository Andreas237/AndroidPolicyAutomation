// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.widget.ImageButton;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseMraidView

class MadvertiseMraidView$ExpandProperties$1
	implements Runnable
{

	public void run()
	{
		MadvertiseMraidView.access$300(this$0).setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MadvertiseMraidView$ExpandProperties this$1>
	//    2    4:getfield        #29  <Field MadvertiseMraidView MadvertiseMraidView$ExpandProperties.this$0>
	//    3    7:invokestatic    #33  <Method ImageButton MadvertiseMraidView.access$300(MadvertiseMraidView)>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #39  <Method void ImageButton.setImageDrawable(android.graphics.drawable.Drawable)>
	//    6   14:return          
	}

	final MadvertiseMraidView.ExpandProperties this$1;

	MadvertiseMraidView$ExpandProperties$1()
	{
		this$1 = MadvertiseMraidView.ExpandProperties.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MadvertiseMraidView$ExpandProperties this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
