// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.ProgressBar;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RxProgressBar

static final class RxProgressBar$6
	implements Action1
{

	public void call(Integer integer)
	{
		val$view.setSecondaryProgress(integer.intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ProgressBar val$view>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
	//    4    8:invokevirtual   #36  <Method void ProgressBar.setSecondaryProgress(int)>
	//    5   11:return          
	}

	public volatile void call(Object obj)
	{
		call((Integer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Integer>
	//    3    5:invokevirtual   #39  <Method void call(Integer)>
	//    4    8:return          
	}

	final ProgressBar val$view;

	RxProgressBar$6(ProgressBar progressbar)
	{
		val$view = progressbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ProgressBar val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
