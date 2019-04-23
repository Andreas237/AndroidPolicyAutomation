// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.util.Log;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback, CustomTabsSession, CustomTabsCallback

public class CustomTabsSessionToken
{
	static class MockCallback extends ICustomTabsCallback.Stub
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

		MockCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ICustomTabsCallback$Stub()>
		//    2    4:return          
		}
	}


	CustomTabsSessionToken(ICustomTabsCallback icustomtabscallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mCallbackBinder = icustomtabscallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ICustomTabsCallback mCallbackBinder>
	//    5    9:aload_0         
	//    6   10:new             #6   <Class CustomTabsSessionToken$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #27  <Method void CustomTabsSessionToken$1(CustomTabsSessionToken)>
	//   10   18:putfield        #29  <Field CustomTabsCallback mCallback>
	//   11   21:return          
	}

	public static CustomTabsSessionToken createMockSessionTokenForTesting()
	{
		return new CustomTabsSessionToken(((ICustomTabsCallback) (new MockCallback())));
	//    0    0:new             #2   <Class CustomTabsSessionToken>
	//    1    3:dup             
	//    2    4:new             #8   <Class CustomTabsSessionToken$MockCallback>
	//    3    7:dup             
	//    4    8:invokespecial   #34  <Method void CustomTabsSessionToken$MockCallback()>
	//    5   11:invokespecial   #36  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
	//    6   14:areturn         
	}

	public static CustomTabsSessionToken getSessionTokenFromIntent(Intent intent)
	{
		intent = ((Intent) (BundleCompat.getBinder(intent.getExtras(), "android.support.customtabs.extra.SESSION")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #47  <String "android.support.customtabs.extra.SESSION">
	//    3    6:invokestatic    #53  <Method IBinder BundleCompat.getBinder(Bundle, String)>
	//    4    9:astore_0        
		if(intent == null)
	//*   5   10:aload_0         
	//*   6   11:ifnonnull       16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		else
			return new CustomTabsSessionToken(ICustomTabsCallback.Stub.asInterface(((IBinder) (intent))));
	//    9   16:new             #2   <Class CustomTabsSessionToken>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:invokestatic    #59  <Method ICustomTabsCallback ICustomTabsCallback$Stub.asInterface(IBinder)>
	//   13   24:invokespecial   #36  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
	//   14   27:areturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof CustomTabsSessionToken))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class CustomTabsSessionToken>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ((Object) (((CustomTabsSessionToken)obj).getCallbackBinder())).equals(((Object) (mCallbackBinder.asBinder())));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class CustomTabsSessionToken>
	//    7   13:invokevirtual   #65  <Method IBinder getCallbackBinder()>
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field ICustomTabsCallback mCallbackBinder>
	//   10   20:invokeinterface #70  <Method IBinder ICustomTabsCallback.asBinder()>
	//   11   25:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//   12   28:ireturn         
	}

	public CustomTabsCallback getCallback()
	{
		return mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CustomTabsCallback mCallback>
	//    2    4:areturn         
	}

	IBinder getCallbackBinder()
	{
		return mCallbackBinder.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ICustomTabsCallback mCallbackBinder>
	//    2    4:invokeinterface #70  <Method IBinder ICustomTabsCallback.asBinder()>
	//    3    9:areturn         
	}

	public int hashCode()
	{
		return ((Object) (getCallbackBinder())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method IBinder getCallbackBinder()>
	//    2    4:invokevirtual   #78  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isAssociatedWith(CustomTabsSession customtabssession)
	{
		return ((Object) (customtabssession.getBinder())).equals(((Object) (mCallbackBinder)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method IBinder CustomTabsSession.getBinder()>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ICustomTabsCallback mCallbackBinder>
	//    4    8:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//    5   11:ireturn         
	}

	private static final String TAG = "CustomTabsSessionToken";
	private final CustomTabsCallback mCallback = new CustomTabsCallback() {

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
;
	final ICustomTabsCallback mCallbackBinder;
}
