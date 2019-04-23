// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package android.support.customtabs:
//			CustomTabsCallback, CustomTabsSessionToken, ICustomTabsCallback

class CustomTabsSessionToken$1 extends CustomTabsCallback
{

	public void extraCallback(String s, Bundle bundle)
	{
		try
		{
			mCallbackBinder.extraCallback(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CustomTabsSessionToken this$0>
	//    2    4:getfield        #26  <Field ICustomTabsCallback CustomTabsSessionToken.mCallbackBinder>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #30  <Method void ICustomTabsCallback.extraCallback(String, Bundle)>
			return;
	//    6   14:return          
		}
	//*   7   15:ldc1            #32  <String "CustomTabsSessionToken">
	//*   8   17:ldc1            #34  <String "RemoteException during ICustomTabsCallback transaction">
	//*   9   19:invokestatic    #40  <Method int Log.e(String, String)>
	//*  10   22:pop             
	//*  11   23:return          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
		}
	//*  12   24:astore_1        
	//*  13   25:goto            15
	}

	public void onMessageChannelReady(Bundle bundle)
	{
		try
		{
			mCallbackBinder.onMessageChannelReady(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CustomTabsSessionToken this$0>
	//    2    4:getfield        #26  <Field ICustomTabsCallback CustomTabsSessionToken.mCallbackBinder>
	//    3    7:aload_1         
	//    4    8:invokeinterface #44  <Method void ICustomTabsCallback.onMessageChannelReady(Bundle)>
			return;
	//    5   13:return          
		}
	//*   6   14:ldc1            #32  <String "CustomTabsSessionToken">
	//*   7   16:ldc1            #34  <String "RemoteException during ICustomTabsCallback transaction">
	//*   8   18:invokestatic    #40  <Method int Log.e(String, String)>
	//*   9   21:pop             
	//*  10   22:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
		}
	//*  11   23:astore_1        
	//*  12   24:goto            14
	}

	public void onNavigationEvent(int i, Bundle bundle)
	{
		try
		{
			mCallbackBinder.onNavigationEvent(i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CustomTabsSessionToken this$0>
	//    2    4:getfield        #26  <Field ICustomTabsCallback CustomTabsSessionToken.mCallbackBinder>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #48  <Method void ICustomTabsCallback.onNavigationEvent(int, Bundle)>
			return;
	//    6   14:return          
		}
	//*   7   15:ldc1            #32  <String "CustomTabsSessionToken">
	//*   8   17:ldc1            #34  <String "RemoteException during ICustomTabsCallback transaction">
	//*   9   19:invokestatic    #40  <Method int Log.e(String, String)>
	//*  10   22:pop             
	//*  11   23:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
		}
	//*  12   24:astore_2        
	//*  13   25:goto            15
	}

	public void onPostMessage(String s, Bundle bundle)
	{
		try
		{
			mCallbackBinder.onPostMessage(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CustomTabsSessionToken this$0>
	//    2    4:getfield        #26  <Field ICustomTabsCallback CustomTabsSessionToken.mCallbackBinder>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #51  <Method void ICustomTabsCallback.onPostMessage(String, Bundle)>
			return;
	//    6   14:return          
		}
	//*   7   15:ldc1            #32  <String "CustomTabsSessionToken">
	//*   8   17:ldc1            #34  <String "RemoteException during ICustomTabsCallback transaction">
	//*   9   19:invokestatic    #40  <Method int Log.e(String, String)>
	//*  10   22:pop             
	//*  11   23:return          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
		}
	//*  12   24:astore_1        
	//*  13   25:goto            15
	}

	public void onRelationshipValidationResult(int i, Uri uri, boolean flag, Bundle bundle)
	{
		try
		{
			mCallbackBinder.onRelationshipValidationResult(i, uri, flag, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CustomTabsSessionToken this$0>
	//    2    4:getfield        #26  <Field ICustomTabsCallback CustomTabsSessionToken.mCallbackBinder>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:aload           4
	//    7   12:invokeinterface #55  <Method void ICustomTabsCallback.onRelationshipValidationResult(int, Uri, boolean, Bundle)>
			return;
	//    8   17:return          
		}
	//*   9   18:ldc1            #32  <String "CustomTabsSessionToken">
	//*  10   20:ldc1            #34  <String "RemoteException during ICustomTabsCallback transaction">
	//*  11   22:invokestatic    #40  <Method int Log.e(String, String)>
	//*  12   25:pop             
	//*  13   26:return          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
		}
	//*  14   27:astore_2        
	//*  15   28:goto            18
	}

	final CustomTabsSessionToken this$0;

	CustomTabsSessionToken$1()
	{
		this$0 = CustomTabsSessionToken.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CustomTabsSessionToken this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void CustomTabsCallback()>
	//    5    9:return          
	}
}
