// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import com.appboy.support.AppboyFileUtils;
import com.appboy.support.WebContentUtils;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			AppboyInAppMessageViewLifecycleListener

class AppboyInAppMessageViewLifecycleListener$1
	implements Runnable
{

	public void run()
	{
		android.app.Activity activity = AppboyInAppMessageManager.getInstance().getActivity();
	//    0    0:invokestatic    #27  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    1    3:invokevirtual   #31  <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//    2    6:astore_1        
		if(activity != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          18
			AppboyFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(((android.content.Context) (activity))));
	//    5   11:aload_1         
	//    6   12:invokestatic    #37  <Method java.io.File WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(android.content.Context)>
	//    7   15:invokestatic    #43  <Method void AppboyFileUtils.deleteFileOrDirectory(java.io.File)>
	//    8   18:return          
	}

	final AppboyInAppMessageViewLifecycleListener this$0;

	AppboyInAppMessageViewLifecycleListener$1()
	{
		this$0 = AppboyInAppMessageViewLifecycleListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyInAppMessageViewLifecycleListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
