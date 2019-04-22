// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.*;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsService, CustomTabsSession, CustomTabsServiceConnection, CustomTabsCallback

public class CustomTabsClient
{

	CustomTabsClient(ICustomTabsService icustomtabsservice, ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mService = icustomtabsservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field ICustomTabsService mService>
		mServiceComponentName = componentname;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field ComponentName mServiceComponentName>
	//    8   14:return          
	}

	public static boolean bindCustomTabsService(Context context, String s, CustomTabsServiceConnection customtabsserviceconnection)
	{
		Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
	//    0    0:new             #39  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String "android.support.customtabs.action.CustomTabsService">
	//    3    6:invokespecial   #44  <Method void Intent(String)>
	//    4    9:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   14:ifne            23
			intent.setPackage(s);
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #54  <Method Intent Intent.setPackage(String)>
	//   11   22:pop             
		return context.bindService(intent, ((android.content.ServiceConnection) (customtabsserviceconnection)), 33);
	//   12   23:aload_0         
	//   13   24:aload_3         
	//   14   25:aload_2         
	//   15   26:bipush          33
	//   16   28:invokevirtual   #60  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//   17   31:ireturn         
	}

	public CustomTabsSession newSession(final CustomTabsCallback callback)
	{
		callback = ((CustomTabsCallback) (new ICustomTabsCallback.Stub() {

			public void extraCallback(final String callbackName, Bundle bundle)
				throws RemoteException
			{
				if(callback == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
			//*   2    4:ifnonnull       8
				{
					return;
			//    3    7:return          
				} else
				{
					mHandler.post(((_cls2) (bundle)). new Runnable() {

						public void run()
						{
							callback.extraCallback(callbackName, args);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field CustomTabsClient$2 this$1>
						//    2    4:getfield        #34  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #23  <Field String val$callbackName>
						//    5   11:aload_0         
						//    6   12:getfield        #25  <Field Bundle val$args>
						//    7   15:invokevirtual   #37  <Method void CustomTabsCallback.extraCallback(String, Bundle)>
						//    8   18:return          
						}

						final _cls2 this$1;
						final Bundle val$args;
						final String val$callbackName;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CustomTabsClient$2 this$1>
				callbackName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$callbackName>
				args = Bundle.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Bundle val$args>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
					}
);
			//    4    8:aload_0         
			//    5    9:getfield        #47  <Field Handler mHandler>
			//    6   12:new             #13  <Class CustomTabsClient$2$2>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:aload_1         
			//   10   18:aload_2         
			//   11   19:invokespecial   #55  <Method void CustomTabsClient$2$2(CustomTabsClient$2, String, Bundle)>
			//   12   22:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
			//   13   25:pop             
					return;
			//   14   26:return          
				}
			}

			public void onMessageChannelReady(Bundle bundle)
				throws RemoteException
			{
				if(callback == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
			//*   2    4:ifnonnull       8
				{
					return;
			//    3    7:return          
				} else
				{
					mHandler.post(((_cls3) (bundle)). new Runnable() {

						public void run()
						{
							callback.onMessageChannelReady(extras);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field CustomTabsClient$2 this$1>
						//    2    4:getfield        #30  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field Bundle val$extras>
						//    5   11:invokevirtual   #33  <Method void CustomTabsCallback.onMessageChannelReady(Bundle)>
						//    6   14:return          
						}

						final _cls2 this$1;
						final Bundle val$extras;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CustomTabsClient$2 this$1>
				extras = Bundle.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Bundle val$extras>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//    4    8:aload_0         
			//    5    9:getfield        #47  <Field Handler mHandler>
			//    6   12:new             #15  <Class CustomTabsClient$2$3>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:aload_1         
			//   10   18:invokespecial   #65  <Method void CustomTabsClient$2$3(CustomTabsClient$2, Bundle)>
			//   11   21:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
			//   12   24:pop             
					return;
			//   13   25:return          
				}
			}

			public void onNavigationEvent(final int navigationEvent, Bundle bundle)
			{
				if(callback == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
			//*   2    4:ifnonnull       8
				{
					return;
			//    3    7:return          
				} else
				{
					mHandler.post(((_cls1) (bundle)). new Runnable() {

						public void run()
						{
							callback.onNavigationEvent(navigationEvent, extras);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field CustomTabsClient$2 this$1>
						//    2    4:getfield        #34  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #23  <Field int val$navigationEvent>
						//    5   11:aload_0         
						//    6   12:getfield        #25  <Field Bundle val$extras>
						//    7   15:invokevirtual   #37  <Method void CustomTabsCallback.onNavigationEvent(int, Bundle)>
						//    8   18:return          
						}

						final _cls2 this$1;
						final Bundle val$extras;
						final int val$navigationEvent;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CustomTabsClient$2 this$1>
				navigationEvent = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$navigationEvent>
				extras = Bundle.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Bundle val$extras>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
					}
);
			//    4    8:aload_0         
			//    5    9:getfield        #47  <Field Handler mHandler>
			//    6   12:new             #11  <Class CustomTabsClient$2$1>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:iload_1         
			//   10   18:aload_2         
			//   11   19:invokespecial   #70  <Method void CustomTabsClient$2$1(CustomTabsClient$2, int, Bundle)>
			//   12   22:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
			//   13   25:pop             
					return;
			//   14   26:return          
				}
			}

			public void onPostMessage(final String message, Bundle bundle)
				throws RemoteException
			{
				if(callback == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
			//*   2    4:ifnonnull       8
				{
					return;
			//    3    7:return          
				} else
				{
					mHandler.post(((_cls4) (bundle)). new Runnable() {

						public void run()
						{
							callback.onPostMessage(message, extras);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field CustomTabsClient$2 this$1>
						//    2    4:getfield        #34  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #23  <Field String val$message>
						//    5   11:aload_0         
						//    6   12:getfield        #25  <Field Bundle val$extras>
						//    7   15:invokevirtual   #37  <Method void CustomTabsCallback.onPostMessage(String, Bundle)>
						//    8   18:return          
						}

						final _cls2 this$1;
						final Bundle val$extras;
						final String val$message;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CustomTabsClient$2 this$1>
				message = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$message>
				extras = Bundle.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Bundle val$extras>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
					}
);
			//    4    8:aload_0         
			//    5    9:getfield        #47  <Field Handler mHandler>
			//    6   12:new             #17  <Class CustomTabsClient$2$4>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:aload_1         
			//   10   18:aload_2         
			//   11   19:invokespecial   #72  <Method void CustomTabsClient$2$4(CustomTabsClient$2, String, Bundle)>
			//   12   22:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
			//   13   25:pop             
					return;
			//   14   26:return          
				}
			}

			public void onRelationshipValidationResult(final int relation, final Uri requestedOrigin, final boolean result, Bundle bundle)
				throws RemoteException
			{
				if(callback == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
			//*   2    4:ifnonnull       8
				{
					return;
			//    3    7:return          
				} else
				{
					mHandler.post(((_cls5) (bundle)). new Runnable() {

						public void run()
						{
							callback.onRelationshipValidationResult(relation, requestedOrigin, result, extras);
						//    0    0:aload_0         
						//    1    1:getfield        #25  <Field CustomTabsClient$2 this$1>
						//    2    4:getfield        #42  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
						//    3    7:aload_0         
						//    4    8:getfield        #27  <Field int val$relation>
						//    5   11:aload_0         
						//    6   12:getfield        #29  <Field Uri val$requestedOrigin>
						//    7   15:aload_0         
						//    8   16:getfield        #31  <Field boolean val$result>
						//    9   19:aload_0         
						//   10   20:getfield        #33  <Field Bundle val$extras>
						//   11   23:invokevirtual   #45  <Method void CustomTabsCallback.onRelationshipValidationResult(int, Uri, boolean, Bundle)>
						//   12   26:return          
						}

						final _cls2 this$1;
						final Bundle val$extras;
						final int val$relation;
						final Uri val$requestedOrigin;
						final boolean val$result;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field CustomTabsClient$2 this$1>
				relation = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field int val$relation>
				requestedOrigin = uri;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Uri val$requestedOrigin>
				result = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #31  <Field boolean val$result>
				extras = Bundle.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field Bundle val$extras>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
					}
);
			//    4    8:aload_0         
			//    5    9:getfield        #47  <Field Handler mHandler>
			//    6   12:new             #19  <Class CustomTabsClient$2$5>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:iload_1         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:aload           4
			//   13   22:invokespecial   #78  <Method void CustomTabsClient$2$5(CustomTabsClient$2, int, Uri, boolean, Bundle)>
			//   14   25:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
			//   15   28:pop             
					return;
			//   16   29:return          
				}
			}

			private Handler mHandler;
			final CustomTabsClient this$0;
			final CustomTabsCallback val$callback;

			
			{
				this$0 = CustomTabsClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field CustomTabsClient this$0>
				callback = customtabscallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field CustomTabsCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #34  <Method void ICustomTabsCallback$Stub()>
				mHandler = new Handler(Looper.getMainLooper());
			//    8   14:aload_0         
			//    9   15:new             #36  <Class Handler>
			//   10   18:dup             
			//   11   19:invokestatic    #42  <Method Looper Looper.getMainLooper()>
			//   12   22:invokespecial   #45  <Method void Handler(Looper)>
			//   13   25:putfield        #47  <Field Handler mHandler>
			//   14   28:return          
			}
		}
));
	//    0    0:new             #6   <Class CustomTabsClient$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #67  <Method void CustomTabsClient$2(CustomTabsClient, CustomTabsCallback)>
	//    5    9:astore_1        
		boolean flag;
		try
		{
			flag = mService.newSession(((ICustomTabsCallback) (callback)));
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field ICustomTabsService mService>
	//    8   14:aload_1         
	//    9   15:invokeinterface #72  <Method boolean ICustomTabsService.newSession(ICustomTabsCallback)>
	//   10   20:istore_2        
		}
	//*  11   21:iload_2         
	//*  12   22:ifne            27
	//*  13   25:aconst_null     
	//*  14   26:areturn         
	//*  15   27:new             #74  <Class CustomTabsSession>
	//*  16   30:dup             
	//*  17   31:aload_0         
	//*  18   32:getfield        #31  <Field ICustomTabsService mService>
	//*  19   35:aload_1         
	//*  20   36:aload_0         
	//*  21   37:getfield        #33  <Field ComponentName mServiceComponentName>
	//*  22   40:invokespecial   #77  <Method void CustomTabsSession(ICustomTabsService, ICustomTabsCallback, ComponentName)>
	//*  23   43:areturn         
		// Misplaced declaration of an exception variable
		catch(final CustomTabsCallback callback)
	//*  24   44:astore_1        
		{
			return null;
	//   25   45:aconst_null     
	//   26   46:areturn         
		}
		if(!flag)
			return null;
		else
			return new CustomTabsSession(mService, ((ICustomTabsCallback) (callback)), mServiceComponentName);
	}

	public boolean warmup(long l)
	{
		RemoteException remoteexception;
		boolean flag;
		try
		{
			flag = mService.warmup(l);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ICustomTabsService mService>
	//    2    4:lload_1         
	//    3    5:invokeinterface #81  <Method boolean ICustomTabsService.warmup(long)>
	//    4   10:istore_3        
		}
	//*   5   11:iload_3         
	//*   6   12:ireturn         
	//*   7   13:iconst_0        
	//*   8   14:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			return false;
		}
		return flag;
	//*   9   15:astore          4
	//*  10   17:goto            13
	}

	private final ICustomTabsService mService;
	private final ComponentName mServiceComponentName;
}
