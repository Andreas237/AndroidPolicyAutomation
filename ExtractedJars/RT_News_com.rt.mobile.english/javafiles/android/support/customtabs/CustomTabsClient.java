// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.*;
import android.content.pm.*;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import java.util.*;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsService, CustomTabsSession, CustomTabsServiceConnection, CustomTabsCallback

public class CustomTabsClient
{

	CustomTabsClient(ICustomTabsService icustomtabsservice, ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mService = icustomtabsservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field ICustomTabsService mService>
		mServiceComponentName = componentname;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field ComponentName mServiceComponentName>
	//    8   14:return          
	}

	public static boolean bindCustomTabsService(Context context, String s, CustomTabsServiceConnection customtabsserviceconnection)
	{
		Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
	//    0    0:new             #41  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "android.support.customtabs.action.CustomTabsService">
	//    3    6:invokespecial   #46  <Method void Intent(String)>
	//    4    9:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #52  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   14:ifne            23
			intent.setPackage(s);
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #56  <Method Intent Intent.setPackage(String)>
	//   11   22:pop             
		return context.bindService(intent, ((android.content.ServiceConnection) (customtabsserviceconnection)), 33);
	//   12   23:aload_0         
	//   13   24:aload_3         
	//   14   25:aload_2         
	//   15   26:bipush          33
	//   16   28:invokevirtual   #62  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//   17   31:ireturn         
	}

	public static boolean connectAndInitialize(Context context, String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		context = context.getApplicationContext();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #70  <Method Context Context.getApplicationContext()>
	//    6   10:astore_0        
		CustomTabsServiceConnection customtabsserviceconnection = new CustomTabsServiceConnection(context) {

			public final void onCustomTabsServiceConnected(ComponentName componentname, CustomTabsClient customtabsclient)
			{
				customtabsclient.warmup(0L);
			//    0    0:aload_2         
			//    1    1:lconst_0        
			//    2    2:invokevirtual   #25  <Method boolean CustomTabsClient.warmup(long)>
			//    3    5:pop             
				applicationContext.unbindService(((android.content.ServiceConnection) (this)));
			//    4    6:aload_0         
			//    5    7:getfield        #15  <Field Context val$applicationContext>
			//    6   10:aload_0         
			//    7   11:invokevirtual   #31  <Method void Context.unbindService(android.content.ServiceConnection)>
			//    8   14:return          
			}

			public final void onServiceDisconnected(ComponentName componentname)
			{
			//    0    0:return          
			}

			final Context val$applicationContext;

			
			{
				applicationContext = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Context val$applicationContext>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void CustomTabsServiceConnection()>
			//    5    9:return          
			}
		}
;
	//    7   11:new             #6   <Class CustomTabsClient$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #73  <Method void CustomTabsClient$1(Context)>
	//   11   19:astore_3        
		boolean flag;
		try
		{
			flag = bindCustomTabsService(context, s, ((CustomTabsServiceConnection) (customtabsserviceconnection)));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokestatic    #75  <Method boolean bindCustomTabsService(Context, String, CustomTabsServiceConnection)>
	//   16   26:istore_2        
		}
	//*  17   27:iload_2         
	//*  18   28:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  19   29:astore_0        
		{
			return false;
	//   20   30:iconst_0        
	//   21   31:ireturn         
		}
		return flag;
	}

