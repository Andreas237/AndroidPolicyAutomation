// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package android.support.customtabs:
//			CustomTabsSessionToken

static class CustomTabsSessionToken$MockCallback extends ICustomTabsCallback.Stub
{

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
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

	CustomTabsSessionToken$MockCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ICustomTabsCallback$Stub()>
	//    2    4:return          
	}
}
