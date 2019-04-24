// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.irobot.home:
//			NotificationDetailsActivity

class NotificationDetailsActivity$1
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0 && NotificationDetailsActivity.a(b))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #33  <Method int MotionEvent.getAction()>
	//*   2    4:ifne            34
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field NotificationDetailsActivity b>
	//*   5   11:invokestatic    #36  <Method boolean NotificationDetailsActivity.a(NotificationDetailsActivity)>
	//*   6   14:ifeq            34
		{
			a.performClick();
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field View a>
	//    9   21:invokevirtual   #42  <Method boolean View.performClick()>
	//   10   24:pop             
			NotificationDetailsActivity.a(b, false);
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field NotificationDetailsActivity b>
	//   13   29:iconst_0        
	//   14   30:invokestatic    #45  <Method boolean NotificationDetailsActivity.a(NotificationDetailsActivity, boolean)>
	//   15   33:pop             
		}
		return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	final View a;
	final NotificationDetailsActivity b;

	NotificationDetailsActivity$1(NotificationDetailsActivity notificationdetailsactivity, View view)
	{
		b = notificationdetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field NotificationDetailsActivity b>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