	public static String getPackageName(Context context, List list)
	{
		return getPackageName(context, list, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #81  <Method String getPackageName(Context, List, boolean)>
	//    4    6:areturn         
	}

	public static String getPackageName(Context context, List list, boolean flag)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          4
		if(list == null)
	//*   3    6:aload_1         
	//*   4    7:ifnonnull       21
			context = ((Context) (new ArrayList()));
	//    5   10:new             #90  <Class ArrayList>
	//    6   13:dup             
	//    7   14:invokespecial   #91  <Method void ArrayList()>
	//    8   17:astore_0        
		else
	//*   9   18:goto            23
			context = ((Context) (list));
	//   10   21:aload_1         
	//   11   22:astore_0        
		Object obj1 = ((Object) (new Intent("android.intent.action.VIEW", Uri.parse("http://"))));
	//   12   23:new             #41  <Class Intent>
	//   13   26:dup             
	//   14   27:ldc1            #93  <String "android.intent.action.VIEW">
	//   15   29:ldc1            #95  <String "http://">
	//   16   31:invokestatic    #101 <Method Uri Uri.parse(String)>
	//   17   34:invokespecial   #104 <Method void Intent(String, Uri)>
	//   18   37:astore          5
		Object obj = ((Object) (context));
	//   19   39:aload_0         
	//   20   40:astore_3        
		if(!flag)
	//*  21   41:iload_2         
	//*  22   42:ifne            109
		{
			obj1 = ((Object) (packagemanager.resolveActivity(((Intent) (obj1)), 0)));
	//   23   45:aload           4
	//   24   47:aload           5
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #110 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   27   53:astore          5
			obj = ((Object) (context));
	//   28   55:aload_0         
	//   29   56:astore_3        
			if(obj1 != null)
	//*  30   57:aload           5
	//*  31   59:ifnull          109
			{
				obj1 = ((Object) (((ResolveInfo) (obj1)).activityInfo.packageName));
	//   32   62:aload           5
	//   33   64:getfield        #116 <Field ActivityInfo ResolveInfo.activityInfo>
	//   34   67:getfield        #122 <Field String ActivityInfo.packageName>
	//   35   70:astore          5
				obj = ((Object) (new ArrayList(((List) (context)).size() + 1)));
	//   36   72:new             #90  <Class ArrayList>
	//   37   75:dup             
	//   38   76:aload_0         
	//   39   77:invokeinterface #128 <Method int List.size()>
	//   40   82:iconst_1        
	//   41   83:iadd            
	//   42   84:invokespecial   #131 <Method void ArrayList(int)>
	//   43   87:astore_3        
				((List) (obj)).add(obj1);
	//   44   88:aload_3         
	//   45   89:aload           5
	//   46   91:invokeinterface #135 <Method boolean List.add(Object)>
	//   47   96:pop             
				if(list != null)
	//*  48   97:aload_1         
	//*  49   98:ifnull          109
					((List) (obj)).addAll(((java.util.Collection) (list)));
	//   50  101:aload_3         
	//   51  102:aload_1         
	//   52  103:invokeinterface #139 <Method boolean List.addAll(java.util.Collection)>
	//   53  108:pop             
			}
		}
		context = ((Context) (new Intent("android.support.customtabs.action.CustomTabsService")));
	//   54  109:new             #41  <Class Intent>
	//   55  112:dup             
	//   56  113:ldc1            #43  <String "android.support.customtabs.action.CustomTabsService">
	//   57  115:invokespecial   #46  <Method void Intent(String)>
	//   58  118:astore_0        
		for(list = ((List) (((List) (obj)).iterator())); ((Iterator) (list)).hasNext();)
	//*  59  119:aload_3         
	//*  60  120:invokeinterface #143 <Method Iterator List.iterator()>
	//*  61  125:astore_1        
	//*  62  126:aload_1         
	//*  63  127:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//*  64  132:ifeq            163
		{
			String s = (String)((Iterator) (list)).next();
	//   65  135:aload_1         
	//   66  136:invokeinterface #153 <Method Object Iterator.next()>
	//   67  141:checkcast       #155 <Class String>
	//   68  144:astore_3        
			((Intent) (context)).setPackage(s);
	//   69  145:aload_0         
	//   70  146:aload_3         
	//   71  147:invokevirtual   #56  <Method Intent Intent.setPackage(String)>
	//   72  150:pop             
			if(packagemanager.resolveService(((Intent) (context)), 0) != null)
	//*  73  151:aload           4
	//*  74  153:aload_0         
	//*  75  154:iconst_0        
	//*  76  155:invokevirtual   #158 <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//*  77  158:ifnull          126
				return s;
	//   78  161:aload_3         
	//   79  162:areturn         
		}

		return null;
	//   80  163:aconst_null     
	//   81  164:areturn         
	}

	public Bundle extraCommand(String s, Bundle bundle)
	{
		try
		{
			s = ((String) (mService.extraCommand(s, bundle)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ICustomTabsService mService>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #167 <Method Bundle ICustomTabsService.extraCommand(String, Bundle)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
	//*   8   14:aconst_null     
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Bundle) (s));
	//*  10   16:astore_1        
	//*  11   17:goto            14
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
	//    0    0:new             #8   <Class CustomTabsClient$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #172 <Method void CustomTabsClient$2(CustomTabsClient, CustomTabsCallback)>
	//    5    9:astore_1        
		boolean flag;
		try
		{
			flag = mService.newSession(((ICustomTabsCallback) (callback)));
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field ICustomTabsService mService>
	//    8   14:aload_1         
	//    9   15:invokeinterface #175 <Method boolean ICustomTabsService.newSession(ICustomTabsCallback)>
	//   10   20:istore_2        
		}
	//*  11   21:iload_2         
	//*  12   22:ifne            27
	//*  13   25:aconst_null     
	//*  14   26:areturn         
	//*  15   27:new             #177 <Class CustomTabsSession>
	//*  16   30:dup             
	//*  17   31:aload_0         
	//*  18   32:getfield        #33  <Field ICustomTabsService mService>
	//*  19   35:aload_1         
	//*  20   36:aload_0         
	//*  21   37:getfield        #35  <Field ComponentName mServiceComponentName>
	//*  22   40:invokespecial   #180 <Method void CustomTabsSession(ICustomTabsService, ICustomTabsCallback, ComponentName)>
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
	//    1    1:getfield        #33  <Field ICustomTabsService mService>
	//    2    4:lload_1         
	//    3    5:invokeinterface #184 <Method boolean ICustomTabsService.warmup(long)>
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
