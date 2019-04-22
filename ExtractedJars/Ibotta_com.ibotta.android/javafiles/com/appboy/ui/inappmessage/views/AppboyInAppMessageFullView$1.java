// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.view.View;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageFullView

class AppboyInAppMessageFullView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		AppboyLogger.d(AppboyInAppMessageFullView.access$000(), "Passing scrollView click event to message clickable view.");
	//    0    0:invokestatic    #27  <Method String AppboyInAppMessageFullView.access$000()>
	//    1    3:ldc1            #29  <String "Passing scrollView click event to message clickable view.">
	//    2    5:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		getMessageClickableView().performClick();
	//    4    9:aload_0         
	//    5   10:getfield        #17  <Field AppboyInAppMessageFullView this$0>
	//    6   13:invokevirtual   #39  <Method View AppboyInAppMessageFullView.getMessageClickableView()>
	//    7   16:invokevirtual   #45  <Method boolean View.performClick()>
	//    8   19:pop             
	//    9   20:return          
	}

	final AppboyInAppMessageFullView this$0;

	AppboyInAppMessageFullView$1()
	{
		this$0 = AppboyInAppMessageFullView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyInAppMessageFullView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
