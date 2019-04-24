// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.ViewTreeObserver;
import android.widget.TextView;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity

class BaseCleanActivity$5
	implements android.view.lobalLayoutListener
{

	public void onGlobalLayout()
	{
		a.q.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.lobalLayoutListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseCleanActivity a>
	//    2    4:getfield        #25  <Field TextView BaseCleanActivity.q>
	//    3    7:invokevirtual   #31  <Method ViewTreeObserver TextView.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		a.q.removeCallbacks(a.o);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field BaseCleanActivity a>
	//    8   18:getfield        #25  <Field TextView BaseCleanActivity.q>
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field BaseCleanActivity a>
	//   11   25:getfield        #41  <Field Runnable BaseCleanActivity.o>
	//   12   28:invokevirtual   #45  <Method boolean TextView.removeCallbacks(Runnable)>
	//   13   31:pop             
		a.q.post(a.o);
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field BaseCleanActivity a>
	//   16   36:getfield        #25  <Field TextView BaseCleanActivity.q>
	//   17   39:aload_0         
	//   18   40:getfield        #17  <Field BaseCleanActivity a>
	//   19   43:getfield        #41  <Field Runnable BaseCleanActivity.o>
	//   20   46:invokevirtual   #48  <Method boolean TextView.post(Runnable)>
	//   21   49:pop             
	//   22   50:return          
	}

	final BaseCleanActivity a;

	BaseCleanActivity$5(BaseCleanActivity basecleanactivity)
	{
		a = basecleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
