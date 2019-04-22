// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.os.Bundle;
import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			IHtmlInAppMessageActionListener

public class AppboyDefaultHtmlInAppMessageActionListener
	implements IHtmlInAppMessageActionListener
{

	public AppboyDefaultHtmlInAppMessageActionListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void onCloseClicked(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public boolean onCustomEventFired(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onNewsfeedClicked(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
