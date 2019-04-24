// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.takeoverinapp;

import android.view.View;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.mixpanel.android.takeoverinapp:
//			TakeoverInAppActivity

class TakeoverInAppActivity$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TakeoverInAppActivity a>
	//    2    4:invokevirtual   #24  <Method void TakeoverInAppActivity.finish()>
		UpdateDisplayState.a(TakeoverInAppActivity.a(a));
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field TakeoverInAppActivity a>
	//    5   11:invokestatic    #27  <Method int TakeoverInAppActivity.a(TakeoverInAppActivity)>
	//    6   14:invokestatic    #32  <Method void UpdateDisplayState.a(int)>
	//    7   17:return          
	}

	final TakeoverInAppActivity a;

	TakeoverInAppActivity$1(TakeoverInAppActivity takeoverinappactivity)
	{
		a = takeoverinappactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TakeoverInAppActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
