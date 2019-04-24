// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;

public class CustomTabsCallback
{

	public CustomTabsCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public void extraCallback(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onMessageChannelReady(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onNavigationEvent(int i, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onPostMessage(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onRelationshipValidationResult(int i, Uri uri, boolean flag, Bundle bundle)
	{
	//    0    0:return          
	}

	public static final int NAVIGATION_ABORTED = 4;
	public static final int NAVIGATION_FAILED = 3;
	public static final int NAVIGATION_FINISHED = 2;
	public static final int NAVIGATION_STARTED = 1;
	public static final int TAB_HIDDEN = 6;
	public static final int TAB_SHOWN = 5;
}
