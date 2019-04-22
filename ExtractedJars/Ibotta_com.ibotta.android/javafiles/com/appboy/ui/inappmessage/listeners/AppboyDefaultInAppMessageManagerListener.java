// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.InAppMessageCloser;
import com.appboy.ui.inappmessage.InAppMessageOperation;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			IInAppMessageManagerListener

public class AppboyDefaultInAppMessageManagerListener
	implements IInAppMessageManagerListener
{

	public AppboyDefaultInAppMessageManagerListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iinappmessage)
	{
		return InAppMessageOperation.DISPLAY_NOW;
	//    0    0:getstatic       #19  <Field InAppMessageOperation InAppMessageOperation.DISPLAY_NOW>
	//    1    3:areturn         
	}

	public boolean onInAppMessageButtonClicked(MessageButton messagebutton, InAppMessageCloser inappmessagecloser)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onInAppMessageDismissed(IInAppMessage iinappmessage)
	{
	//    0    0:return          
	}

	public boolean onInAppMessageReceived(IInAppMessage iinappmessage)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
